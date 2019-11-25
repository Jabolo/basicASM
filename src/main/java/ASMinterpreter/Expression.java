package ASMinterpreter;

import org.antlr.v4.runtime.tree.ParseTree;

public class Expression {

    Integer value;
    ParseTree tree;
    MemorySingleton memory = MemorySingleton.getInstance();
    Expression children[];

    public Expression(ParseTree expression) throws Exception {
        tree = expression;
        children = new Expression[tree.getChildCount()];
//        for (ASMinterpreter.Expression child: children
//             ) {
//            child = new ASMinterpreter.Expression(...);
//        }
        for (int i = 0; i < tree.getChildCount(); i++) {
            children[i] = new Expression(tree.getChild(i));
        }
        setValue();
    }

    private void setValue() throws Exception {
    if(children.length == 0) {
        //this.value = Integer.valueOf(tree.getText());
        this.value = getInteger(tree.getText());
    }
    else if(children.length == 1)
    {
        this.value = children[0].getValue();
    }
    else if(children.length==3){
        if(children[0].tree.getText().equals("(") && children[2].tree.getText().equals(")")){
            this.value = children[1].getValue();
        }
        else{
            Integer left = children[0].getValue();
            Integer right = children[2].getValue();
            String operator = children[1].tree.getText();
            if(operator.equals("+")) this.value = left+right;
            else if(operator.equals("-")) this.value = left-right;
            else if(operator.equals("*")) this.value = left*right;
            else if(operator.equals("/")){
                if(right !=0) this.value = left/right;
                else throw new ErrorInInstruction();
            }
        }

    }
    else throw new ErrorInInstruction();
    }

    private Integer getInteger(String x) {
        try {
            return Integer.valueOf(x);
        } catch (Exception ex){
        if (x.equals("%eax")) return memory.getEax();
        else if (x.equals("%ebx")) return memory.getEbx();
        else if (x.equals("%ecx")) return memory.getEcx();
        else if (x.equals("%edx")) return memory.getEdx();
        else return null;
    }
    }

    public Integer getValue() {
        return this.value;
    }


}

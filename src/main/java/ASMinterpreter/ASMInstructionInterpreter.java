package ASMinterpreter;

import org.antlr.v4.runtime.tree.ParseTree;

public class ASMInstructionInterpreter {
    MemorySingleton memory = MemorySingleton.getInstance();

    public void startInterpretingInstruction(ParseTree instruction) throws Exception {
        String instr = instruction.getChild(0).getText();
        if(instr.equals("push")){
            Integer result = new Expression(instruction.getChild(1)).getValue();
            memory.push(result);
        }
        else if(instr.equals("int 0x80")){
            Integer result = memory.pop();
            if(result == null) System.out.println("???");
            else System.out.println(result);
        }
        else if(instr.equals("mov")){
            //if(instruction.getChild(3).getChild())
            Integer result = new Expression(instruction.getChild(1)).getValue();
            setRegisterValue(instruction.getChild(3).getText(), result);
        }
        else if(instr.equals("xor")){
            Integer left = new Expression(instruction.getChild(1)).getValue();
            Integer right = new Expression(instruction.getChild(3)).getValue();
            if(left == right) setRegisterValue(instruction.getChild(3).getText(), 0);
            else setRegisterValue(instruction.getChild(3).getText(), left^right);
        }
    }

    private void setRegisterValue(String register, Integer result) {
        if(register.equals("%eax")) memory.setEax(result);
        else if(register.equals("%ebx")) memory.setEbx(result);
        else if(register.equals("%ecx")) memory.setEcx(result);
        else if(register.equals("%edx")) memory.setEdx(result);
    }
//    private Integer getRegisterValue(String register)
//    {
//        if (register.equals("%eax")) return memory.getEax();
//        else if (register.equals("%ebx")) return memory.getEbx();
//        else if (register.equals("%ecx")) return memory.getEcx();
//        else if (register.equals("%edx")) return memory.getEdx();
//        else return 0;
//    }
}

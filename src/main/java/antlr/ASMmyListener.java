package antlr;

public class ASMmyListener extends ASMgrammarBaseListener {

    @Override
    public void enterExpression(ASMgrammarParser.ExpressionContext ctx) {
    }

    @Override
    public void enterFactor(ASMgrammarParser.FactorContext ctx) {
//        Integer val;
////        System.out.println(ctx.getText());
////        if(ctx.getChild(0).getText() == "(" && ctx.getChild(2).getText() == ")")
////            System.out.println(ctx.getChild(1).getText());
    }

}

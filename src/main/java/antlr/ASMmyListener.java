package antlr;

public class ASMmyListener extends ASMgrammarBaseListener {
    @Override
    public void enterNumber(ASMgrammarParser.NumberContext ctx) {
        System.out.println(ctx.getText());
    }
}

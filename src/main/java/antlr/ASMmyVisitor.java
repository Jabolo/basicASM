package antlr;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class ASMmyVisitor implements ASMgrammarVisitor {

    @Override
    public Object visitInstruction(ASMgrammarParser.InstructionContext ctx) {
        return null;
    }

    @Override
    public Object visitExpression(ASMgrammarParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitTerm(ASMgrammarParser.TermContext ctx) {
        return null;
    }

    @Override
    public Object visitFactor(ASMgrammarParser.FactorContext ctx) {
        System.out.println("sasa");
        if (ctx.getChild(0).getText() == "(")
            return visit(ctx.getChild(1));
        else
            return visit(ctx.getChild(0));
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return visit(parseTree);
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

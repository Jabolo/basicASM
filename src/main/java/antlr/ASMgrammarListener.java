// Generated from C:/Users/michal/IdeaProjects/projectASM/src/main\ASMgrammar.g4 by ANTLR 4.7.2
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ASMgrammarParser}.
 */
public interface ASMgrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ASMgrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(ASMgrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMgrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(ASMgrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ASMgrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMgrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ASMgrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ASMgrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMgrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ASMgrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ASMgrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ASMgrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ASMgrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ASMgrammarParser.FactorContext ctx);
}
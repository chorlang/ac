// Generated from chor.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link chorParser}.
 */
public interface chorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link chorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(chorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link chorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(chorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link chorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(chorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link chorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(chorParser.ExprContext ctx);
}
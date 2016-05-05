// Generated from /Users/thesave/projects/chor/src/antlr/Chor.g4 by ANTLR 4.5.3
package org.chor.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ChorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ChorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ChorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(ChorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ChorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ChorParser.ExprContext ctx);
}
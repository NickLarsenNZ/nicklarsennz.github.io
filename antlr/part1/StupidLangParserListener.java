// Generated from StupidLangParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StupidLangParser}.
 */
public interface StupidLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(StupidLangParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(StupidLangParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(StupidLangParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(StupidLangParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StupidLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StupidLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(StupidLangParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(StupidLangParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#times}.
	 * @param ctx the parse tree
	 */
	void enterTimes(StupidLangParser.TimesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#times}.
	 * @param ctx the parse tree
	 */
	void exitTimes(StupidLangParser.TimesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(StupidLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(StupidLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link StupidLangParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(StupidLangParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link StupidLangParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(StupidLangParser.StringContext ctx);
}
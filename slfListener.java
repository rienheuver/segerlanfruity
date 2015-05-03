// Generated from slf.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link slfParser}.
 */
public interface slfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(slfParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(slfParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(slfParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(slfParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(slfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(slfParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(slfParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(slfParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(slfParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(slfParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void enterRead_expression(slfParser.Read_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#read_expression}.
	 * @param ctx the parse tree
	 */
	void exitRead_expression(slfParser.Read_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrint_expression(slfParser.Print_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#print_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrint_expression(slfParser.Print_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void enterIf_expression(slfParser.If_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#if_expression}.
	 * @param ctx the parse tree
	 */
	void exitIf_expression(slfParser.If_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void enterCompound_expression(slfParser.Compound_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#compound_expression}.
	 * @param ctx the parse tree
	 */
	void exitCompound_expression(slfParser.Compound_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_expression(slfParser.Assignment_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#assignment_expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_expression(slfParser.Assignment_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(slfParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link slfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(slfParser.LiteralContext ctx);
}
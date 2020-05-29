// Generated from com\custodio\alguma\gerador2\Alguma.g4 by ANTLR 4.7.2
package com.custodio.alguma.gerador2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaParser}.
 */
public interface AlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(AlgumaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(AlgumaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterTermoAritmetico(AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitTermoAritmetico(AlgumaParser.TermoAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void enterFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#fatorAritmetico}.
	 * @param ctx the parse tree
	 */
	void exitFatorAritmetico(AlgumaParser.FatorAritmeticoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#expressaoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoRelacional(AlgumaParser.ExpressaoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void enterTermoRelacional(AlgumaParser.TermoRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#termoRelacional}.
	 * @param ctx the parse tree
	 */
	void exitTermoRelacional(AlgumaParser.TermoRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(AlgumaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoAtribuicao(AlgumaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoAtribuicao(AlgumaParser.ComandoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterComandoEntrada(AlgumaParser.ComandoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitComandoEntrada(AlgumaParser.ComandoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void enterComandoSaida(AlgumaParser.ComandoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoSaida}.
	 * @param ctx the parse tree
	 */
	void exitComandoSaida(AlgumaParser.ComandoSaidaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void enterComandoCondicao(AlgumaParser.ComandoCondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoCondicao}.
	 * @param ctx the parse tree
	 */
	void exitComandoCondicao(AlgumaParser.ComandoCondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void enterComandoRepeticao(AlgumaParser.ComandoRepeticaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#comandoRepeticao}.
	 * @param ctx the parse tree
	 */
	void exitComandoRepeticao(AlgumaParser.ComandoRepeticaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void enterSubAlgoritmo(AlgumaParser.SubAlgoritmoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaParser#subAlgoritmo}.
	 * @param ctx the parse tree
	 */
	void exitSubAlgoritmo(AlgumaParser.SubAlgoritmoContext ctx);
}
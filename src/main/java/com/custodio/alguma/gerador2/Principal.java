/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.custodio.alguma.gerador2;
import com.custodio.alguma.gerador2.AlgumaParser.ProgramaContext;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 *
 * @author celson
 */
public class Principal {
    public static void main(String args[]) throws IOException {
        CharStream cs = CharStreams.fromFileName(args[0]);
        AlgumaLexer lexer = new AlgumaLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AlgumaParser parser = new AlgumaParser(tokens);
        ProgramaContext arvore = parser.programa();
        AlgumaSemantico as = new AlgumaSemantico();
        as.visitPrograma(arvore);
        AlgumaSemanticoUtils.errosSemanticos.forEach((s) -> System.out.println(s));
        
        if(AlgumaSemanticoUtils.errosSemanticos.isEmpty()) {
            AlgumaGeradorC agc = new AlgumaGeradorC();
            agc.visitPrograma(arvore);
            try(PrintWriter pw = new PrintWriter(args[1])) {
                pw.print(agc.saida.toString());
            }
            
            AlgumaGeradorPcodigo agp = new AlgumaGeradorPcodigo();
            String pcod = agp.visitPrograma(arvore);
            try(PrintWriter pw = new PrintWriter(args[2])) {
                pw.print(pcod);
            }
        }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.util;

import atena.respostas.Respostas;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Karlos Oliveira
 */
public class Relatorios {
    
    public static void gerarRelatorioUsuarios(List respostas, Respostas resposta) {
        // criação do documento
        Document document = new Document();
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
        String diretorioPdf = System.getProperty("user.home") + "/AppData/Local/Temp/sysclin_relatorio_tmp.pdf";

        try {

            PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
            document.open();

//            document.add(new Paragraph("Sysclin - Relatório de usuários", boldFont));
//            document.add(new Paragraph("Data de emissão: " + Util.dateToString(new Date()), boldFont));
//            document.add(new Paragraph("Emitido por: " + resposta.getNome(), boldFont));
//            document.add(new Paragraph(" "));

            PdfPTable tabela = new PdfPTable(4);

            PdfPCell celula = new PdfPCell(new Phrase("Lista de usuários - " + respostas.size() + " resultados encontrados"));

            celula.setColspan(4);
            tabela.addCell(celula);

            PdfPCell celulaTituloNome = new PdfPCell(new Phrase("nome", boldFont));
            PdfPCell celulaTituloCpf = new PdfPCell(new Phrase("cpf", boldFont));
            PdfPCell celulaTituloEmail = new PdfPCell(new Phrase("email", boldFont));
            PdfPCell celulaTituloTelefone = new PdfPCell(new Phrase("telefone", boldFont));

            tabela.addCell(celulaTituloNome);
            tabela.addCell(celulaTituloCpf);
            tabela.addCell(celulaTituloEmail);
            tabela.addCell(celulaTituloTelefone);

            for (Object objResposta : respostas) {

                Respostas resp = (Respostas) objResposta;

//                PdfPCell celulaNome = new PdfPCell(new Phrase(usuario.getNome()));
//                PdfPCell celulaCpf = new PdfPCell(new Phrase(usuario.getCpf()));
//                PdfPCell celulaEmail = new PdfPCell(new Phrase(usuario.getEmail()));
//                PdfPCell celulaTelefone = new PdfPCell(new Phrase(usuario.getTelefone().equals("(  )     -") ? "Vazio" : usuario.getTelefone()));
//                System.out.println(usuario.getTelefone());

//                tabela.addCell(celulaNome);
//                tabela.addCell(celulaCpf);
//                tabela.addCell(celulaEmail);
//                tabela.addCell(celulaTelefone);
            }

            tabela.setWidthPercentage(100);
            document.add(tabela);

            Desktop.getDesktop().open(new File(diretorioPdf));
        } catch (DocumentException | IOException de) {
            System.err.println(de.getMessage());
        }
        document.close();
    }
    
}

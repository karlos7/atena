/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.util;

import atena.respostas.Respostas;
import atena.telas.RelatorioGeral;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Karlos Oliveira
 */
public class Relatorios {

    private static SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy(HH-mm-ss)");

    public static void gerarRelatorio(List relatoriogeral, Respostas r) {
        // criação do documento
        Document document = new Document(PageSize.A4);
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD);
        Font normal = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL);
        String diretorioPdf = "resultadoVestibular" + formatarData.format(new Date()) + ".pdf";

        try {

            try {
                PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            PdfPTable tabela = new PdfPTable(2); //cria uma tabela com 2 colunas
        PdfPCell celula1;
        try {
            celula1 = new PdfPCell(Image.getInstance("fvs.png")); //cria uma celula com parametro de Image.getInstance com o caminho da imagem do cabeçalho
            Paragraph p = new Paragraph("ATENA - VESTIBULAR FVS - " + r.getGabarito().getProcessoSeletivo().getProcessoSeletivo(), boldFont);
            PdfPCell celula2 = new PdfPCell(p); //adiciona o paragrafo com o titulo na segunda celula.
            celula1.setBorder(-1); // aqui vc tira as bordas da celula
            
            celula2.setBorder(-1);
            tabela.addCell(celula1); //aqui adiciona as celulas na tabela.
            tabela.addCell(celula2);
            document.add(tabela); // coloca a tabela na pagina do PDF.
        } catch (BadElementException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Relatorios.class.getName()).log(Level.SEVERE, null, ex);
        }
            try {
                Paragraph linha = new Paragraph();
                linha.setAlignment(Element.ALIGN_CENTER);
                document.add(linha);
                document.add(new Paragraph(" "));

            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                for (Object obj : relatoriogeral) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato(), normal);
                    linha.setAlignment(Element.ALIGN_JUSTIFIED);
                    document.add(linha);
                }

            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                document.add(new Paragraph(" "));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }

            Desktop.getDesktop().open(new File(diretorioPdf));
        } catch (IOException de) {
            System.err.println(de.getMessage());
        }

        

        document.close();
    }

    public static void gerarRelatorioGeral(List<Respostas> respAdm, List<Respostas> respCont, List<Respostas> respAds, List<Respostas> respServico, List<Respostas> respDireito, List<Respostas> respEdFisica, List<Respostas> respEnfermagem, List<Respostas> respFisio, List<Respostas> respPsico, Respostas respostas) {

    }

}

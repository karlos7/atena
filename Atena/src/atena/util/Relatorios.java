/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.util;

import atena.respostas.Respostas;
import atena.telas.RelatorioGeral;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
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
import javax.swing.JOptionPane;

/**
 *
 * @author Karlos Oliveira
 */
public class Relatorios {

    private static SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy(HH-mm-ss)");
    private static Document document = new Document(PageSize.A4);

    private static void gerarCabecalho(Respostas r, Document d) {
        Font boldFont = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        Font fontLinha = new Font(Font.FontFamily.TIMES_ROMAN, 20, Font.BOLD);
        fontLinha.setColor(41, 72, 59);
        Font fontLinhaMenor = new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD);
        fontLinhaMenor.setColor(BaseColor.BLUE);

        d.open();
        PdfPTable tabela = new PdfPTable(1);
        PdfPCell celula1;
        try {
            celula1 = new PdfPCell(Image.getInstance("src\\atena\\imagens\\fvs.png"));
            celula1.setBorder(-1);
            celula1.setIndent(155);
            tabela.addCell(celula1);
            d.add(tabela);
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
            Paragraph titulo = new Paragraph("VESTIBULAR FVS - " + r.getGabarito().getProcessoSeletivo().getProcessoSeletivo(), boldFont);
            titulo.setAlignment(Element.ALIGN_CENTER);
            d.add(titulo);

            Paragraph linha0 = new Paragraph("________________________________", fontLinhaMenor);
            linha0.setAlignment(Element.ALIGN_CENTER);
            linha0.setSpacingAfter(-21);
            d.add(linha0);

            Paragraph linha2 = new Paragraph("______________________________________________", fontLinha);
            linha2.setAlignment(Element.ALIGN_CENTER);
            d.add(linha2);

            Paragraph linha3 = new Paragraph("________________________________", fontLinhaMenor);
            linha3.setAlignment(Element.ALIGN_CENTER);
            linha3.setSpacingBefore(-16);
            d.add(linha3);

            Paragraph linha = new Paragraph();
            linha.setAlignment(Element.ALIGN_CENTER);
            d.add(linha);
            d.add(new Paragraph(" "));

        } catch (com.itextpdf.text.DocumentException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        //d.close();
    }

    public static void gerarRelatorio(List relatoriogeral, Respostas r) {
        Font normal = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL);
        String diretorioPdf = "resultadoVestibular" + formatarData.format(new Date()) + ".pdf";

        try {

            try {
                PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            gerarCabecalho(r, document);

            try {
                for (Object obj : relatoriogeral) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato(), normal);
                    linha.setAlignment(Element.ALIGN_JUSTIFIED);
                    linha.setIndentationLeft(25);
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

    public static void gerarRelatorioGeral(List<Respostas> respAdm, List<Respostas> respCont, List<Respostas> respAds, List<Respostas> respServico, List<Respostas> respDireito, List<Respostas> respEdFisica, List<Respostas> respEnfermagem, List<Respostas> respFisio, List<Respostas> respPsico, Respostas r) {
        Font normal = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.NORMAL);
        String diretorioPdf = "resultadoVestibular" + formatarData.format(new Date()) + ".pdf";

        try {

            try {
                PdfWriter.getInstance(document, new FileOutputStream(diretorioPdf));
            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }
            document.open();
            gerarCabecalho(r, document);

            try {
                for (Object obj : respAds) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato(), normal);
                    linha.setAlignment(Element.ALIGN_JUSTIFIED);
                    linha.setIndentationLeft(25);
                    document.add(linha);
                }
                document.newPage();
                gerarCabecalho(r, document);
                for (Object obj : respAds) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato(), normal);
                    linha.setAlignment(Element.ALIGN_JUSTIFIED);
                    linha.setIndentationLeft(25);
                    document.add(linha);
                }
                document.newPage();
                gerarCabecalho(r, document);
                for (Object obj : respAds) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato(), normal);
                    linha.setAlignment(Element.ALIGN_JUSTIFIED);
                    linha.setIndentationLeft(25);
                    document.add(linha);
                }
                document.newPage();
                gerarCabecalho(r, document);
                for (Object obj : respAds) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato(), normal);
                    linha.setAlignment(Element.ALIGN_JUSTIFIED);
                    linha.setIndentationLeft(25);
                    document.add(linha);
                }
                //document.newPage();
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

}

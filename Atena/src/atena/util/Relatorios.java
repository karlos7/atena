/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atena.util;

import atena.respostas.Respostas;
import atena.telas.RelatorioGeral;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
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

    //static Respostas r = new Respostas();
    public static void gerarRelatorioUsuarios(List relatoriogeral, Respostas r) {
        SimpleDateFormat formatarData = new SimpleDateFormat("dd-MM-yyyy(HH-mm-ss)");
        // criação do documento
        Document document = new Document();
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

            try {
                Paragraph linha = new Paragraph("ATENA - VESTIBULAR FVS", boldFont);
                linha.setAlignment(Element.ALIGN_CENTER);
                document.add(linha);

            } catch (com.itextpdf.text.DocumentException ex) {
                Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                for (Object obj : relatoriogeral) {

                    Respostas resp = (Respostas) obj;

                    Paragraph linha = new Paragraph(resp.getNomeCandidato());
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

}

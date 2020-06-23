/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;
/**
 *
 * @author MIFTAKHUL 'ULUM
 */
public class Write_Doc {
   public static void main(String[] args) throws FileNotFoundException, IOException {
        BasicConfigurator.configure();
        Properties prop = new Properties();
        prop.setProperty("log4j.rootLogger", "WARN");

        String teks = " Witing tresno jalaran soko kulino. Witing mulyo jalaran wani rekoso. "
                + "Nek dipikir suwi suwi iku loro, nek dirsake yo tambah loro, loro tambah loro, papat";
        String outDoc = "D://WriteDoc.doc";

        XWPFDocument document = new XWPFDocument();
        try ( FileOutputStream out = new FileOutputStream(new File(outDoc))) {
            XWPFParagraph paragraf = document.createParagraph();
            XWPFRun run = paragraf.createRun();
            run.setText(teks);
            document.write(out);
        }
        System.out.println("Generate DOC sukses!");
    }
}  


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan6;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;
import org.apache.log4j.BasicConfigurator;
/**
 *
 * @author MIFTAKHUL 'ULUM
 */
public class Write_docx {
  public static void main(String[] args) throws FileNotFoundException, IOException {
        BasicConfigurator.configure();
        
        String teks = "Kadang mripat iso salah ndelok, kuping iso salah krungu, "
                + "lambe iso salah ngomong, tapi ati ora bakal iso diapusi";
        

        XWPFDocument documentDocx = new XWPFDocument();

        // write document
        String outDocxEn = "D://writedocx.docx";
        //create paragraph
        try (FileOutputStream outDocx = new FileOutputStream(new File(outDocxEn))) {
            //create paragraph
            XWPFParagraph paragraphDocx = documentDocx.createParagraph();
            XWPFRun runDocx = paragraphDocx.createRun();
            runDocx.setText(teks);
            
            documentDocx.write(outDocx);
        }
        System.out.println("Write docx successfully");
    }
}  


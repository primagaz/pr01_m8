package project1_m8;




import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author adaw
 */
public class Project1_m8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
		File f = new File("fitxer00.html");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			bw.write("<html>");bw.newLine();
			 bw.write(" <head>");bw.newLine();
			 bw.write(" <title>");bw.newLine();
			 bw.write(" Nova 21562156156156&agrave;gina web");
			bw.newLine();
			bw.write(" </title>");
			bw.newLine();
			 bw.write(" </head>");
			bw.newLine();
			 bw.write(" <body>");
			bw.newLine();
			bw.write(" Nova p&agrave;gina web");
			bw.newLine();
			bw.write(" </body>");
			bw.newLine();
			bw.write("</html>");
			bw.newLine();
			bw.close();
		}
    }
}
  


import Analizador.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Go Files", "go");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getAbsolutePath();

            if (!fileName.toLowerCase().endsWith(".go")) {
                System.err.println("Error: The selected file does not have a .go extension.");
                return;
            }
            try {
                GolangParser parser = new GolangParser(new BufferedReader(new FileReader(fileName)));
                parser.Start();
                System.out.println("Parsing completed successfully.");
            } catch (ParseException e) {
                System.err.println("Token Error: " + e.getMessage());
            } catch (FileNotFoundException e) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
            } catch (TokenMgrError e) {
                System.err.println("Lexical error: " + e.getMessage());
            }
        } else {
            System.out.println("No file was selected.");
        }
    }
}

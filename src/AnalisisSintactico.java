import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import AnalizadorSintactico.*;


public class AnalisisSintactico {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivo Go", "go");
        fileChooser.setFileFilter(filter);
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            String fileName = fileChooser.getSelectedFile().getAbsolutePath();

            if (!fileName.toLowerCase().endsWith(".go")) {
                System.err.println("Error: El archivo seleccionado, no tiene una extension .go");
                return;
            }

            try {
                System.out.println("== Analisis lexico ==" + "\n");
                System.out.println("Archivo: " + fileName + "\n");
                GolangParser parser = new GolangParser(new BufferedReader(new FileReader(fileName)));
                parser.Start();
                System.out.println("Se analizo correctamente la gramatica.");
            } catch (ParseException e) {
                System.err.println("Error con el token: " + e.getMessage());
            } catch (FileNotFoundException e) {
                Logger.getLogger(AnalisisSintactico.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
            } catch (TokenMgrError e) {
                System.err.println("Error léxico: " + e.getMessage());
            }
        } else {
            System.out.println("No se selecciono ningun archivo.");
        }
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.Reader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import AnalizadorLexico.*;

public class AnalisisLexico {
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
                System.out.println("== Analisis sintactico ==" + "\n");
                System.out.println("Archivo: " + fileName + "\n");
                Reader reader = new BufferedReader(new FileReader(fileName));
                GolangLexerTokenManager lexer = new GolangLexerTokenManager(new SimpleCharStream(reader));
                Token token;
                while ((token = lexer.getNextToken()).kind != GolangLexerConstants.EOF) {
                        System.out.println("TOKEN: " + token.image + "\t<" + token.kind + ">");
                }
                System.out.println("Se analizo correctamente la gramatica.");
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

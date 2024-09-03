import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import Analizador.*;

public class App {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            GolangParser parser = new GolangParser(new BufferedReader(new FileReader("./test.go")));
            parser.Start();
            System.out.println("Parsing completed successfully.");
        } catch (ParseException e) {
            System.err.println("Token Error: " + e.getMessage());
        } catch (FileNotFoundException e) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, "Error al intentar leer el archivo.", e);
        } catch(TokenMgrError e){
            System.err.println("Lexical error: " + e.getMessage());
        }
    }
}

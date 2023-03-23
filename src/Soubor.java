import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soubor extends JFrame {

    List<String> ziskejSeznamHer(File file) {
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(file)));


            List<String> vypisHer = new ArrayList<>();



            while (scanner.hasNext()) {
                vypisHer.add(scanner.nextLine());
            }

        scanner.close();
        return vypisHer;

    } catch (
    FileNotFoundException e) {
        throw new RuntimeException(e);
    }



}

}
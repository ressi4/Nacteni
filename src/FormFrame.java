import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.List;

public class FormFrame extends JFrame{
    private JButton Button;
    private JTextArea textArea1;
    private JPanel mainPanel;

    private JMenuBar menuBar;
    private JMenu file;
    private JMenuItem otevri;
    private JFileChooser fileChooser;
    private Soubor trida = new Soubor();

    public FormFrame() {

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        file = new JMenu("File");
        menuBar.add(file);
        otevri = new JMenuItem("Open");
        file.add(otevri);


            fileChooser = new JFileChooser();
        otevri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zobrazData = fileChooser.showOpenDialog(FormFrame.this);
                if (zobrazData == JFileChooser.APPROVE_OPTION) {
                    File soubor = fileChooser.getSelectedFile();

                    List<String> seznam = trida.ziskejSeznamHer(soubor);
                    seznam.forEach((el)-> textArea1.append(el+"\n"));



                }

            }


        });


        Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int zobrazData = fileChooser.showOpenDialog(FormFrame.this);
                if (zobrazData == JFileChooser.APPROVE_OPTION) {
                    File soubor = fileChooser.getSelectedFile();

                    List<String> seznam = trida.ziskejSeznamHer(soubor);
                    seznam.forEach((el)-> textArea1.append(el+"\n"));



                }

            }


        });
    }

    public static void main(String[] args) {
        FormFrame okno = new FormFrame();
        okno.setContentPane(okno.mainPanel);
        okno.setVisible(true);
        okno.pack();


    }
}

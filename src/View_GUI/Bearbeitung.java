package View_GUI;

import Model_daten.*;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Amel on 24.01.2017.
 */
public class Bearbeitung
{

    private JComboBox comboBox1;
    private JButton ändernButton;
    private JButton löschenButton;
    private JButton abbrechenButton;
    private JPanel bearbeitungPanel;
    private JTextArea nachrichtenArea;


    public Bearbeitung()
    {
        erstellen();
    }

    public void erstellen()
    {
        JFrame frame = new JFrame("Bearbeitung");
        frame.setContentPane(bearbeitungPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(800, 0);
        frame.pack();
        frame.setSize(700, 500);
        frame.setVisible(true);
    }

}
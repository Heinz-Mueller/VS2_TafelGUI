package View_GUI;

import Model_daten.*;
import javax.swing.*;

/**
 * Created by E.E on 10.01.2017.
 */
public class Tafel extends javax.swing.JFrame
{
    JFrame frame = new JFrame("Tafel");
    private JTextArea nachrichtenArea;
    private JPanel tafelPanel;
    private JButton sendenButton;
    private JTextField nachrichtTexteingabe;
    private JLabel User;
    private JLabel aktuellerUser;
    private JButton messageBearbeitenButton;
    private JButton refreshButton;

    public Tafel()
    {
       erstellen();
    }


    public void erstellen()
    {
        //JFrame frame = new JFrame("Tafel");
        frame.setContentPane(tafelPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(700, 500);
        //frame.setVisible(true);
    }

    public void sichtbar(boolean a)
    {
        if (a = true)
        {
            frame.setVisible(true);
        }
    }

}

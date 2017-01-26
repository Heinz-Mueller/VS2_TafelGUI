package View_GUI;

import Model_daten.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by E.E on 10.01.2017.
 */
public class Tafel extends JDialog
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
    private JTextArea childrenTextArea;
    private JLabel Nachrichten;
    private JLabel Children;
    private JButton logoutButton;

    public Tafel()
    {
       erstellen();

//        messageBearbeitenButton.addMouseListener(new MouseAdapter()
//        {
//            @Override
//            public void mouseClicked(MouseEvent e)
//            {
//                Bearbeitung bearbeitung = new Bearbeitung();
//            }
//        });


    }

    public Tafel(String user)
    {
        erstellen();
        aktuellerUser.setText(user);

        messageBearbeitenButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onBearbeiten();
            }
        });
        logoutButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                onLogout();
            }
        });
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

    public void sichtbar(boolean ja)
    {
            frame.setVisible(ja);
    }

    private void onBearbeiten()
    {
        Bearbeitung bearbeitung = new Bearbeitung();
    }

    private void onLogout()
    {
        onAbbrechen();
        Login login = new Login();
        login.sichtbar(true);
    }

    private void onAbbrechen()
    {
        frame.dispose();
    }

}

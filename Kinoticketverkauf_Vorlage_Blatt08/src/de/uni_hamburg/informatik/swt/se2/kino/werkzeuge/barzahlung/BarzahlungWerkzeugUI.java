package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BarzahlungWerkzeugUI
{

    private JDialog _meinJDialog;
    private JPanel _panela;
    private JPanel _panelb;
    private JPanel _panel1;
    private JPanel _panel2;
    private JPanel _panel3;
    private JButton _okButton;
    private JButton _abbrechenButton;
    private JTextField _eingabePreisFeld;
    private JTextField _restbetrag;
    private JTextField _gesamtbetrag;
    private JTextField _gezahlterBetrag;
    private JTextField _information;
    private JTextField _information2;

    /**
    * Create the application.
    */
    public BarzahlungWerkzeugUI()
    {
        erstellePanel();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void erstellePanel()
    {
        //        Öffnen des Fensters
        _meinJDialog = new JDialog();
        _meinJDialog.setTitle("Barzahlungs");
        _meinJDialog.getContentPane()
            .setLayout(
                    new BoxLayout(_meinJDialog.getContentPane(),
                            BoxLayout.Y_AXIS));
        _meinJDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Font font1 = new Font("TimesNewRoman", Font.BOLD, 16);
        Font font2 = new Font("SansSerif", Font.ROMAN_BASELINE, 16);

        // Panela erstellen
        _panela = new JPanel();
        _panela.setLayout(new BoxLayout(_panela, BoxLayout.X_AXIS));
        JLabel label2 = new JLabel("Vorstellungsinfo:    ");
        label2.setFont(font1);
        _information = new JTextField();
        _information.setEditable(false);
        _information.setFont(font2);
        _information.setHorizontalAlignment(JTextField.CENTER);
        _panela.add(label2);
        _panela.add(_information);

        // Panelb erstellen
        _panelb = new JPanel();
        _panelb.setLayout(new BoxLayout(_panelb, BoxLayout.X_AXIS));
        JLabel label3 = new JLabel("Anzahl der Plätze:   ");
        label3.setFont(font1);
        _information2 = new JTextField();
        _information2.setEditable(false);
        _information2.setFont(font2);
        _information2.setHorizontalAlignment(JTextField.CENTER);
        _panelb.add(label3);
        _panelb.add(_information2);

        //        Den obersten Panel erstellen, der ein JLabel und vier JTextfield beinhaltet
        _panel1 = new JPanel();
        _panel1.setLayout(new BoxLayout(_panel1, BoxLayout.Y_AXIS));

        _gesamtbetrag = new JTextField();
        _gesamtbetrag.setEditable(false);
        _gesamtbetrag.setFont(font1);
        _gezahlterBetrag = new JTextField();
        _gezahlterBetrag.setEditable(false);
        _gezahlterBetrag.setFont(font1);
        _restbetrag = new JTextField();
        _restbetrag.setFont(font1);
        _restbetrag.setEditable(false);
        _restbetrag.setBackground(Color.RED);

        _panel1.add(_gesamtbetrag);
        _panel1.add(_gezahlterBetrag);
        _panel1.add(_restbetrag);

        //        Den mittleren Panel erstellen, der einen JLabel und einen JTextfield besitzt.
        _panel2 = new JPanel();
        _panel2.setLayout(new BoxLayout(_panel2, BoxLayout.X_AXIS));

        JLabel label = new JLabel("Ihre Zahlung    ");
        label.setFont(font1);
        _panel2.add(label);
        _eingabePreisFeld = new JTextField();
        _eingabePreisFeld.setFont(font2);
        _panel2.add(_eingabePreisFeld);

        //      Den untersten Panle erstellen, der zwei JButtons enthält.  
        _panel3 = new JPanel();
        _panel3.setLayout(new BoxLayout(_panel3, BoxLayout.X_AXIS));

        _okButton = new JButton("OK");
        _okButton.setFont(font2);
        _okButton.setEnabled(false);
        _abbrechenButton = new JButton("Abbrechen");
        _abbrechenButton.setFont(font2);
        _panel3.add(_okButton);
        _panel3.add(_abbrechenButton);

        //        Die 3 Panels in dem Fenster hinzufügen und das Fenster sichtbar machen.
        _meinJDialog.add(_panela);
        _meinJDialog.add(_panelb);
        _meinJDialog.add(_panel1);
        _meinJDialog.add(_panel2);
        _meinJDialog.add(_panel3);
        _meinJDialog.setModal(true);
    }

    /**
     * Zeigt das Fenster an.
     */
    public void zeigeFenster()
    {
        _meinJDialog.setSize(890, 350);
        _meinJDialog.setVisible(true);
    }

    /**
     * Schließt das Fenster.
     */
    public void schliesseFenster()
    {
        _meinJDialog.dispose();
    }

    /**
     * Gibt den ok-Button zurück.
     */
    public JButton getOkButton()
    {
        return _okButton;
    }

    /**
     * Gibt den abbrechen-Button zurück.
     */
    public JButton getAbbrechenButton()
    {
        return _abbrechenButton;
    }

    /**
     * Gibt den frame-JFrame zurück.
     */
    public JDialog getUIFrame()
    {
        return _meinJDialog;
    }

    /**
     * Gibt den _eingabePreisFeld-JTextField zurück.
     */
    public JTextField get_eingabePreisFeldJTextField()
    {
        return _eingabePreisFeld;
    }

    /**
     * Gibt die Information zurück.
     */
    public JTextField get_information()
    {
        return _information;
    }

    /**
     * Gibt die Information2 zurück.
     */
    public JTextField get_information2()
    {
        return _information2;
    }

    /**
     * Gibt den Gesamtbetrag zurück.
     */
    public JTextField get_gesamtbetrag()
    {
        return _gesamtbetrag;
    }

    /**
     * Gibt den Restbetrag zurück.
     */
    public JTextField get_restbetrag()
    {
        return _restbetrag;
    }

    /**
     * Gibt den gezahlten Betrag zurück.
     */
    public JTextField get_gezahlterBetrag()
    {
        return _gezahlterBetrag;
    }
}

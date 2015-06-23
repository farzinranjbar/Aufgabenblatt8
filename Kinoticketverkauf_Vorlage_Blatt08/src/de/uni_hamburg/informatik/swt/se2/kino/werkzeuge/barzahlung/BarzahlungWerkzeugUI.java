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
    private JPanel _panel1;
    private JPanel _panel2;
    private JPanel _panel3;
    private JPanel _panel4;
    private JPanel _panel5;
    private JButton _okButton;
    private JButton _abbrechenButton;
    private JTextField _eingabePreisFeld;
    private JTextField _restbetrag;
    private JTextField _gesamtbetrag;
    private JTextField _gezahlterBetrag;
    private JTextField _veranstaltungsinformation;
    private JTextField _anzahlDerPlaetze;
    private Font _font1;
    private Font _font2;

    /**
    * Create the application.
    */
    public BarzahlungWerkzeugUI()
    {
        // Fonts erstellen
        _font1 = new Font("TimesNewRoman", Font.BOLD, 16);
        _font2 = new Font("SansSerif", Font.ROMAN_BASELINE, 16);
        
        // Erstelle das Fenster
        _meinJDialog = new JDialog();
        _meinJDialog.setTitle("Barzahlungs");
        _meinJDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        _meinJDialog.getContentPane()
            .setLayout(
                    new BoxLayout(_meinJDialog.getContentPane(),
                            BoxLayout.Y_AXIS));
        _meinJDialog.add(erstellePanel1());
        _meinJDialog.add(erstellePanel2());
        _meinJDialog.add(erstellePanel3());
        _meinJDialog.add(erstellePanel4());
        _meinJDialog.add(erstellePanel5());
        _meinJDialog.setModal(true);
    }

    private JPanel erstellePanel1()
    {
        _panel1 = new JPanel();
        _panel1.setLayout(new BoxLayout(_panel1, BoxLayout.X_AXIS));
        JLabel label2 = new JLabel("Vorstellungsinfo:    ");
        label2.setFont(_font1);
        _veranstaltungsinformation = new JTextField();
        _veranstaltungsinformation.setEditable(false);
        _veranstaltungsinformation.setFont(_font2);
        _veranstaltungsinformation.setHorizontalAlignment(JTextField.CENTER);
        _panel1.add(label2);
        _panel1.add(_veranstaltungsinformation);
        return _panel1;
    }

    private JPanel erstellePanel2()
    {
    _panel2 = new JPanel();
    _panel2.setLayout(new BoxLayout(_panel2, BoxLayout.X_AXIS));
    JLabel label3 = new JLabel("Anzahl der Plätze:   ");
    label3.setFont(_font1);
    _anzahlDerPlaetze = new JTextField();
    _anzahlDerPlaetze.setEditable(false);
    _anzahlDerPlaetze.setFont(_font2);
    _anzahlDerPlaetze.setHorizontalAlignment(JTextField.CENTER);
    _panel2.add(label3);
    _panel2.add(_anzahlDerPlaetze);
    return _panel2;
    }
    
    private JPanel erstellePanel3()
    {
    _panel3 = new JPanel();
    _panel3.setLayout(new BoxLayout(_panel3, BoxLayout.Y_AXIS));

    _gesamtbetrag = new JTextField();
    _gesamtbetrag.setEditable(false);
    _gesamtbetrag.setFont(_font1);
    _gezahlterBetrag = new JTextField();
    _gezahlterBetrag.setEditable(false);
    _gezahlterBetrag.setFont(_font1);
    _restbetrag = new JTextField();
    _restbetrag.setFont(_font1);
    _restbetrag.setEditable(false);
    _restbetrag.setBackground(Color.RED);

    _panel3.add(_gesamtbetrag);
    _panel3.add(_gezahlterBetrag);
    _panel3.add(_restbetrag);
    return _panel3;
    }
    
    private JPanel erstellePanel4()
    {
    _panel4 = new JPanel();
    _panel4.setLayout(new BoxLayout(_panel4, BoxLayout.X_AXIS));

    JLabel label = new JLabel("Ihre Zahlung    ");
    label.setFont(_font1);
    _panel4.add(label);
    _eingabePreisFeld = new JTextField();
    _eingabePreisFeld.setFont(_font2);
    _panel4.add(_eingabePreisFeld);
    return _panel4;
    }
    
    private JPanel erstellePanel5()
    {
    _panel5 = new JPanel();
    _panel5.setLayout(new BoxLayout(_panel5, BoxLayout.X_AXIS));

    _okButton = new JButton("OK");
    _okButton.setFont(_font2);
    _okButton.setEnabled(false);
    _abbrechenButton = new JButton("Abbrechen");
    _abbrechenButton.setFont(_font2);
    _panel5.add(_okButton);
    _panel5.add(_abbrechenButton);
    return _panel5;
    }
    
    /**
     * Gibt den frame-JFrame zurück.
     */
    public JDialog getUIFrame()
    {
        return _meinJDialog;
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
     * Gibt den _eingabePreisFeld-JTextField zurück.
     */
    public JTextField get_eingabePreisFeldJTextField()
    {
        return _eingabePreisFeld;
    }

    /**
     * Gibt die Information zurück.
     */
    public JTextField get_veranstaltungsinformation()
    {
        return _veranstaltungsinformation;
    }

    /**
     * Gibt die Information2 zurück.
     */
    public JTextField get_anzahlDerPlaetze()
    {
        return _anzahlDerPlaetze;
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
}

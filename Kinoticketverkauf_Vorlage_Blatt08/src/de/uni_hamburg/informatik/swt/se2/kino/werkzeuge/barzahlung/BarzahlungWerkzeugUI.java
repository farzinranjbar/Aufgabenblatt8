package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import javax.swing.JFrame;
import javax.swing.JTextField;

import javax.swing.JButton;

public class BarzahlungWerkzeugUI
{

    private JFrame _frame;
    private JButton _okButton; 
    private JButton _abbrechenButton; 
    private JTextField _eingabePreisFeld;
    private JTextField _restFeld;
    private JTextField _summeFeld;
    
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
        _frame = new JFrame();
        _frame.setBounds(100, 100, 450, 300);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.getContentPane().setLayout(null);
        
        _restFeld = new JTextField();
        _restFeld.setBounds(44, 125, 200, 36);
        _frame.getContentPane().add(_restFeld);
        _restFeld.setColumns(10);
        _restFeld.setEditable(false);
        
        _okButton = new JButton("OK");
        _okButton.setBounds(44, 174, 133, 50);
        _frame.getContentPane().add(_okButton);
        
        _abbrechenButton = new JButton("Abbrechen");
        _abbrechenButton.setBounds(190, 177, 200, 50);
        _frame.getContentPane().add(_abbrechenButton);
        
        _summeFeld = new JTextField();
        _summeFeld.setBounds(45, 13, 200, 50);
        _frame.getContentPane().add(_summeFeld);
        _summeFeld.setColumns(10);
        _summeFeld.setEditable(false);
        
        _eingabePreisFeld = new JTextField();
        _eingabePreisFeld.setBounds(44, 76, 325, 36);
        _frame.getContentPane().add(_eingabePreisFeld);
        _eingabePreisFeld.setColumns(10);
        
        zeigeFenster(); 
    }
    
    /**
     * Zeigt das Fenster an.
     */
    public void zeigeFenster()
    {
        _frame.setSize(900, 900);
        _frame.setVisible(true);
    }
    
    /**
     * Schließt das Fenster.
     */
    public void schliesseFenster()
    {
        _frame.dispose();
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
    public JFrame getUIFrame()
    {
        return _frame; 
    }
    
    /**
     * Gibt den _eingabePreisFeld-JTextField zurück.
     */
    public JTextField get_eingabePreisFeldJTextField()
    {
        return _eingabePreisFeld; 
    }
   
    /**
     * Gibt den _summeFeld-JTextPane zurück.
     */
    public JTextField get_summeFeldJTextPane()
    {
        return _summeFeld; 
    }
    
    /**
     * Gibt den _eingabePreisFeld-JTextPane zurück.
     */
    public JTextField get_restFeldJTextPane()
    {
        return _restFeld; 
    }
}

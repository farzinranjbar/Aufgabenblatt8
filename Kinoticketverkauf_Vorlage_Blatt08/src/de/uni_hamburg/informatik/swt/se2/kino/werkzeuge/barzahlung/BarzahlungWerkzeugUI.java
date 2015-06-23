package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.BorderLayout;

import javax.swing.JDialog;
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
        JDialog meinJDialog = new JDialog();
        meinJDialog.setTitle("Barzahlungs-Prozess");
        meinJDialog.setSize(200,200);
        meinJDialog.setVisible(true);
        
        _frame = new JFrame();
        _frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        _frame.getContentPane().setLayout(new BorderLayout());
        
        


    }
    
    /**
     * Zeigt das Fenster an.
     */
    public void zeigeFenster()
    {
        _frame.setSize(479, 293);
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
    public JTextField get_summeFeldJTextField()
    {
        return _summeFeld; 
    }
    
    /**
     * Gibt den _eingabePreisFeld-JTextPane zurück.
     */
    public JTextField get_restFeldJTextField()
    {
        return _restFeld; 
    }
}

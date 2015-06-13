package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class BarzahlungWerkzeug extends ObservableSubwerkzeug
{
    private BarzahlungWerkzeugUI _ui;
    private int _preis;
    private int eingabeBetrag;
    private int restbetrag;

    public BarzahlungWerkzeug()
    {
        _ui = new BarzahlungWerkzeugUI();
        registriereUIAktionen();
       
    }
    
    private void registriereUIAktionen()
    {
        _ui.getAbbrechenButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    _ui.schliesseFenster();
                }
            });

        _ui.getOkButton()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    verkaufePlaeze();
                }
            });

        _ui.get_eingabePreisFeldJTextField()
            .addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    aktuallisiereRestbetrag();
                }
            });
    }

    public void oeffneFenster()
    {
        _ui.zeigeFenster();
    }
    
    public void aktuallisiereSumme(int preis)
    {
        _preis = preis;
        _ui.get_summeFeldJTextField()
            .setText("Gesamtpreis: " + preis + " Eurocent");
    }

    public void aktuallisiereRestbetrag()
    {
        wandleEingabeInZahl();
        restbetrag = _preis - eingabeBetrag;
        _ui.get_restFeldJTextField()
            .setText("Restbetrag: " + restbetrag + " Eurocent");
    }
    
    public void wandleEingabeInZahl()
    {
        String eingabe = _ui.get_eingabePreisFeldJTextField()
            .getText();
        eingabeBetrag = Integer.parseInt(eingabe);
    }

    public void verkaufePlaeze()
    {
        if(restbetrag <= 0)
        {
        informiereUeberAenderung();
        _ui.schliesseFenster();
        }
        else
        {
        }
    }
}

package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.uni_hamburg.informatik.swt.se2.kino.materialien.Vorstellung;
import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class BarzahlungWerkzeug extends ObservableSubwerkzeug
{
    private BarzahlungWerkzeugUI _ui;
    private int _preis;
    private int _eingabeBetrag;
    private int _restbetrag;
    private int _gezahlterBetrag;
    private String _eingabe;

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
                    wandleEingabeInZahl();
                    verkaufePlaeze();
                }
            });
        
        _ui.get_eingabePreisFeldJTextField().addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                wandleEingabeInZahl();
                aktuallisiereGezahlterBetrag();
                aktuallisiereRestbetrag();
                if (_restbetrag <= 0)
                {
                    _ui.getOkButton().setEnabled(true);
                }
                else
                {
                    _ui.getOkButton().setEnabled(false);
                }
                _ui.get_eingabePreisFeldJTextField().setText(null);
                _eingabeBetrag = 0;
            }
        });
    }

    public void oeffneFenster()
    {
        _ui.zeigeFenster();
    }

    public void aktuallisiereSumme(int preis, Vorstellung vorstellung, int anzahlPlaetze)
    {
        _preis = preis;
        _ui.get_gesamtbetrag()
            .setText("Gesamtpreis: " + preis + " Eurocent");
        aktuallisiereRestbetrag();
        aktuallisiereGezahlterBetrag();
        aktuallisiereInformation(vorstellung, anzahlPlaetze);
    }
    
    public void aktuallisiereInformation(Vorstellung vorstellung, int anzahlPlaetze)
    {
        _ui.get_information().setText("     "+ vorstellung);
        _ui.get_information2().setText("     "+ anzahlPlaetze);
    }

    public void aktuallisiereRestbetrag()
    {
        _restbetrag = _preis - _gezahlterBetrag;
        _ui.get_restbetrag()
            .setText("Restbetrag: " + _restbetrag + " Eurocent");
        if(_restbetrag <= 0)
        {
            _ui.get_restbetrag().setBackground(Color.GREEN);
        }
        else
        {
            _ui.get_restbetrag().setBackground(Color.RED);
        }
    }
    
    public void aktuallisiereGezahlterBetrag()
    {
        _gezahlterBetrag += _eingabeBetrag;
        _ui.get_gezahlterBetrag().setText("Gezahlter Betrag: " + _gezahlterBetrag);
    }

    public void wandleEingabeInZahl()
    {
        try
        {
            _eingabe = _ui.get_eingabePreisFeldJTextField()
                .getText();
            _eingabeBetrag = Integer.parseInt(_eingabe);
        }
        catch (NumberFormatException ex)
        {
            _ui.get_eingabePreisFeldJTextField()
                .setText("Trage hier bitte einen Betrag ein!");
        }
    }

    public void verkaufePlaeze()
    {
        aktuallisiereGezahlterBetrag();
        aktuallisiereRestbetrag();
        if (_restbetrag <= 0)
        {
            _restbetrag = 0; 
            _gezahlterBetrag = 0;
            _eingabeBetrag = 0;
            _ui.get_eingabePreisFeldJTextField().setText(null);
            informiereUeberAenderung();
            _ui.schliesseFenster();
        }
    }
}

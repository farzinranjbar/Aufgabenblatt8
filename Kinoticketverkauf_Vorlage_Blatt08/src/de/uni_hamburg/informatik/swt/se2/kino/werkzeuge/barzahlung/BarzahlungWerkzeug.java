package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class BarzahlungWerkzeug extends ObservableSubwerkzeug
{
    private BarzahlungWerkzeugUI _ui;
    private int _preis;
    private int _eingabeBetrag;
    private int _restbetrag;
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
        aktuallisiereRestbetrag();
    }

    public void aktuallisiereRestbetrag()
    {

        _restbetrag = _preis - _eingabeBetrag;
        _ui.get_restFeldJTextField()
            .setText("Restbetrag: " + _restbetrag + " Eurocent");
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
        aktuallisiereRestbetrag();
        if (_restbetrag <= 0)
        {
            informiereUeberAenderung();
            _ui.schliesseFenster();
        }
    }
}

package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.ObservableSubwerkzeug;

public class BarzahlungWerkzeug extends ObservableSubwerkzeug {
	private BarzahlungWerkzeugUI _ui;
	private int preis;

	public BarzahlungWerkzeug() {
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
        
        _ui.getOkButton().addActionListener(new ActionListener()
        		{
        	@Override
            public void actionPerformed(ActionEvent e)
            {
        		informiereUeberAenderung();
            }
        });
	}

	public void aktuallisiereSumme(int preis)
	{
        _ui.get_summeFeldJTextPane().setText("Gesamtpreis: " + preis + " Eurocent");
	}
	
	public void aktuallisiereRestbetrag(){
		preis-xx;
	}
	





}



package de.uni_hamburg.informatik.swt.se2.kino.werkzeuge.barzahlung;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarzahlungWerkzeug
{
    private BarzahlungWerkzeugUI _ui;

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
    }
    
    

}

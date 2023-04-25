package Paginas;

import PaqC05.Contenedor;

import javax.swing.*;

public class Toneladas extends JFrame{
    private JTextArea textResultToneladas;
    private JPanel toneladasPanel;

    public Toneladas(String cadena) {
        setContentPane(toneladasPanel);
        setTitle("Gestión de contadores");
        setSize(1200, 600);
        setVisible(true);

        textResultToneladas.setText(cadena);
    }
}

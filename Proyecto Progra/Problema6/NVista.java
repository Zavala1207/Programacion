package Problema6;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class NVista {

    Nota nota;

    public NotaVista(Nota notaInstanciada) {
        this.nota = notaInstanciada;
    }

    public void leaNota() {
        double notaDigitada;
        
        notaDigitada = Double.parseDouble(JOptionPane.showInputDialog("Nota?"));

        nota.agregarNota(notaDigitada);
    }

    public void muestreNotas() {
        JTextArea jt = new JTextArea();
        for (int i = 0; i < nota.getIndex(); i++) {
            jt.append(nota.getNota(i) + "\n");
        }
        JOptionPane.showMessageDialog(null, jt);
    }

    public int getOpcion() {
        int r = 0;
        try {
            r = Integer.parseInt(JOptionPane.showInputDialog("1. Agregar nota\n2. Mostrar Notas\n3.Salir"));
            if ((r < 1) || (r > 3)) {
                throw new Exception("# inválido");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return r;
    }
}

package clases;

import Interfaces.VentanaPrincipal;
import java.awt.EventQueue;

public class inicializador {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Curso curso = new Curso("profesor", "hora_entrada", "hora_salida", "dias", "mes", "duracion");
                VentanaPrincipal ventanaPrincipal = new VentanaPrincipal(curso);
            }
        });
    }

}

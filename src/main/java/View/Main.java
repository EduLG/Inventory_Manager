package View;
import javax.swing.JFrame;

public class Main extends JFrame {

    public Main() {

        setTitle("Gestor de Inventario");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        Main ventana = new Main();
        ventana.setVisible(true);
    }

}
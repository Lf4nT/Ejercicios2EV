
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Main extends JFrame {

	public Main() {
		setTitle("OrdenacionesOrdenadasOrdenizantes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(new Lienzo());
		pack();
	}

	public static void main(String[] args) {
		new Main().setVisible(true);
	}
}

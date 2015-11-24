import javax.swing.JFrame;

public class Main {


	public static void main(String[] args) {
		Reader r = new Reader("Суматор");
		r.setVisible(true);
		r.setResizable(false);
		r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		r.setSize(300, 150);
		r.setLocationRelativeTo(null);
	}

}

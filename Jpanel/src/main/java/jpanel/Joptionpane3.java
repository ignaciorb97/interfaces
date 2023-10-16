package jpanel;

import javax.swing.JOptionPane;

public class Joptionpane3 {

	public static void main(String[] args) {
		// un input
		String nombre = JOptionPane.showInputDialog(null, "dime tu nombre", "datos", JOptionPane.QUESTION_MESSAGE);

		if (nombre != null && nombre.equals("")) {
			JOptionPane.showMessageDialog(null, "no has iniciado sesion", "error", JOptionPane.WARNING_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, nombre);

		}

	}

}

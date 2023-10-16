package jpanel;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Joptionpane4 {

	public static void main(String[] args) {
		UIManager.put("OptionPane.yesButtonText", "toma un leuro");
		UIManager.put("OptionPane.noButtonText", "que te lo cree tu");
		UIManager.put("OptionPane.cancelButtonText", "cancelar");
		
		boolean euro=false;
		do {
int codigo=JOptionPane.showConfirmDialog(null, "quieres un euro para una buena causa?","donacion",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
if(codigo==JOptionPane.YES_OPTION) {
	JOptionPane.showMessageDialog(null, "muchas gracias, no tenias obligacion");
	euro=true;
}else if(codigo==JOptionPane.NO_OPTION) {
	JOptionPane.showMessageDialog(null, "tremenda rata");
	
}else {
	JOptionPane.showMessageDialog(null, "tremenda rata");	
}

		}while(euro!=true);
	}

}

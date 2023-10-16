package jpanel;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Joptionpanelargo {

	public static void main(String[] args) {

		boolean euro = true;
		do {
			UIManager.put("OptionPane.yesButtonText", "Claro crack");
			UIManager.put("OptionPane.noButtonText", "Ni de coña alejate de mi");
			UIManager.put("OptionPane.cancelButtonText", "*das una voltereta patra ganando distancia*");
			int codigo = JOptionPane.showConfirmDialog(null, "Me deha er telefono pa esharme una foto", "OjO te roban",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if (codigo == JOptionPane.YES_OPTION) {
				JOptionPane.showMessageDialog(null, "Pos te rajo tambien por pringao" + "\n" + "*Has muerto*");

			} else if (codigo == JOptionPane.NO_OPTION) {
				JOptionPane.showMessageDialog(null, "tremenda rata vente pa aca que te via raja");
				UIManager.put("OptionPane.yesButtonText", "esquivo esquivo leo tus derechos *intentas huir*");
				UIManager.put("OptionPane.noButtonText", "llamo a la policia?");
				UIManager.put("OptionPane.cancelButtonText", "Te quedas quieto");
				codigo = JOptionPane.showConfirmDialog(null, "*te atacan con una navaja*", "navajazo",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (codigo == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "*no logras huir, porque eres un cobarde y el ladron muy rapido,mueres*");
					
				} else if (codigo == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "*el ladron huye*");

				} else {
					JOptionPane.showMessageDialog(null, "*mueres*");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Nove loco *te sale bien la voltereta y lo dejas impresionado*");
				UIManager.put("OptionPane.yesButtonText", "*puñetazo en la cara*");
				UIManager.put("OptionPane.noButtonText", "*gancho en el estomago*");
				UIManager.put("OptionPane.cancelButtonText", "*le robas la navaja y lo matas*");
				codigo = JOptionPane.showConfirmDialog(null, "*el ladron esta aturdido*", "*victoria?*",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
				if (codigo == JOptionPane.YES_OPTION) {
					JOptionPane.showMessageDialog(null, "*lo matas*");

				} else if (codigo == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "*lo matas*");

				} else {
					JOptionPane.showMessageDialog(null, "*es inmune a las navajas y te mata*");
				}
			}


		} while (euro != true);
	}

}

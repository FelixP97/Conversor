import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		SubMenuCM cm = new SubMenuCM();
		SubMenuCT ct = new SubMenuCT();
		Object seleccion=JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"Conversor de Moneda","Conversor de Temperatura"},null);
		if(seleccion == "Conversor de Moneda") {
			cm.subMenu();
		}else {
			ct.subMenu();
		}
	}
}

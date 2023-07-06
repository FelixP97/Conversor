import javax.swing.JOptionPane;

public class SubMenuCM {
	public static void subMenu() {
		ConversorMonedas conversor = new ConversorMonedas();
		Object seleccion=JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir tu dinero ", "Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Colon a Dolar","De Colon a Euro","De Colon a Libras","De Colon a Yen","De Colon a Won Coreano",
						"De Dolar a Colon","De Euro a Colon","De Libras a Colon","De Yen a Colon","De Won Coreano a Colon"},null);
		
		if (seleccion == "De Colon a Dolar") {
			conversor.conversorColonDolar();
		}else if(seleccion == "De Colon a Euro") {
			conversor.conversorColonEuro();
		}else if(seleccion == "De Colon a Libras") {
			conversor.conversorColonLibra();
		}else if(seleccion == "De Colon a Yen") {
			conversor.conversorColonYen();
		}else if(seleccion == "De Colon a Won Coreano") {
			conversor.conversorColonWon();
		}else if(seleccion == "De Dolar a Colon") {
			conversor.conversorDolarColon();
		}else if(seleccion == "De Euro a Colon") {
			conversor.conversorEuroColon();
		}else if(seleccion == "De Libras a Colon") {
			conversor.conversorLibraColon();
		}else if(seleccion == "De Yen a Colon") {
			conversor.conversorYenColon();
		}else if(seleccion == "De Won Coreano a Colon") {
			conversor.conversorWonColon();
		}
	}
}

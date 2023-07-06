import javax.swing.JOptionPane;

public class ConversorMonedas extends ObtenerValorMoneda{
	float cantidad;
	float total;
	
	
	public void conversorDolarColon() {
		
		try {
			obtenerValorDolarC();
			ventanaInput();		
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Colones", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorDolarColon();
		}
	}
	public void conversorColonDolar() {
		
		try {
			obtenerValorColonD();
			ventanaInput();	
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Dolares", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorColonDolar();
		}
	}
	
	public void conversorEuroColon() {
		
		try {
			obtenerValorEuroC();
			ventanaInput();	
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Colones", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorEuroColon();
		}
	}
	public void conversorColonEuro() {
		
		try {
			obtenerValorColonE();
			ventanaInput();	
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Euros", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorColonEuro();
		}
	}
	public void conversorLibraColon() {
		
		try {
			obtenerValorLibraC();
			ventanaInput();		
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Colones", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorLibraColon();
		}
	}
	public void conversorColonLibra() {
		
		try {
			obtenerValorColonL();
			ventanaInput();			
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Libras", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorColonLibra();
		}
	}
	public void conversorYenColon() {
		
		try {
			obtenerValorYenC();
			ventanaInput();
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Colones", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorYenColon();
		}
	}
	public void conversorColonYen() {
		
		try {
			obtenerValorColonY();
			ventanaInput();
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Yenes", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorColonYen();
		}
	}
	public void conversorWonColon() {
		
		try {
			obtenerValorWonC();
			ventanaInput();
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Won Colones", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorWonColon();
		}
	}
	public void conversorColonWon() {
		
		try {
			obtenerValorColonW();
			ventanaInput();
			JOptionPane.showMessageDialog(null,String.format("Tienes %.2f Won Coreano", total),"Message",JOptionPane.INFORMATION_MESSAGE);
			continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversorColonWon();
		}
	}
	private static void mensajeError() {
		JOptionPane.showMessageDialog(null,"Valor no valido", "Message",JOptionPane.ERROR_MESSAGE);
	}
	private void ventanaInput() {
		cantidad= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de dinero que desea convertir: ", "Input",
				JOptionPane.QUESTION_MESSAGE));
		total = cantidad*precio;
	}
	private void continuar() {
		int input=JOptionPane.showConfirmDialog(null,"¿Desea continuar?","Select Option",JOptionPane.YES_NO_OPTION);
		if(input == 0) {
			MenuPrincipal menu = new MenuPrincipal();
			menu.menu();
		}else {
			JOptionPane.showMessageDialog(null,"Programa terminado", "Message",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}

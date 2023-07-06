import javax.swing.JOptionPane;

public class ConversorTemperatura {
	float celsius;
	float fahrenheit;
	float kelvin;
	float total;
	
	private static void mensajeError() {
		JOptionPane.showMessageDialog(null,"Valor no valido", "Message",JOptionPane.ERROR_MESSAGE);
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
	public void conversionCelsiusF() {
		try {
		celsius= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de temperatura a convertir ", "Input",
				JOptionPane.QUESTION_MESSAGE));
		total=(celsius * 9/5)+32;
		JOptionPane.showMessageDialog(null,String.format("%.2f fahrenheit", total),"Message",JOptionPane.INFORMATION_MESSAGE);
		continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversionCelsiusF();
		}
	}
	public void conversionFahrenheitC() {
		try {
		fahrenheit=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de temperatura a convertir ", "Input",
				 JOptionPane.QUESTION_MESSAGE));
		total=(fahrenheit -32)*5/9;
		JOptionPane.showMessageDialog(null,String.format("%.2f celsius", total),"Message",JOptionPane.INFORMATION_MESSAGE);
		continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversionFahrenheitC();
		}
	}
	public void conversionCelsiusK() {
		try {
		celsius= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de temperatura a convertir ", "Input",
				JOptionPane.QUESTION_MESSAGE));
		total= celsius + 273.15f;
		JOptionPane.showMessageDialog(null,String.format("%.2f kelvin", total),"Message",JOptionPane.INFORMATION_MESSAGE);
		continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversionCelsiusK();
		}
	}
	public void conversionKelvinC() {
		try {
		kelvin= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de temperatura a convertir ", "Input",
				JOptionPane.QUESTION_MESSAGE));
		total= kelvin - 273.15f;
		JOptionPane.showMessageDialog(null,String.format("%.2f celsius", total),"Message",JOptionPane.INFORMATION_MESSAGE);
		continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversionKelvinC();
		}
	}
	public void conversionFahrenheitK() {
		try {
		fahrenheit=Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de temperatura a convertir ", "Input",
				 JOptionPane.QUESTION_MESSAGE));
		total=(fahrenheit -32)*5/9+273.15f;
		JOptionPane.showMessageDialog(null,String.format("%.2f kelvin", total),"Message",JOptionPane.INFORMATION_MESSAGE);
		continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversionFahrenheitK();
		}
	}
	public void conversionKelvinF() {
		try {
		kelvin= Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese la cantidad de temperatura a convertir ", "Input",
				JOptionPane.QUESTION_MESSAGE));
		total= (kelvin - 273.15f)*9/5 +32;
		JOptionPane.showMessageDialog(null,String.format("%.2f fahrenheit", total),"Message",JOptionPane.INFORMATION_MESSAGE);
		continuar();
		}catch(NumberFormatException ex) {
			mensajeError();
			conversionKelvinF();
		}
	}
}

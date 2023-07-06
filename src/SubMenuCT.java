import javax.swing.JOptionPane;

public class SubMenuCT {
	public static void subMenu() {
		ConversorTemperatura conversor = new ConversorTemperatura();
		Object seleccion=JOptionPane.showInputDialog(null, "Elige la conversion que deseas realizar ", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] {"De Celsius a Fahrenheit","De Fahrenheit a Celsius","De Celsius a Kelvin","De Kelvin a Celsius","De Fahrenheit a Kelvin",
						"De Kelvin a Fahrenheit"},null);
		
		if (seleccion == "De Celsius a Fahrenheit") {
			conversor.conversionCelsiusF();
		}else if(seleccion == "De Fahrenheit a Celsius") {
			conversor.conversionFahrenheitC();
		}else if(seleccion == "De Celsius a Kelvin") {
			conversor.conversionCelsiusK();
		}else if(seleccion == "De Kelvin a Celsius") {
			conversor.conversionKelvinC();
		}else if(seleccion == "De Fahrenheit a Kelvin") {
			conversor.conversionFahrenheitK();
		}else if(seleccion == "De Kelvin a Fahrenheit") {
			conversor.conversionKelvinF();
		}
	}
}

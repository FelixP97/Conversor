import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class ObtenerValorMoneda {
	protected float precio;
	
	private static Document getHTML(String url) {
		Document html = null;
		try {
			html = Jsoup.connect(url).get();
		}catch(Exception e) {
			System.out.println("Error al obtener el codigo HTML");
		}
		return html;
	}
	protected void obtenerValorDolarC() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/USD-CRC").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorColonD() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/CRC-USD").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorEuroC() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/EUR-CRC").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorColonE() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/CRC-EUR").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorLibraC() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/GBP-CRC").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorColonL() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/CRC-GBP").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorYenC() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/JPY-CRC").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorColonY() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/CRC-JPY").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorWonC() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/KRW-CRC").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	protected void obtenerValorColonW() {
		precio = Float.parseFloat(ObtenerValorMoneda.getHTML("https://www.google.com/finance/quote/CRC-KRW").getElementsByClass("YMlKec fxKbKc").text());
		System.out.println(precio);
	}
	
}

package flyweight;

import java.util.HashMap;

public class NotasMusicais {

	private static HashMap<String, Nota> notas = new HashMap<String, Nota>();

	static {
		notas.put("dó", new Do());
		notas.put("ré", new Re());
		notas.put("mi", new Mi());
		notas.put("fá", new Fa());
		notas.put("sol", new Sol());
		notas.put("lá", new La());
		notas.put("si", new Si());
	}

	public Nota pega(String nota) {
		return notas.get(nota);
	}
}

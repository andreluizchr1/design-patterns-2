package flyweight;

import java.util.Arrays;
import java.util.List;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotasMusicais notas = new NotasMusicais();

		List<Nota> musica = Arrays.asList(notas.pega("dó"), notas.pega("ré"), notas.pega("mi"), notas.pega("fá"),
				notas.pega("fá"), notas.pega("fá"));

		Piano piano = new Piano();
		piano.toca(musica);

	}

}

package cap3;

import java.util.Calendar;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Historico historico = new Historico();
		Contrato c1 = new Contrato("André", Calendar.getInstance(), TipoContrato.NOVO);
		historico.adiciona(c1.salvaEstado());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());

		c1.avanca();
		historico.adiciona(c1.salvaEstado());

		Estado estadoAnterior = historico.pega(1);
		System.out.println(estadoAnterior.getContrato().getTipo());

	}

}

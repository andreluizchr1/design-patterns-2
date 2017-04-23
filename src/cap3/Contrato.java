package cap3;

import java.util.Calendar;

public class Contrato {

	private String cliente;
	private Calendar data;
	private TipoContrato tipo;

	public Contrato(String cliente, Calendar data, TipoContrato tipo) {
		this.cliente = cliente;
		this.data = data;
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public Calendar getData() {
		return data;
	}

	public TipoContrato getTipo() {
		return tipo;
	}

	public void avanca() {
		if (tipo == TipoContrato.NOVO) {
			tipo = TipoContrato.EM_ANDAMENTO;
		} else if (tipo == TipoContrato.EM_ANDAMENTO) {
			tipo = TipoContrato.ACERTADO;
		} else if (tipo == TipoContrato.ACERTADO) {
			tipo = TipoContrato.CONCLUIDO;
		}
	}

	public Estado salvaEstado() {
		return new Estado(new Contrato(this.cliente, this.data, this.tipo));
	}
}

package EPexemplo;

import java.util.Objects;

public class Restaurante {
	private String name; private TipoComida tipoComida;
	public Restaurante(String name, TipoComida tipoComida) {
		this.name = name;
		this.tipoComida = tipoComida;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TipoComida getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(TipoComida tipoComida) {
		this.tipoComida = tipoComida;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Restaurante that = (Restaurante) o;
		return Objects.equals(name, that.name) && tipoComida == that.tipoComida;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, tipoComida);
	}

	@Override
	public String toString() {
		return name;
	}
}

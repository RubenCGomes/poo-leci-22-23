package EPexemplo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Gastronomia extends Atividade{
	private List<Restaurante> restaurantes = new ArrayList<>();

	public Gastronomia(int id, String name) {
		super(id, name);
	}

	public Gastronomia(int id, String name, List<Restaurante> restaurantes) {
		super(id, name);
		this.restaurantes = restaurantes;
		super.addLocais(restaurantes.toString());
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	public int totalRestaurantes(){
		return restaurantes.size();
	}

	public List<Restaurante> getLista(){
		return restaurantes;
	}

	public void add(Restaurante restaurante){
		if (this.restaurantes != null)
			this.restaurantes.add(restaurante);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Gastronomia that = (Gastronomia) o;
		return Objects.equals(restaurantes, that.restaurantes);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), restaurantes);
	}

	@Override
	public String toString() {
		return "Gastronomia{" +
				"restaurantes=" + restaurantes +
				'}';
	}
}

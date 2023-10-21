package EPexemplo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public abstract class Atividade implements PontosDeInteresse{
	private int id; private String name; Collection<String> locais = new ArrayList<>();

	public Atividade(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Collection<String> locais(){
		return locais;
	}

	public void addLocais(String locais){
		this.locais.add(locais);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Atividade atividade = (Atividade) o;
		return id == atividade.id && Objects.equals(name, atividade.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Atividade{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}

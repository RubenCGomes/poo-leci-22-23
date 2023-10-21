package EPexemplo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class PasseioBicicleta extends Atividade {
	Set<String> locais = new HashSet<>();

	public PasseioBicicleta(int id, String name) {
		super(id, name);
	}

	public PasseioBicicleta(int id, String name, String[] locais) {
		super(id, name);
		this.locais = Arrays.stream(locais).collect(Collectors.toSet());
		Arrays.stream(locais).forEach(super::addLocais);
	}

	public Set<String> getLocal() {
		return locais;
	}

	public void setLocal(Set<String> locais) {
		this.locais = locais;
	}

	public void addLocal(String local){
		locais.add(local);
		super.addLocais(local);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		PasseioBicicleta that = (PasseioBicicleta) o;
		return Objects.equals(locais, that.locais);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), locais);
	}

	@Override
	public String toString() {
		return "PasseioBicicleta{" +
				"locais=" + locais +
				'}';
	}
}

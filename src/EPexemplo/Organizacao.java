package EPexemplo;

import java.util.Objects;

public class Organizacao {
	String contact;

	public Organizacao(String contact) {
		this.contact = contact;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Organizacao that = (Organizacao) o;
		return Objects.equals(contact, that.contact);
	}

	@Override
	public int hashCode() {
		return Objects.hash(contact);
	}

	@Override
	public String toString() {
		return "Organizacao{" +
				"contact='" + contact + '\'' +
				'}';
	}
}

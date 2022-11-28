package data;

public class Contact {

	int idContact;
	String nom, prenom;
	
	public Contact() {
	}

	public Contact(int idContact, String nom, String prenom) {
		super();
		this.idContact = idContact;
		this.nom = nom;
		this.prenom = prenom;
	}

	public int getIdContact() {
		return idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Contact [idContact=" + idContact + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
}

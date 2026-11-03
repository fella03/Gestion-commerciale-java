package MonPackage;

public class Bean {

	private String Nom;
	private String Prenom;
	private boolean Etat;
	public String getNom() {
		return Nom;
	}
	
	

	public String getPrenom() {
		return Prenom;
	}
	public boolean isEtat() {
		return Etat;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public void setEtat(boolean etat) {
		Etat = etat;
	}
	
}

package ExHeritage;

public class Professor extends Personne {

		private float Salaire;
		private String[] Matieres;
	
	//Constructeur de l'objet Professor
	public Professor(String nom, int age, String mail, float salaire, String[] matieres) {
		super(nom, age, mail);
		Salaire = salaire;
		Matieres = matieres;
	}
	
	public void ListesDesMatieres(String[] Matieres ) {
		for (String string : Matieres) {
			System.out.println(string + " " );
		}
	}
	public void Description() {
		System.out.println("je m'appelle " + Nom + " j'ai " + Age + " ans " + " et ma liste de matieres est " );
		ListesDesMatieres(Matieres);
	}	

}

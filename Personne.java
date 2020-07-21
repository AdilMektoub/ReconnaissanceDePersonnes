package ExHeritage;

//MERE
public class Personne {

	
	protected String Nom;
	protected int Age;
	private String Mail;
	
	
//Constructeur de l'objet Personne MERE
	public Personne(String nom, int age, String mail) {
		super();
		Nom = nom;
		Age = age;
		Mail = mail;
	}


	public void Description() {
		System.out.println("le nom de la personne est " + Nom + " et l'age est " + Age + " ans." );
	}
	
} 

package ExHeritage;

public class Student extends Personne{

	private int NumeroEtudiant;

	//Constructeur de l'objet Student
	public Student(String nom, int age, String mail, int numeroEtudiant) {
		super(nom, age, mail);
		NumeroEtudiant = numeroEtudiant;
	}
	
	public void Description() {
		System.out.println("le nom de la personne est " + Nom + " et l'age est "  + " ans " + " et mon numéros de comptes est " + NumeroEtudiant );
	}
	
}

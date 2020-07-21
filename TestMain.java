package ExHeritage;

public class TestMain {

	public static void main(String[] args) {
		
		
		
	// je suis Anis et j'ai 28 ans
		Personne Anis = new Personne("Anis", 28, "anis@pop.fr");
		Anis.Description();
		
		System.out.println("-----------------------------------------");
	//je suis Anis et j'ai 28 ans et j'enseigne :Java HTML CSS
		String[] matieres = {"JAVA", "CSS", "HTML"};
		Professor AnisP = new Professor("AnisP", 28, "anis@pop.fr", 5000, matieres);
		AnisP.Description();
	
		System.out.println("----------------------------------------------------");
	//je suis Anis et j'ai 28 ans et mon numéro d'étudiant est XXXX616 
		Student AnisS = new Student("AnisS", 28, "anis@pop.fr", 1616);
		AnisS.Description();
		
	
		
		
	System.out.println("--------------------------------------------");	
	//Définit un tableau de noms
		String[] tabNoms = {"Anis", "KD", "Dalia", "Adil", "Paul", "Jack"};
		int age = 30;
		float salaire = 2000;
		Personne[] tabPersonne = new Personne[6];
		
		int numEtud1 = 2587412;
		int numEtud2 = 2515582;
		String [] tabmatAnis = {"Html" , "CSS" , "JAVA" };
		
	//Parcourir le tableau TABNOMS est associé a chacun l'age
		for(int i = 0; i < 6; i++){
			 
			//Anis et KD prof
			if (i <= 1){
			    Professor AnisKd = new Professor(tabNoms[i], age, null, salaire, tabmatAnis);
				tabPersonne[i] = AnisKd;
				
			  }
			  
			  //Dalia etudiant
			  if (i <= 2){
				  Student Dalia = new Student(tabNoms[i], age, " ", numEtud1);
				  tabPersonne[i] = Dalia;
				  
			  }
			  
			//Adil etudiant
			  if (i <= 3){
				  Student Adil = new Student(tabNoms[i], age, " ", numEtud2);
				  tabPersonne[i] = Adil;
				  
			  }
			  
			  //Paul et Jack Personnes
			  if (i > 3) {
				  Personne PaulJack = new Personne(tabNoms[i], age, " ");
				  tabPersonne[i] = PaulJack;				  
			  }
		}
		
		for (Personne p : tabPersonne) {
			p.Description();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
	}

}

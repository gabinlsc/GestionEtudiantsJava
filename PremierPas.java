import java.util.Scanner;

public class PremierPas {
	public static void main(String[] args) {
		// Utilisation du Scanner pour récupérer des variables
		Scanner lecteur = new Scanner(System.in);
		
		// Utilisé afin de pouvoir utiliser les points en tant que virgules
		lecteur.useLocale(java.util.Locale.US);
		
		// Définition des variables pour l'étudiant
		System.out.println("Entrer le prénom de l'étudiant");
		String n1 = lecteur.next();
		System.out.println("Entrer l'âge de l'étudiant");
		int a1 = lecteur.nextInt();
		
		// Création de l'étudiant
		Etudiant eleve1 = new Etudiant(n1,a1);
		
		// Présentation de l'étudiant
		System.out.println(eleve1.sePresenter());
		
		// Demande des notes de l'étudiant
		eleve1.setNotes(saisirNotes(lecteur, 5));
		
		// Initialisation des variables
		double moyenne;
		String mention ="";
		double notemax;
		
		// Affichage de la liste des notes récupérées
		System.out.print("Notes obtenues : ");
		for (double maNote : eleve1.getNotes()) {
			System.out.print(maNote + " | ");
		}
		
		// Les variables utilisent les méthodes pour récupérer les valeurs
		notemax = eleve1.noteMax();
		moyenne = eleve1.calculerMoyenne();
		mention = calculerMention(moyenne);
		
		// Erreur en cas de dépassement de la valeur maximale
		if (moyenne > 20) {
			System.out.println("Les notes ne vont pas au dessus de 20,0.");
		} 
		
		//Affichage de résultats finaux et fermeture du Scanner
		System.out.println("\n"+mention + "\nMoyenne : "+moyenne+" \nMeilleure note : "+notemax);
		lecteur.close();
	}
	
	// Méthode utilisées pour afficher la mention
	public static String calculerMention(double note) {
	    if (note >= 16) return "Mention très bien";
	    if (note >= 14) return "Mention bien";
	    if (note >= 12) return "Mention assez bien";
	    else return "Pas de mention";
	}
	
	// Méthode utilisée pour récupérer la saisie des notes
	public static double[] saisirNotes(Scanner lecteur, int nbNotes) {
		double[] notes = new double[nbNotes];
		for (int i = 0;i<nbNotes;i++) {
			System.out.println("Entrez la note obtenue n°"+ (i+1) +"(Format à virgule)");
			double note = lecteur.nextDouble();
			notes[i] = note;
		}
		return notes;
	}
}
	

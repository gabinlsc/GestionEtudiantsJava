import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class PremierPas {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Utilisation du Scanner pour récupérer des variables
		Scanner lecteur = new Scanner(System.in);
		ArrayList<Etudiant> listeEtudiants = new ArrayList<>();
		// Utilisé afin de pouvoir utiliser les points en tant que virgules
		lecteur.useLocale(java.util.Locale.US);
		boolean continuer = true;

		do {
			String n1 = saisirStringSecurise(lecteur, "Entrez le prénom de l'étudiant : ");
			int a1 = saisirEntierSecurise(lecteur, "Entrer l'âge de l'étudiant : ");
			Etudiant e = new Etudiant(n1,a1);
			int nbNotes = saisirEntierSecurise(lecteur, "Entrer le nombre de notes à calculer : ");
			e.setNotes(saisirNotes(lecteur, nbNotes));
		    listeEtudiants.add(e);
		    String reponse = "";
		    reponse = saisirStringSecurise(lecteur, "Voulez-vous ajouter un autre étudiant ? (o/n) : ");
		    if (reponse.equalsIgnoreCase("n")) {
		    	continuer = false;
		 }
		} while (continuer);
		
		sauvegarderDonnees(listeEtudiants);
		System.out.println("Major de la promo : "+(trouverMajor(listeEtudiants)).sePresenter());
		double sommeMoyennes = 0;
		double mg = 0;
		for (Etudiant e : listeEtudiants) {
			double moyenne;
			String mention = "";
			double notemax;
		    System.out.print("Notes obtenues par l'élève "+e.getPrenom()+" : ");
		    for (double maNote : e.getNotes()) {
		    	System.out.print(maNote + " | ");
		    }
		    notemax = e.noteMax();
		    moyenne = e.calculerMoyenne();
		    sommeMoyennes+=moyenne;
		    mention = calculerMention(moyenne);
			
			//Affichage de résultats finaux et fermeture du Scanner
			System.out.println("\n"+mention);
			System.out.println("Moyenne : "+moyenne);
			System.out.println("Meilleure note : "+notemax+"\n");
			System.out.println("-------------------------------------------\n");
		}
		mg = sommeMoyennes/listeEtudiants.size();
		System.out.println("-------------------------------------------");
		System.out.println("Moyenne générale de la classe : "+mg);
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
			double note = saisirDoubleSecurise(lecteur,"Entrez la note obtenue n°"+ (i+1)+" : ");
			notes[i] = note;
		}
		return notes;
	}
	public static int saisirEntierSecurise(Scanner lecteur, String message) {
		int valeur = 0;
		boolean valide = false;
		while (!valide) {
			try{
				System.out.print(message);
				valeur = lecteur.nextInt();
				valide = true;
			} catch (Exception e) {
				System.out.println("Veuillez entrer un entier valide.");
				lecteur.next();
			}
		}
		return valeur;
	}
	public static double saisirDoubleSecurise(Scanner lecteur, String message) {
	    double valeur = 0;
	    boolean valide = false;
	    
	    while (!valide) {
	        try {
	            System.out.print(message);
	            valeur = lecteur.nextDouble();
	            
	            if (valeur >= 0 && valeur <= 20) {
	                valide = true; 
	            } else {
	                System.out.println("Erreur : La valeur doit être comprise entre " + 0 + " et " + 20);
	            }
	        } catch (Exception e) {
	            System.out.println("Erreur : Veuillez entrer un nombre valide.");
	            lecteur.next(); 
	        }
	    }
	    return valeur;
	}
	public static String saisirStringSecurise(Scanner lecteur, String message) {
	    String valeur = "";
	    boolean valide = false;
	    
	    while (!valide) {
	        System.out.print(message);
	        valeur = lecteur.next();
	        
	        if (!valeur.isBlank()) {
	            valide = true;
	        } else {
	            System.out.println("Erreur : la saisie ne peut pas être vide.");
	        }
	    }
	    return valeur;
	}
	
	public static void sauvegarderDonnees(ArrayList<Etudiant> liste) {
	    String nomFichier = "etudiants.csv";
	    try (PrintWriter writer = new PrintWriter(new FileWriter(nomFichier))) {
	        for (Etudiant e : liste) {
	            writer.println(e.toCSV());
	        }
	        System.out.println("Sauvegarde réussie dans " + nomFichier);
	    } catch (IOException e) {
	        System.out.println("Erreur technique lors de la sauvegarde : " + e.getMessage());
	    }
	}
	public static Etudiant trouverMajor(ArrayList<Etudiant> liste) {
	    if (liste.isEmpty()) {
	        return null; 
	    }

	    Etudiant major = liste.get(0); 

	    for (int i = 1; i < liste.size(); i++) {
	        Etudiant etudiantActuel = liste.get(i);
	        if (etudiantActuel.calculerMoyenne() > major.calculerMoyenne()) {
	        	major = etudiantActuel;
	        }
	    }
	    
	    return major;
	}
	
	
	
}
	

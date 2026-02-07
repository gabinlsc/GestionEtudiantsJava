public class Etudiant {
	private double[] notes;
	private String prenom;
	private int age;
	public Etudiant(String p, int a) {
		prenom = p;
		age = a;
	}
	public String sePresenter(){
		return ("L'étudiant se nomme " + prenom + ", il a " + age +" ans");
	}
	public String getPrenom(){
		return prenom;
	}
	public int getAge(){
		return age;
	}
	public double[] getNotes(){
		return notes;
	}
	public void setNotes(double[] nouvellesNotes){
		notes = nouvellesNotes;
	}
	public double calculerMoyenne(){
		double somme = 0;
		double moyenne;
		for (double maNote : notes) {
			somme += maNote;
		}
		moyenne = somme/notes.length;
		return moyenne;
	}
	public double noteMax(){
		double notemax = 0;
		for (double maNote : notes) {
			if (maNote > notemax) {
				notemax = maNote;
			}
		}
		return notemax;
	}
}

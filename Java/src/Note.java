/**
 * @(#) Note.java
 */

public class Note
{
	private Abonne abonneNoteur;
	
	private int note;
	
	private String commentaire;
	
	private Bar barNote;
	
	/**
	 * Génère une Note
	 * @param abonneNoteur
	 * @param note
	 * @param commentaire
	 * @param barNote
	 */
	
	public Note( Abonne a, int val, String com, Bar b )
	{
		this.abonneNoteur = a;
		this.note = val;
		this.commentaire = com;
		this.barNote = b;
	}
	
	public Abonne getAbonneNoteur() {
		return abonneNoteur;
	}

	public int getNote() {
		return note;
	}
	
	public String getCommentaire() {
		return commentaire;
	}
	
	public Bar getBarNote() {
		return barNote;
	}
	
	public void setAbonneNoteur(Abonne abonneNoteur) {
		this.abonneNoteur = abonneNoteur;
	}
	
	public void setNote(int note) {
		this.note = note;
	}
	
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	
	public void setBarNote(Bar barNote) {
		this.barNote = barNote;
	}
	

	public boolean transfererNote(Abonne a)
	{
		this.abonneNoteur = a;
		return true;
	}
	
	public boolean supprimerNote( )
	{
		//Cette fonction doit se trouver dans le catalogue
		return false;
	}
	
	
}

/**
 * @(#) Note.java
 */

public class Note
{
	private Abonne abonneNoteur;
	
	private int note;
	
	private String commentaire;
	
	private Bar barNote;
	/*Ajout de la methode get Abonne*/
	public Note( Abonne u, int val, String com, Bar b )
	{
		
	}
	
	public boolean transfererNote( )
	{
		return false;
	}
	
	public boolean supprimerNote( )
	{
		return false;
	}
	public Abonne getNoteur()
	{
		return this.abonneNoteur;
	}
	
	
}

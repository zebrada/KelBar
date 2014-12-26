/**
 * @(#) Gerant.java
 */

public class Gerant extends Utilisateur
{
	private Bar listeBar;
	
	public Gerant( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		
	}
	
	public Gerant( Abonne abonne )
	{
		
	}
	
	public boolean supprimerGerant( )
	{
		return false;
	}
	
	public boolean supprimerLiensBars( )
	{
		return false;
	}
	
	public boolean supprimerLienBar( Bar b1 )
	{
		return false;
	}
	
	
}

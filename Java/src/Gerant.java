/**
 * @(#) Gerant.java
 */

public class Gerant extends Utilisateur
{
	private Bar listeBar;
	
	public Gerant( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		super(pseudo, prenom, nom, adresse, dateNaissance, email, motDePasse);
	}
	
	public Gerant( Abonne abonne )
	{
		super(pseudo, prenom, nom, adresse, dateNaissance, email, motDePasse);
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

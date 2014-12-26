/**
 * @(#) Utilisateur.java
 */

public abstract class Utilisateur
{
	private String pseudo;
	
	private String prenom;
	
	private String nom;
	
	private Adresse adresse;
	
	private String dateNaissance;
	
	private String email;
	
	private String motDePasse;
	
	private boolean connecte;
	
	private boolean connexionAutorise;
	
	public void seConnecter( )
	{
		
	}
	
	public void seDeconnecte( )
	{
		
	}
	
	public boolean modifierInformation( String pseudo, String nom, String prenom, Adresse adresse, String email, String mdp, String mdp2 )
	{
		return false;
	}
	
	
}

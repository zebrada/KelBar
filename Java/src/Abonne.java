/**
 * @(#) Abonne.java
 */

// Coucou

public class Abonne extends Utilisateur
{
	private Bar barsFavoris;
	
	private Abonne listeAmi;
	
	private Abonne listeDemandeEnAmi;
	
	private Abonne listeRecoitDemandeEnAmi;
	
	private Note sesNotes;
	
	private Evenement listeEvenementsParticipe;
	
	private Evenement listeInvitationEvenement;
	
	public Abonne( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		
	}
	
	public Abonne( Gerant gerant )
	{
		
	}
	
	public boolean inviterEvenement( Evenement e1 )
	{
		return false;
	}
	
	public void supprimerAbonne( )
	{
		
	}
	
	public boolean supprimerLiensEvenements( )
	{
		return false;
	}
	
	public boolean supprimerNote( Note n1 )
	{
		return false;
	}
	
	public boolean supprimerLiensAmis( )
	{
		return false;
	}
	
	public boolean ajouterNote( Note n1 )
	{
		return false;
	}
	
	public boolean supprimerLienEvenement( Evenement e1 )
	{
		return false;
	}
	
	public boolean supprimerNotes( )
	{
		return false;
	}
	
	public boolean inviterAmi( Abonne a1 )
	{
		return false;
	}
	
	public boolean accepterAmi( Abonne a1 )
	{
		return false;
	}
	
	public boolean refuserAmi( Abonne a1 )
	{
		return false;
	}
	
	public boolean supprimerAmi( Abonne a1 )
	{
		return false;
	}
	
	public Abonne chercherAmi( String nom, String prenom )
	{
		return null;
	}
	
	
}

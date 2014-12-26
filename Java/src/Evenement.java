/**
 * @(#) Evenement.java
 */

public class Evenement
{
	private String nom;
	
	private Bar bar;
	
	private boolean estPublic;
	
	private String dateDebut;
	
	private String heureDebut;
	
	private Abonne leCreateur;
	
	private Abonne listeParticipant;
	
	private Abonne listeInvite;
	
	public void evenement( String nom, String heureDebut, boolean visibilité, Abonne listeInvitation, Abonne createur, String dateDebut )
	{
		
	}
	
	public boolean supprimerEvenement( )
	{
		return false;
	}
	
	public boolean SupprimerParticipantCreateur( Abonne a1 )
	{
		return false;
	}
	
	public boolean inscrireAbonne( Abonne a1 )
	{
		return false;
	}
	
	public boolean inviter( Abonne a, Utilisateur demandeur )
	{
		return false;
	}
	
	
}

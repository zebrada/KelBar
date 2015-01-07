package appModel;
import java.util.ArrayList;

/**
 * @(#) Abonne.java
 */


public class Abonne extends Utilisateur
{
	private ArrayList<Bar> barsFavoris;

	private ArrayList<Abonne> listeAmi;

	private ArrayList<Abonne> listeDemandeEnAmi;

	private ArrayList<Abonne> listeRecoitDemandeEnAmi;

	private ArrayList<Note> sesNotes;

	private ArrayList<Evenement> listeEvenementsParticipe;

	private ArrayList<Evenement> listeInvitationEvenement;

	public Abonne( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, String motDePasse)
	{
		super(pseudo, prenom, nom, adresse, dateNaissance, email, motDePasse);
	}

	public Abonne( Gerant gerant )
	{
		super(gerant.getPseudo(), gerant.getPrenom(), gerant.getNom(), gerant.getAdresse(), gerant.getDateNaissance(), gerant.getEmail(), gerant.getMotDePasse());

		gerant.supprimerGerant();
	}	

	public boolean inviterEvenement( Evenement e1 )
	{
		return false;
	}

	public void supprimerAbonne( )
	{
		//On retire les notes
		this.supprimerNotes();

		//On retire toute les demande d'ami
		for (int i = 0; i < listeDemandeEnAmi.size(); i++) {
			listeDemandeEnAmi.get(i).refuserAmi(this);
		}

		//On retire tout ses amis
		this.supprimerLiensAmis();

		//On refuse les invitations d'evenements
		for (int i = 0; i < listeInvitationEvenement.size(); i++) {	
			this.refuserEvenement(listeInvitationEvenement.get(i));
		}
		
		//On refuse tout les évements participées
		this.supprimerLiensEvenements();
	}

	/**
	 * On retire tout evenements des évenements où l'abonné a accepté l'invitation
	 * @return
	 */
	public boolean supprimerLiensEvenements( )
	{
		//On retire les évenements
		int i = 0;
		boolean retour = true;
		while (retour && i < listeEvenementsParticipe.size())
		{			
			retour = this.supprimerLienEvenement(listeEvenementsParticipe.get(i));
			
			i++;
		}
		
		while (i < listeEvenementsParticipe.size())
		{			
			retour = this.supprimerLienEvenement(listeEvenementsParticipe.get(i));
			
			i++;
		}
		
		return retour;
	}

	public boolean supprimerNote( Note n1 )
	{
		return this.sesNotes.remove(n1);
	}

	public boolean supprimerLiensAmis( )
	{
		int i = 0;
		boolean retour = true;
		while (retour && i < listeAmi.size())
		{			
			retour = this.supprimerAmi(listeAmi.get(i));
			
			i++;
		}
		
		while (i < listeAmi.size())
		{			
			retour = this.supprimerAmi(listeAmi.get(i));
			
			i++;
		}
		
		return retour;
	}

	public boolean ajouterNote( Note n1 )
	{
		if (this.sesNotes.contains(n1))
		{
			return sesNotes.add(n1);
		}
		return true;
	}

	/**
	 * On retire un evenement des évenements où l'abonné a accepté l'invitation
	 * @param e1
	 * @return
	 */
	public boolean supprimerLienEvenement( Evenement e1 )
	{
		return this.listeInvitationEvenement.remove(e1);
	}

	public boolean supprimerNotes()
	{
		int i = 0;
		boolean retour = true;
		while (retour && i < sesNotes.size())
		{			
			retour = this.sesNotes.get(i).supprimerNote();

			i++;
		}

		while (i < sesNotes.size())
		{			
			retour =  this.sesNotes.get(i).supprimerNote();

			i++;
		}

		return retour;
	}

	public boolean inviterAmi( Abonne a1 )
	{
		if (this.listeRecoitDemandeEnAmi.contains(a1))
		{
			return this.accepterAmi(a1);
		}
		
		if (this.listeDemandeEnAmi.contains(a1))
		{
			return true;
		}
		
		if (this.listeDemandeEnAmi.add(a1))
		{
			return a1.estinviterAmiPar(this);			
		}
		
		return false;
	}
	
	public boolean estinviterAmiPar( Abonne a1 )
	{
		if (this.listeDemandeEnAmi.contains(a1))
		{
			return this.accepterAmi(a1);
		}
		
		if (this.listeRecoitDemandeEnAmi.contains(a1))
		{
			return true;
		}
		
		return this.listeRecoitDemandeEnAmi.add(a1);
	}

	public boolean accepterAmi( Abonne a1 )
	{
		if (this.listeAmi.contains(a1))
		{
			return true;
		}
		
		this.listeDemandeEnAmi.remove(a1);
		this.listeRecoitDemandeEnAmi.remove(a1);
		
		if ( this.listeAmi.add(a1) )
		{
			return a1.accepterAmi(this);
		}
		
		return false;
	}

	public boolean refuserAmi( Abonne a1 )
	{
		boolean retour1 = true;
		boolean retour2 = true;
		boolean refuserami = false;
		if (listeDemandeEnAmi.contains(a1))
		{
			refuserami = true;
			retour1 = this.listeDemandeEnAmi.remove(a1);
		}
			
		
		
		if (listeRecoitDemandeEnAmi.contains(a1))
		{
			refuserami = true;
			retour2 = this.listeRecoitDemandeEnAmi.remove(a1);
		}
			
		if (refuserami)
		a1.refuserAmi(this);
	
		return retour1 && retour2;
	}
	
	public boolean refuserEvenement( Evenement e1 )
	{
		if (this.listeInvitationEvenement.contains(e1))
		{
			return this.listeInvitationEvenement.remove(e1);
		}
		return true;
	}

	public boolean supprimerAmi( Abonne a1 )
	{
		boolean retour = true;
		
		if (this.listeAmi.contains(a1))
		{
			retour = this.listeAmi.remove(a1);
			a1.supprimerAmi(this);
		}	
	
		return retour;
	}
	
	public ArrayList<Abonne> chercherAmi( String nom, String prenom )
	{
		ArrayList<Abonne> retour = new ArrayList<Abonne>();
		
		for (int i = 0; i < this.listeAmi.size(); i++) {
			Abonne unAmi = this.listeAmi.get(i);
			if (unAmi.getNom().contains(nom) || unAmi.getPrenom().contains(prenom))
			{
				retour.add(unAmi);
			}
		}
		
		return retour;
	}
	
	public boolean ajouterBarFavoris(Bar unBar)
	{
		if (this.barsFavoris.contains(unBar))
			return true;
		
		return this.barsFavoris.add(unBar);
	}
	
	public boolean supprimerBarFavoris(Bar unBar)
	{
		if (this.barsFavoris.contains(unBar))
			return this.barsFavoris.remove(unBar);
		
		return true;
		
		
	}
	
	public ArrayList<Evenement> getListeEvenementsParticipe(){
		return this.listeEvenementsParticipe;
	
	}
}

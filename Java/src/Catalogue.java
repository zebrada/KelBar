import java.util.ArrayList;
import java.util.List;

/**
 * @(#) Catalogue.java
 */

public class Catalogue
{
	private List<Bar> listeBar;
	
	private List<Evenement> listeEvenement;
	
	private List<Utilisateur> listeUtilisateur;
	
	public List<Utilisateur> chercherUtilisateur( String information )
	{
		int i;
		List<Utilisateur> resultat = new ArrayList<Utilisateur>();
		for(i=0; i< listeUtilisateur.size();i++)
		{
			if((information == listeUtilisateur.get(i).getPseudo())||(information == listeUtilisateur.get(i).getPrenom())||(information == listeUtilisateur.get(i).getNom()))
				resultat.add(listeUtilisateur.get(i));
		}
		return resultat;
	}
	
	public List<Bar> chercherBar( String information )
	{
		int i;
		List<Bar> resultat = new ArrayList<Bar>();
		for(i=0;i < listeBar.size();i++)
		{
			if((information == listeBar.get(i).getNom())||(information == listeBar.get(i).getAdresse().getNomRue()))
				resultat.add(listeBar.get(i));
		}
		return resultat;
	}
	
	public List<Evenement> chercherEvenement( String information )
	{
		int i;
		List<Evenement> resultat = new ArrayList<Evenement>();
		for(i=0;i < listeEvenement.size();i++)
		{
			if(information == listeEvenement.get(i).getNom())
				resultat.add(listeEvenement.get(i));
		}
		return resultat;
	}
	
	public boolean abonneVersGerant( Abonne a1 )
	{
		return false;
	}
	
	public boolean ajouterNote( Abonne a1, int note, String commentaire, Bar b1 )
	{
		return false;
	}
	
	public void creerAbonne( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		
	}
	
	public void creerAbonne( Gerant gerant )
	{
		
	}
	
	public void supprimerAbonne( Abonne abonne )
	{
		
	}
	
	public void creerEvenement( String nom, String dateHeureDebut, boolean visibilite, Abonne listeInvitation, Abonne createur )
	{
		
	}
	
	public boolean supprimerEvenement( Evenement ev )
	{
		return false;
	}
	
	public boolean abonneVersGerant( Abonne a1, Bar b1 )
	{
		return false;
	}
	
	public boolean gerantVersAbonne( Gerant g1 )
	{
		return false;
	}
	
	public boolean deconnecterUtilisateur( Utilisateur u1 )
	{
		return false;
	}
	
	public boolean supprimerUtilisateur( Utilisateur u1 )
	{
		return false;
	}
	
	public boolean selectionnerBar( Bar b1, Utilisateur u1 )
	{
		return false;
	}
	
	public boolean noterBar( Bar b1, int val, String com, Utilisateur u1 )
	{
		return false;
	}
	
	public Evenement chercherEvenementDesAmis( Abonne listeAmis )
	{
		return null;
	}
	
	public boolean inscrireEvenement( Utilisateur u1, Evenement e1 )
	{
		return false;
	}
	
	public boolean selectionnerEvenement( Evenement e1, Utilisateur u1 )
	{
		return false;
	}
	
	public Evenement chercherEvenementBar( Bar b1 )
	{
		return null;
	}
	
	public Utilisateur tentativeConnection( String pseudo, String mdp )
	{
		return null;
	}
	
	public void creerEvenement( String nom, String dateDebut, boolean visibilit�, Abonne listeInvitation, Abonne createur, String heureDebut )
	{
		
	}
	
	public void creerAdministrateur( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, boolean estSuperAdmin )
	{
		
	}
	
	public void creerAdministrateur( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		
	}
	
	public void creerGerant( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		
	}
	
	public void creerGerant( Abonne abonne )
	{
		
	}
	
	public boolean connecterUtilisateur( Utilisateur u1 )
	{
		return false;
	}
	
	public boolean accepterAmi( Abonne ab_Demandeur, Abonne ab_Accepteur )
	{
		return false;
	}
	
	public boolean refuserAmi( Abonne ab_Demandeur, Abonne ab_Refuseur )
	{
		return false;
	}
	
	public boolean ajouterAmi( Abonne ab_Demandeur, Abonne ab_Accepteur )
	{
		return false;
	}
	
	public boolean supprimerLienAmi( Abonne ab1, Abonne ab2 )
	{
		return false;
	}
	
	public void verifStatutUtilisateur( Utilisateur u1 )
	{
		
	}
	
	public boolean modifierBar( Bar b1, String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		return false;
	}
	
	public boolean modifierUtilisateur( Utilisateur u, String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		return false;
	}
	
	public boolean modifierEvenement( Evenement e1, String nom, String dateDebut, boolean visibilite, Abonne isteInvitation, Abonne createur, String heureDebut )
	{
		return false;
	}
	
	public void creerBar( String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		
	}
	
	public void creerBarTemporaire( String nom, int capacite, Adresse adresse, String dateSuppression )
	{
		
	}
	
	public void accepterBar( Bar b1 )
	{
		
	}
	
	
}

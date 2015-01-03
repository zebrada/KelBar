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
	/*valeur de retour void et nonn bool*/
	public void abonneVersGerant( Abonne a1 )
	{
		Gerant g1 = new Gerant(a1);
		a1 = null;
		System.gc();
	}
	/*Je vai le faire*/
	public boolean ajouterNote( Abonne a1, int note, String commentaire, Bar b1 )
	{
		Note n1 = new Note( a1, note, commentaire, b1 );
		
	}
	
	public void creerAbonne( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		Abonne a1 = new Abonne(prenom, nom, adresse, dateNaissance, email, pseudo);
		listeUtilisateur.add(a1);
	}
	
	public void creerAbonne( Gerant gerant )
	{
		listeUtilisateur.add(gerant);
	}
	
	public void supprimerAbonne( Abonne abonne )
	{
		int i;
		for( i =0; i < listeUtilisateur.size();i++)
		{
			if(listeUtilisateur.get(i)==abonne)
				listeUtilisateur.remove(i);
		}
	}
	/*Ajout d'un bar dans les paramètres */
	public void creerEvenement( String nom, String dateHeureDebut, boolean visibilite, Abonne listeInvitation, Abonne createur,Bar b )
	{
		Evenement e1 = new Evenement(nom, heureDebut, visibilite,List<Abonne> listeInvitation, createur, b);
	}
	/*Je vai le faire*/
	public boolean supprimerEvenement( Evenement ev )
	{
		return false;
	}
	
	public boolean abonneVersGerant( Abonne a1, Bar b1 )
	{
		Gerant g1 = new Gerant()
		return false;
	}
	/* retour de la methode void pas boolean */
	public boolean gerantVersAbonne( Gerant g1 )
	{
		supprimerAbonne(g1);
		Abonne a1= new Abonne (g1);
		listeUtilisateur.add(a1);
	}
	
	public boolean deconnecterUtilisateur( Utilisateur u1 )
	{
		u1.setConnecte(false);
		return true;
	}
	
	public boolean supprimerUtilisateur( Utilisateur u1 )
	{
		int i;
		for(i=0;i< listeUtilisateur.size();i++)
		{
			if(u1 == listeUtilisateur.get(i))
				listeUtilisateur.remove(i);
		}
		return false;
	}
	
	public boolean selectionnerBar( Bar b1, Utilisateur u1 )
	{
		return false;
	}
	/*Je vai le faire*/
	public boolean noterBar( Bar b1, int val, String com, Utilisateur u1 )
	{
		Note n1 = new Note(u1, val, com, b1 );
		return false;
	}
	/*Je vai le faire*/
	public List<Evenement> chercherEvenementDesAmis( Liste<Abonne> listeAmis )
	{
		int i,j;
		for(i=0; i<listeAmis.size();i++)
		{
			for(j=0; j < listeAmis.get(i).get)
		}
		return null;
	}
	/*Je vai le faire*/
	public boolean inscrireEvenement( Utilisateur u1, Evenement e1 )
	{
		return false;
	}
	
	public boolean selectionnerEvenement( Evenement e1, Utilisateur u1 )
	{
		return false;
	}
	/*Je vai le faire*/
	public list<Evenement> chercherEvenementBar( Bar b1 )
	{
		return b1.getListeEvenements();
	}
	
	public Utilisateur tentativeConnection( String pseudo, String mdp )
	{
		return null;
	}
	
	public void creerEvenement( String nom, String dateDebut, boolean visibilite, Abonne listeInvitation, Abonne createur, String heureDebut )
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
	/*Je vai le faire*/
	public boolean modifierBar( Bar b1, String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		return false;
	}
	/*Je vai le faire*/
	public boolean modifierUtilisateur( Utilisateur u, String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		return false;
	}
	/*Je vai le faire*/
	public boolean modifierEvenement( Evenement e1, String nom, String dateDebut, boolean visibilite, Abonne isteInvitation, Abonne createur, String heureDebut )
	{
		return false;
	}
	/*Je vai le faire*/
	public void creerBar( String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		
	}
	/*Je vai le faire*/
	public void creerBarTemporaire( String nom, int capacite, Adresse adresse, String dateSuppression )
	{
		
	}
	/*Je vai le faire*/
	public void accepterBar( Bar b1 )
	{
		
	}
	
	
}

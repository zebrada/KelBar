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
		if(!a1.isConnecte()){
			return false;
		}else{
			a1.setConnexionAutorise(false);
			Gerant g= new Gerant(a1);
			this.listeUtilisateur.remove(a1);
			this.listeUtilisateur.add(g);
			return true;
		}
	}
	
	public boolean creerAbonne( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, String motDePasse )
	{
		Utilisateur u;
		for(int i=0; i<this.listeUtilisateur.size(); i++){
			u=this.listeUtilisateur.get(i);
			if(u.getPseudo().equals(pseudo)){
				System.out.println("pseudo deja present");
				return false;
			}
		}
		Abonne a1 = new Abonne(prenom, nom, adresse, dateNaissance, email, pseudo, motDePasse);
		listeUtilisateur.add(a1);
		
		return true;

	}
	
	public void supprimerAbonne( Abonne abonne )
	{
		int i;
		for( i =0; i < listeUtilisateur.size();i++)
		{
			if(listeUtilisateur.get(i)==abonne)
				listeUtilisateur.remove(i);
		}
		abonne.supprimerAbonne( );
	}
	
	public boolean supprimerEvenement( Evenement ev )
	{
		if(listeEvenement.contains(ev))
		{
			int i;
			for( i =0; i < listeEvenement.size();i++)
			{
				if(listeEvenement.get(i)==ev)
					listeEvenement.remove(i);
			}
			ev.supprimerEvenement( );
			return true;
		}
		return false;
	}
	
	public boolean abonneVersGerant( Abonne a1, Bar b1 )
	{
		if(!a1.isConnecte() && b1.getGerant()==null){
			return false;
		}else{
			a1.setConnexionAutorise(false);
			Gerant g= new Gerant(a1);
			this.listeUtilisateur.remove(a1);
			this.listeUtilisateur.add(g);
			b1.setGerant(g);
			return true;
		}
		
	}
	
	
	
	public boolean gerantVersAbonne( Gerant g1 )
	{
		if(!g1.isConnecte()){
			return false;
		}else{
		g1.setConnexionAutorise(false);
		Abonne a= new Abonne(g1);
		this.listeUtilisateur.remove(g1);
		this.listeUtilisateur.add(a);
		return true;
		}
	}
	
	
	public boolean deconnecterUtilisateur( Utilisateur u1 )
	{
		return u1.seDeconnecte();
	
	}
	
	
	/*utiliser les methode supprimer de Abonn�, Gerant et Admin*/
	public boolean supprimerUtilisateur( Utilisateur u1 )
	{
		if(listeUtilisateur.contains(u1))
		{
			int i;
			for(i=0;i< listeUtilisateur.size();i++)
			{
				if(u1 == listeUtilisateur.get(i))
					listeUtilisateur.remove(i);
			}
			u1 = null;
			return true;
		}
		return false;
	}
	/*Au niveau de l'interface*/
	public boolean selectionnerBar( Bar b1, Utilisateur u1 )
	{
		return false;
	}
	
	public boolean noterBar( Bar b1, int val, String com, Utilisateur u1 )
	{
		if(this.verifStatutUtilisateur(u1) == 1){
			if(!b1.dejaNoter((Abonne)u1)){
				b1.noter(new Note((Abonne)u1,val,com,b1));
				return true;
				
			}
		}
		return false;
	}
	
	public List<Evenement> chercherEvenementDesAmis( List<Abonne> listeAmis )
	{
		
		List<Evenement> listeEvenementDesAmis= new ArrayList<Evenement>();
		int i,j;
		for(i=0; i<listeAmis.size();i++)
		{
			for(j=0; j < listeAmis.get(i).getListeEvenementsParticipe().size(); j++){
				listeEvenementDesAmis.add(listeAmis.get(i).getListeEvenementsParticipe().get(j));
			}
		}
		return listeEvenementDesAmis;
	}
	
	public boolean inscrireEvenement( Abonne a, Evenement e1 )
	{
		e1.inscrireAbonne(a);
		return false;
	}
	
	public boolean selectionnerEvenement( Evenement e1, Utilisateur u1 )
	{
		return false;
	}
	
	public List<Evenement> chercherEvenementBar( Bar b1 )
	{
		return b1.getListeEvenements();
	}
	
	public Utilisateur tentativeConnection( String pseudo, String mdp )
	{
		Utilisateur u;
		for(int i=0; i<this.listeUtilisateur.size(); i++){
			u=this.listeUtilisateur.get(i);
			if(u.getPseudo().equals(pseudo) && u.getMotDePasse().equals(mdp)){
				if(u.isConnexionAutorise()){
					u.seConnecter();
					return u;
				}
			}
		}
		return null;
	}

	public void creerEvenement( String nom, String dateDebut, boolean visibilite, List<Abonne> listeInvitation, Abonne createur, String heureDebut,Bar b )
	{
		Evenement e1 = new Evenement(nom,dateDebut, visibilite, listeInvitation, createur,heureDebut, b);
		this.listeEvenement.add(e1);
	}
	
	public boolean creerAdministrateur( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, String motDePasse, boolean estSuperAdmin )
	{
		/*verif si pseudo deja present*/
		Utilisateur u;
		for(int i=0; i<this.listeUtilisateur.size(); i++){
			u=this.listeUtilisateur.get(i);
			if(u.getPseudo().equals(pseudo)){
				System.out.println("pseudo deja present");
				return false;
			}
		}
		
		Administrateur a=new Administrateur(prenom, nom, adresse, dateNaissance, email, pseudo, motDePasse, estSuperAdmin );
		
		this.listeUtilisateur.add(a);
		return true;
	}
	
	public boolean creerAdministrateur( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, String motDePasse )
	{
		/*verif si pseudo deja present*/
		Utilisateur u;
		for(int i=0; i<this.listeUtilisateur.size(); i++){
			u=this.listeUtilisateur.get(i);
			if(u.getPseudo().equals(pseudo)){
				System.out.println("pseudo deja present");
				return false;
			}
		}
		
		Administrateur a=new Administrateur(prenom, nom, adresse, dateNaissance, email, pseudo, motDePasse);
		
		this.listeUtilisateur.add(a);
		return true;
	}
	
	public boolean creerGerant( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, String motDePasse )
	{
		/*verif si pseudo deja present*/
		Utilisateur u;
		for(int i=0; i<this.listeUtilisateur.size(); i++){
			u=this.listeUtilisateur.get(i);
			if(u.getPseudo().equals(pseudo)){
				System.out.println("pseudo deja present");
				return false;
			}
		}
		
		Gerant g=new Gerant( prenom, nom, adresse, dateNaissance, email, pseudo, motDePasse);
		this.listeUtilisateur.add(g);
		return true;
		
	}	
	
	/* a quoi sert cette methode ?
	 * il y a deja une methode pour la connexion : tentativeConnection( String pseudo, String mdp )
	 * */
	public boolean connecterUtilisateur( Utilisateur u1 )

	{
		return false;
	}
	
	
	
	public boolean accepterAmi( Abonne ab_Demandeur, Abonne ab_Accepteur )
	{
		return ab_Accepteur.accepterAmi(ab_Demandeur);
	}
	
	public boolean refuserAmi( Abonne ab_Demandeur, Abonne ab_Refuseur )
	{
		
		return ab_Refuseur.refuserAmi(ab_Demandeur);
	}
	
	public boolean ajouterAmi( Abonne ab_Demandeur, Abonne ab_Accepteur )
	{
		return ab_Demandeur.inviterAmi(ab_Accepteur);
	}
	
	public boolean supprimerLienAmi( Abonne ab1, Abonne ab2 )
	{
		ab1.supprimerAmi(ab2);
		ab2.supprimerAmi(ab1);
		return false;
	}
	
	
	/* retourne 1 si abonné ,2 si gérant et 3 pour les autre*/
	public int verifStatutUtilisateur( Utilisateur u1 )
	{
		if(u1 instanceof Abonne)
			return 1;
		else if(u1 instanceof Gerant)
			return 2;
		else if(u1 instanceof Administrateur)
			return 0;
		return 3;
	}
	
	
	/*Je vai le faire*/
	public boolean modifierBar( Bar b1, String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		if(listeBar.contains(b1))
		{
			b1.setNom(nom);
			b1.setHeureOuverture(heureOuverture);
			b1.setHeureFermeture(heureFermeture);
			b1.setCapaciteBar(capacite);
			b1.setPromotion(promotion);
			b1.setEmplacementPhoto(emplacementPhoto);
			b1.setAdresse(adresse);
			b1.setGerant(gerant);
		}
		return false;
	}
	
	public boolean modifierUtilisateur( Utilisateur u, String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo )
	{
		if(listeUtilisateur.contains(u))
		{
			u.setPrenom(prenom);
			u.setNom(nom);
			u.setAdresse(adresse);
			u.setDateNaissance(dateNaissance);
			u.setEmail(email);
			u.setPseudo(pseudo);
		}
		return false;
	}
	
	public boolean modifierEvenement( Evenement e1, String nom, String dateDebut, boolean visibilite, List<Abonne> listeInvitation, Abonne createur, String heureDebut )
	{
		if(listeEvenement.contains(e1))
		{
			e1.setNom(nom);
			e1.setDateDebut(dateDebut);
			e1.setVisible(visibilite);
			e1.setListeInvite(listeInvitation);
			e1.setLeCreateur(createur);
			e1.setHeureDebut(heureDebut);
		}
		return false;
	}
	
	public void creerBar( String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		Bar b1 = new Bar(nom, heureOuverture, heureFermeture, capacite, promotion, emplacementPhoto, adresse, gerant );
		if(listeBar.contains(b1))
			return;
		listeBar.add(b1);
	}
	
	
	/*souci avec le constructeur de bar temporaire dans la classe bar*/
	/*Je vai le faire*/
	public void creerBarTemporaire( String nom, int capacite, Adresse adresse, String dateSuppression )
	{
		listeBar.add(new Bar(nom, capacite, adresse, dateSuppression ));
		/*Faut il l'ajouter à la liste de bar ? OUI*/
	}
	/*Je vai le faire*/
	public void accepterBar( Bar b1 )
	{
		b1.setValide(true);
	}
	
	
}

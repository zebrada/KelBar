

public class Bar
{
	private String nom;
	/* C'est un tableau de note !!!!!!!*/
	private Note[] listeDesNotes;
	
	private Adresse adresse;
	
	private int horodateSuppresion;
	
	private String emplacementPhoto;
	
	private String heureOuverture;
	
	private String heureFermeture;
	
	private int capaciteBar;
	
	private String promotion;
	
	private Gerant gerant;
	
	private Evenement listeEvenements;
	
	private boolean valide;
	
	public Bar( String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse, Gerant gerant )
	{
		this.nom = nom;
		this.heureOuverture = heureOuverture;
		this.heureFermeture = heureFermeture;
		this.capaciteBar = capacite;
		this.promotion = promotion;
		this.emplacementPhoto = emplacementPhoto;
		this.adresse = adresse;
		this.gerant = gerant;
	}
	
	public Bar( String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse )
	{
		this.nom = nom;
		this.heureOuverture = heureOuverture;
		this.heureFermeture = heureFermeture;
		this.capaciteBar = capacite;
		this.promotion = promotion;
		this.emplacementPhoto = emplacementPhoto;
		this.adresse = adresse;	
	}
	/* Parametre dateSuppression pbl de type String ou int*/
	public void BarTemporaire( String nom, int capacite, Adresse adresse, int dateSuppression )
	{
		this.nom = nom;
		this.capaciteBar = capacite;
		this.adresse = adresse;	
		this.horodateSuppresion = dateSuppression;
	}
	
	public boolean supprimerBar( Bar bar)
	{
		bar = null;
		System.gc();
		return false;
	}
	
	public boolean dejaNoter( Abonne a )
	{
		int i;
		for(i=0;i<this.listeDesNotes.length;i++){
			if(this.listeDesNotes[i].getNoteur() == a)
				return true;
		}
		return false;
	}
	
	public boolean supprimerParticipantCreateur( Abonne inviteOuCreateur )
	{
		inviteOuCreateur = null;
		System.gc();
		return false;
	}
	
	public boolean estGerant( Utilisateur u1 )
	{
		return(u1 == this.gerant)?true:false;
	}
	
	
}

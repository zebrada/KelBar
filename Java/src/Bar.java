import java.util.List;



public class Bar
{
	private String nom;
	/* C'est un tableau de note !!!!!!!*/
	private List<Note> listeDesNotes;
	
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
		this.setNom(nom);
		this.setHeureOuverture(heureOuverture);
		this.setHeureFermeture(heureFermeture);
		this.setCapaciteBar(capacite);
		this.setPromotion(promotion);
		this.setEmplacementPhoto(emplacementPhoto);
		this.setAdresse(adresse);
		this.gerant = gerant;
		this.listeDesNotes = new ArrayList()
	}
	
	public Bar( String nom, String heureOuverture, String heureFermeture, int capacite, String promotion, String emplacementPhoto, Adresse adresse )
	{
		this.setNom(nom);
		this.setHeureOuverture(heureOuverture);
		this.setHeureFermeture(heureFermeture);
		this.setCapaciteBar(capacite);
		this.setPromotion(promotion);
		this.setEmplacementPhoto(emplacementPhoto);
		this.setAdresse(adresse);	
	}
	/* Parametre dateSuppression pbl de type String ou int*/
	public void BarTemporaire( String nom, int capacite, Adresse adresse, int dateSuppression )
	{
		this.setNom(nom);
		this.setCapaciteBar(capacite);
		this.setAdresse(adresse);	
		this.setHorodateSuppresion(dateSuppression);
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
		for(i=0;i<this.listeDesNotes.size();i++){
			if(this.listeDesNotes.get(i).getAbonneNoteur() == a)
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
	
	/*Get and set || Accesseurs*/
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getHorodateSuppresion() {
		return horodateSuppresion;
	}

	public void setHorodateSuppresion(int horodateSuppresion) {
		this.horodateSuppresion = horodateSuppresion;
	}

	public String getEmplacementPhoto() {
		return emplacementPhoto;
	}

	public void setEmplacementPhoto(String emplacementPhoto) {
		this.emplacementPhoto = emplacementPhoto;
	}

	public String getHeureOuverture() {
		return heureOuverture;
	}

	public void setHeureOuverture(String heureOuverture) {
		this.heureOuverture = heureOuverture;
	}

	public String getHeureFermeture() {
		return heureFermeture;
	}

	public void setHeureFermeture(String heureFermeture) {
		this.heureFermeture = heureFermeture;
	}

	public int getCapaciteBar() {
		return capaciteBar;
	}

	public void setCapaciteBar(int capaciteBar) {
		this.capaciteBar = capaciteBar;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}
	
	
	public void setGerant(Gerant g) {
		if(this.gerant != null){
			this.gerant = g;
		}
	}
	
	public void setGerantNull() {
		this.gerant = null;
	}
	public Gerant getGerant() {
		return this.gerant;
	}

	public boolean isValide() {
		return valide;
	}

	public void setValide(boolean valide) {
		this.valide = valide;
	}

	public list<Evenement> getListeEvenements() {
		return listeEvenements;
	}

	public void setListeEvenements(Evenement listeEvenements) {
		this.listeEvenements = listeEvenements;
	}
	
	
}

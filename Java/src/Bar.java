import java.util.ArrayList;
import java.util.List;

public class Bar
{
	private String nom;
	/* C'est un tableau de note !!!!!!!*/
	private List<Note> listeDesNotes;
	
	private Adresse adresse;
	
	private String horodateSuppresion;
	
	private String emplacementPhoto;
	
	private String heureOuverture;
	
	private String heureFermeture;
	
	private int capaciteBar;
	
	private String promotion;
	
	private Gerant gerant;
	
	private List<Evenement> listeEvenements;
	
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
		this.listeDesNotes = new ArrayList<Note>();
		this.valide = false;
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
		this.valide = false;
	}
	/* Parametre dateSuppression pbl de type String ou int*/
	//BarTemporaire
	public Bar( String nom, int capacite, Adresse adresse, String dateSuppression )
	{
		this.setNom(nom);
		this.setCapaciteBar(capacite);
		this.setAdresse(adresse);	
		this.setHorodateSuppresion(dateSuppression);
		this.valide = false;
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
	
	public boolean noter(Note n){
		return this.listeDesNotes.add(n);
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

	public String getHorodateSuppresion() {
		return horodateSuppresion;
	}

	public void setHorodateSuppresion(String horodateSuppresion) {
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

	public List<Evenement> getListeEvenements() {
		return listeEvenements;
	}

/* !!!!!!!!!!! erreur au niveau du parametre !!!!!!!!!
 * 
 * soit la methode ajoute un evenement à la liste
 * alors il faut faire un add à la liste 
 * 
 * soit elle affecte une liste dans ce cas le type est List<Evenement>
 * */
	public void setListeEvenements(List<Evenement> listeEvenements) {
		this.listeEvenements = listeEvenements;
	}
	
	
}

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


	/**
	 * Génère un Utilisateur
	 * @param pseudo
	 * @param prenom
	 * @param nom
	 * @param adresse
	 * @param dateNaissance
	 * @param email
	 * @param motDePasse
	 */
	protected Utilisateur(String pseudo, String prenom, String nom,
			Adresse adresse, String dateNaissance, String email,
			String motDePasse, boolean connecte, boolean connexionAutorise) {
		super();
		this.pseudo = pseudo;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.motDePasse = motDePasse;
		this.connecte = connecte;
		this.connexionAutorise = connexionAutorise;
	}
	/**
	 * Génère un Utilisateur non connecté et avec une connexion Autorise
	 * @param pseudo
	 * @param prenom
	 * @param nom
	 * @param adresse
	 * @param dateNaissance
	 * @param email
	 * @param motDePasse
	 */
	protected Utilisateur(String pseudo, String prenom, String nom,
			Adresse adresse, String dateNaissance, String email,
			String motDePasse) {
		super();
		this.pseudo = pseudo;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.dateNaissance = dateNaissance;
		this.email = email;
		this.motDePasse = motDePasse;
		this.connecte = false;
		this.connexionAutorise = true;
	}
	
	/**
	 * 
	 * Connecte un Utilisateur
	 * @return Vrai si : L'utilsiateur n'est pas déjà connecté et est autorisé à se connecté
	 */
	public boolean seConnecter( )
	{
		if (this.isConnecte())
		{
			return false;
		}

		if (this.connexionAutorise)
		{
			this.setConnecte(true);

			return true;
		}
		return false;
	}


	/**
	 * Deconnecte un Utilisateur
	 * @return Vrai si : L'utilsiateur est déjà connecté
	 */
	public boolean seDeconnecte( )
	{
		if (this.isConnecte())
		{
			this.setConnecte(false);
			return true;
		}
		return false;
	
	}

	public boolean modifierInformation( String pseudo, String nom, String prenom, Adresse adresse, String email, String mdp, String mdp2, String dateNaissance )
	{
		if(mdp == mdp2)
		{
			this.pseudo = pseudo;
			this.prenom = prenom;
			this.nom = nom;
			this.adresse = adresse;
			this.dateNaissance = dateNaissance;
			this.email = email;
			this.motDePasse = mdp;
			
			return true;
		}
		
		return false;
		
		
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getNom() {
		return nom;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public String getEmail() {
		return email;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public boolean isConnecte() {
		return connecte;
	}

	public boolean isConnexionAutorise() {
		return connexionAutorise;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	private void setConnecte(boolean connecte) {
		this.connecte = connecte;
	}

	public void setConnexionAutorise(boolean connexionAutorise) {
		this.connexionAutorise = connexionAutorise;
	}


}

import java.util.List;

/**
 * @(#) Evenement.java
 */

public class Evenement
{
	private String nom;
	private Bar bar;
	private boolean visible;
	private String dateDebut;
	private String heureDebut;
	private Abonne leCreateur;
	private List<Abonne> listeParticipant;
	private List<Abonne> listeInvite;
	
	public Evenement( String nom, String heureDebut, boolean visibilite, List<Abonne> listeInvitation, Abonne createur, String dateDebut, Bar b )
	{
		this.nom = nom;
		this.bar = b;
		this.visible = visibilite;
		this.dateDebut = dateDebut;
		this.heureDebut = heureDebut;
		this.leCreateur = createur;
		this.listeInvite = listeInvitation;
		
	}
	
	public String getNom() {
		return nom;
	}

	public Bar getBar() {
		return bar;
	}

	public boolean isVisible() {
		return visible;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public String getHeureDebut() {
		return heureDebut;
	}

	public Abonne getLeCreateur() {
		return leCreateur;
	}

	public List<Abonne> getListeParticipant() {
		return listeParticipant;
	}

	public List<Abonne> getListeInvite() {
		return listeInvite;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setBar(Bar bar) {
		this.bar = bar;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}

	public void setLeCreateur(Abonne leCreateur) {
		this.leCreateur = leCreateur;
	}

	public void setListeParticipant(List<Abonne> listeParticipant) {
		this.listeParticipant = listeParticipant;
	}

	public void setListeInvite(List<Abonne> listeInvite) {
		this.listeInvite = listeInvite;
	}

	public boolean supprimerEvenement( )
	{
		// TODO Cette méthode doit se trouver dans le catalogue
		return false;
	}
	
	//Supprime le participant ou le créateur
	public boolean supprimerParticipantCreateur( Abonne a )
	{
		if(leCreateur == a){
			this.leCreateur = null;
			return true;
		} else if(listeParticipant.contains(a)) {
			return listeParticipant.remove(a);
		}
		return false;
	}
	
	//Un abonné ne peut être invité par un utilisateur que si celui si est le gérant du bar de l'evenement, le créateur ou un participant.
	public boolean inviterAbonne( Abonne a, Utilisateur demandeur )
	{
		if(demandeur instanceof Gerant && bar.estGerant(demandeur)){
			listeInvite.add(a);
			return true;
		} else if(leCreateur == demandeur || listeParticipant.contains(demandeur)) {
			listeInvite.add(a);
			return true;
		}
		return false;
	}

	//Un abonné peut etre incrit s'il n'est pas déjà dans la liste des participants et s'il est dans la liste des invités.
	public boolean inscrireAbonne( Abonne a )
	{
		if(listeParticipant.contains(a)){
			return false;
		} else if (listeInvite.contains(a)) {
			listeParticipant.add(a);
			listeInvite.remove(a);
			return true;
		}
		return false;
	}
	
	
}

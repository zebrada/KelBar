import java.util.ArrayList;

/**
 * @(#) Gerant.java
 */

public class Gerant extends Utilisateur
{
	private ArrayList<Bar> listeBar;
	
	public Gerant( String prenom, String nom, Adresse adresse, String dateNaissance, String email, String pseudo, String motDePasse )
	{
		super(pseudo, prenom, nom, adresse, dateNaissance, email, motDePasse);
	}
	
	public Gerant( Abonne abonne )
	{
		super(abonne.getPseudo(), abonne.getPrenom(), abonne.getNom(), abonne.getAdresse(), abonne.getDateNaissance(), abonne.getEmail(), abonne.getMotDePasse());
		this.listeBar= new ArrayList<Bar>();
		abonne.supprimerAbonne();
	}
	
	public Gerant( Abonne abonne, Bar b )
	{
		super(abonne.getPseudo(), abonne.getPrenom(), abonne.getNom(), abonne.getAdresse(), abonne.getDateNaissance(), abonne.getEmail(), abonne.getMotDePasse());
		this.listeBar= new ArrayList<Bar>();
		this.listeBar.add(b);
		
		abonne.supprimerAbonne();
	}
	
	public boolean supprimerGerant( )
	{
		this.supprimerLiensBars();
		return true;
	}
	
	
	public boolean  ajouterBar(Bar b){
		if(b.getGerant() != null)
		this.listeBar.add(b);
		b.setGerant(this);
		
		return false;
		
	}
	
	public boolean supprimerLiensBars( )
	{
		
		for(int i=0; i<this.listeBar.size(); i++){
			this.supprimerLienBar(listeBar.get(0));
		}
		return true;
	}
	
	public boolean supprimerLienBar( Bar b1 )
	{
		if(b1.estGerant(this)){
			b1.setGerantNull();
			this.listeBar.remove(b1);
			return true;
		}
		return false;
	}
	
	
}

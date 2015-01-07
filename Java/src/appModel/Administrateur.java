package appModel;
/**
 * @(#) Administrateur.java
 */

public class Administrateur extends Utilisateur
{
	private boolean estSuperAdmin;
	
	public Administrateur( String Prenom, String Nom, Adresse Adresse, String DateNaissance, String Email, String Pseudo,String motDePasse, boolean EstSuperAdmin )
	{
		super(Pseudo, Prenom, Nom, Adresse, DateNaissance, Email, motDePasse);
		estSuperAdmin=EstSuperAdmin;
	}
	
	public Administrateur( String Prenom, String Nom, Adresse Adresse, String DateNaissance, String Email, String Pseudo, String motDePasse )
	{
		super(Pseudo, Prenom, Nom, Adresse, DateNaissance, Email, motDePasse);
		estSuperAdmin=false;
	}
	
	public boolean estSuperAdministrateur()
	{
		return estSuperAdmin;
	}
	
	public boolean supprimerAdministrateur( )
	{
		if(this.estSuperAdministrateur()){
			return false;
		}
		return true;
	}
	
	
}

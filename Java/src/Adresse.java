/**
 * @(#) Adresse.java
 */

public class Adresse
{
	private String numRue;
	
	private String nomRue;
	
	private String codePostal;
	
	private String ville;
	
	
	/**
	 * Créer une adresse
	 * @param numRue
	 * @param nomRue
	 * @param CP	Code Postale
	 * @param ville
	 */
	public Adresse( String numRue, String nomRue, String CP, String ville )
	{
		super();
		this.numRue = numRue;
		this.nomRue = nomRue;
		this.codePostal = CP;
		this.ville = ville;
	}
	
	/**
	 * Mets toutes les valeurs à "---"
	 * 
	 * Je rappelle qu'il faut ABSOLUMENT retirer la réference après
	 * 
	 * La fonction ne détruit pas l'adresse, il la rends inutilisable
	 * @return true
	 */
	public boolean supprimerAdresse( )
	{
		this.numRue = "---";
		this.nomRue = "---";
		this.codePostal = "---";
		this.ville = "---";
		return true;
	}
	
	
}

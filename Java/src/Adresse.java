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
	 * Cr�er une adresse
	 * @param numRue
	 * @param nomRue
	 * @param CP	Code Postale
	 * @param ville
	 */
	public Adresse( String numRue, String nomRue, String CP, String ville )
	{
		super();
		this.numRue = numRue;
		this.setNomRue(nomRue);
		this.codePostal = CP;
		this.ville = ville;
	}
	
	/**
	 * Mets toutes les valeurs � "---"
	 * 
	 * Je rappelle qu'il faut ABSOLUMENT retirer la r�ference apr�s
	 * 
	 * La fonction ne d�truit pas l'adresse, il la rends inutilisable
	 * @return true
	 */
	public boolean supprimerAdresse( )
	{
		this.numRue = "---";
		this.setNomRue("---");
		this.codePostal = "---";
		this.ville = "---";
		return true;
	}

	public String getNumRue() {
		return numRue;
	}

	public void setNumRue(String numRue) {
		this.numRue = numRue;
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	
}

package appInterface;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import appModel.Adresse;
import appModel.Catalogue;

public class InscriptionDialog extends Dialog {
	private Catalogue catalogue;
	private Text text_prenom;
	private Text text_nom;
	private Text text_pseudo;
	private Text text_mdp;
	private Text text_email;
	private Text text_dateNaissance;
	private Text text_numRue;
	private Text text_nomRue;
	private Text text_cp;
	private Text text_ville;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public InscriptionDialog(Shell parentShell, Catalogue catalogue) {
		super(parentShell);
		this.catalogue = catalogue;
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(4, false));
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Prenom");
		
		text_prenom = new Text(container, SWT.BORDER);
		GridData gd_text = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 200;
		text_prenom.setLayoutData(gd_text);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel_1 = new Label(container, SWT.NONE);
		lblNewLabel_1.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel_1.setText("Nom");
		
		text_nom = new Text(container, SWT.BORDER);
		GridData gd_text_1 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_1.widthHint = 200;
		text_nom.setLayoutData(gd_text_1);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblSeudo = new Label(container, SWT.NONE);
		lblSeudo.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblSeudo.setText("Pseudo");
		
		text_pseudo = new Text(container, SWT.BORDER);
		GridData gd_text_2 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_2.widthHint = 200;
		text_pseudo.setLayoutData(gd_text_2);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblMotDePasse = new Label(container, SWT.NONE);
		lblMotDePasse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMotDePasse.setText("Mot de passe");
		
		text_mdp = new Text(container, SWT.BORDER);
		GridData gd_text_3 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_3.widthHint = 200;
		text_mdp.setLayoutData(gd_text_3);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblEmail = new Label(container, SWT.NONE);
		lblEmail.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblEmail.setText("Email");
		
		text_email = new Text(container, SWT.BORDER);
		GridData gd_text_4 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_4.widthHint = 200;
		text_email.setLayoutData(gd_text_4);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblDateDeNaissance = new Label(container, SWT.NONE);
		lblDateDeNaissance.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblDateDeNaissance.setText("Date de naissance");
		
		text_dateNaissance = new Text(container, SWT.BORDER);
		GridData gd_text_5 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_5.widthHint = 200;
		text_dateNaissance.setLayoutData(gd_text_5);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblAdresse = new Label(container, SWT.NONE);
		lblAdresse.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, false, false, 1, 1));
		lblAdresse.setText("Adresse :");
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblN = new Label(container, SWT.NONE);
		lblN.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblN.setText("N\u00B0");
		
		text_numRue = new Text(container, SWT.BORDER);
		GridData gd_text_7 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_7.widthHint = 50;
		text_numRue.setLayoutData(gd_text_7);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNomDeRue = new Label(container, SWT.NONE);
		lblNomDeRue.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNomDeRue.setText("Nom de rue");
		
		text_nomRue = new Text(container, SWT.BORDER);
		GridData gd_text_8 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_8.widthHint = 200;
		text_nomRue.setLayoutData(gd_text_8);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblCodePostal = new Label(container, SWT.NONE);
		lblCodePostal.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblCodePostal.setText("Code Postal");
		
		text_cp = new Text(container, SWT.BORDER);
		GridData gd_text_6 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_6.widthHint = 200;
		text_cp.setLayoutData(gd_text_6);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblVille = new Label(container, SWT.NONE);
		lblVille.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblVille.setText("Ville");
		
		text_ville = new Text(container, SWT.BORDER);
		GridData gd_text_9 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_9.widthHint = 200;
		text_ville.setLayoutData(gd_text_9);

		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(450, 400);
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Inscription");
	}
	
	@Override
	protected void okPressed() {
		Adresse addr = new Adresse(text_numRue.getText(), text_nomRue.getText(), text_cp.getText(), text_ville.getText());
		if(catalogue.creerAbonne(text_prenom.getText(), text_nom.getText(), addr, text_dateNaissance.getText(), text_email.getText(), text_pseudo.getText(), text_mdp.getText())){
			catalogue.tentativeConnection(text_pseudo.getText(), text_mdp.getText());
			super.okPressed();
		}
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if(buttonId == IDialogConstants.CANCEL_ID)
			catalogue.setNewSession(0);
		super.buttonPressed(buttonId);
	}

}

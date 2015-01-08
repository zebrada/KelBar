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

import appModel.Catalogue;

public class ConnexionDialog extends Dialog {
	private Text text_pseudo;
	private Text text_mdp;
	private Catalogue catalogue;

	/**
	 * Create the dialog.
	 * @param parentShell
	 */
	public ConnexionDialog(Shell parentShell, Catalogue catalogue) {
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
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblNewLabel = new Label(container, SWT.NONE);
		lblNewLabel.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblNewLabel.setText("Pseudo");
		
		text_pseudo = new Text(container, SWT.BORDER);
		GridData gd_text = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text.widthHint = 210;
		text_pseudo.setLayoutData(gd_text);
		new Label(container, SWT.NONE);
		new Label(container, SWT.NONE);
		
		Label lblMotDePasse = new Label(container, SWT.NONE);
		lblMotDePasse.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblMotDePasse.setText("Mot de Passe");
		
		text_mdp = new Text(container, SWT.BORDER);
		GridData gd_text_1 = new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1);
		gd_text_1.widthHint = 210;
		text_mdp.setLayoutData(gd_text_1);

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
		createButton(parent, 300, "Nouvel Utilisateur", false);
	}
	

	protected void okPressed() {
		catalogue.tentativeConnection(text_pseudo.getText(), text_mdp.getText());
		super.okPressed();
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if(buttonId == 300){
			catalogue.setNewSession(1);
			okPressed();
		}
		super.buttonPressed(buttonId);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(400, 200);
	}
	
	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Connexion");
	}

	public Text getText_pseudo() {
		return text_pseudo;
	}

	public Text getText_mdp() {
		return text_mdp;
	}

}

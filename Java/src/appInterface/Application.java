package appInterface;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import appModel.Abonne;
import appModel.Administrateur;
import appModel.Adresse;
import appModel.Catalogue;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Application {

	protected Shell shlKelbarBeta;
	private Catalogue catalogue;

	public Application(Catalogue catalogue) {
		super();
		this.catalogue = catalogue;
	}

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Application window = new Application(new Catalogue());
			Adresse addr = new Adresse("1", "av. de la République", "75001", "Paris");
			window.catalogue.creerAbonne("Demo", "DEMO", addr, "01/01/1994", "demo@gmail.com", "demo", "demo");
			window.catalogue.creerAdministrateur("Admin", "ADMIN", addr, "01/01/1994", "demo@gmail.com", "admin", "admin", true);
			window.open();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlKelbarBeta.open();
		shlKelbarBeta.layout();
		dialogConnexion();
		while (!shlKelbarBeta.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}			
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlKelbarBeta = new Shell();
		shlKelbarBeta.setToolTipText("");
		shlKelbarBeta.setMinimumSize(new org.eclipse.swt.graphics.Point(800, 500));
		shlKelbarBeta.setSize(682, 430);
		shlKelbarBeta.setText("KelBar - Beta 1.0");
		shlKelbarBeta.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		
		
		
		
		
//		Menu menu = new Menu(shlKelbarBeta, SWT.BAR);
//		shlKelbarBeta.setMenuBar(menu);
//		
//		MenuItem mntmBar = new MenuItem(menu, SWT.CASCADE);
//		mntmBar.setText("Bar");
//		
//		Menu menu_1 = new Menu(mntmBar);
//		mntmBar.setMenu(menu_1);
//		
//		MenuItem mntmAjouterBar = new MenuItem(menu_1, SWT.NONE);
//		mntmAjouterBar.setText("Ajouter un bar");
//		
//		MenuItem mntmRechercherUnBar = new MenuItem(menu_1, SWT.NONE);
//		mntmRechercherUnBar.setText("Rechercher un bar");
//		
//		MenuItem mntmEvnement = new MenuItem(menu, SWT.CASCADE);
//		mntmEvnement.setText("Ev\u00E9nement");
//		
//		Menu menu_2 = new Menu(mntmEvnement);
//		mntmEvnement.setMenu(menu_2);
//		
//		MenuItem mntmAjouterUnEvnement = new MenuItem(menu_2, SWT.NONE);
//		mntmAjouterUnEvnement.setText("Ajouter un Ev\u00E9nement");
//		
//		MenuItem mntmNewItem = new MenuItem(menu_2, SWT.NONE);
//		mntmNewItem.setText("Rechercher un \u00E9v\u00E9nement");
//		
//		MenuItem mntmUtilisateur = new MenuItem(menu, SWT.CASCADE);
//		mntmUtilisateur.setText("Utilisateur");
//		
//		Menu menu_3 = new Menu(mntmUtilisateur);
//		mntmUtilisateur.setMenu(menu_3);
//		
//		MenuItem mntmMonCompte = new MenuItem(menu_3, SWT.NONE);
//		mntmMonCompte.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent e) {
//				
//			}
//		});
//		mntmMonCompte.setText("Mon compte");
//		
//		MenuItem mntmRechercherUnUtilisateur = new MenuItem(menu_3, SWT.NONE);
//		mntmRechercherUnUtilisateur.setText("Rechercher un utilisateur");
//		
//		MenuItem mntmAjouterUnAbonne = new MenuItem(menu_3, SWT.NONE);
//		mntmAjouterUnAbonne.setText("Ajouter un abonne");
//		
//		MenuItem mntmAjouterUnGrant = new MenuItem(menu_3, SWT.NONE);
//		mntmAjouterUnGrant.setText("Ajouter un g\u00E9rant");
//		
//		MenuItem mntmAjouterUnAdministrateur = new MenuItem(menu_3, SWT.NONE);
//		mntmAjouterUnAdministrateur.setText("Ajouter un administrateur");

	}

	private void dialogConnexion() {
		ConnexionDialog dialog = new ConnexionDialog(shlKelbarBeta, catalogue);
		while(catalogue.getSession() == null && catalogue.getNewSession() == 0)
			dialog.open();
		if(catalogue.getNewSession() == 1){
			System.out.println("Nouvel utilisateur affichage du formulaire.");
		    // afficherDialogNewAbonne
			while(catalogue.getSession() == null && catalogue.getNewSession() == 1){
				InscriptionDialog inscriptionDialog = new InscriptionDialog(shlKelbarBeta, catalogue);
				inscriptionDialog.open();
			}
		}
		if(catalogue.getSession() instanceof Abonne){
			System.out.println("Un abonné est connecté.");
//			afficherVueAbonne();
		} else if(catalogue.getSession() instanceof Abonne){
			System.out.println("Un gérant est connecté.");
//			afficherVueGerant();
		} else if(catalogue.getSession() instanceof Administrateur){
			System.out.println("Un admin est connecté.");
//			afficherVueAdmin();
			vueAdmin();
		} else {
			dialogConnexion();
		}
//		System.out.println(catalogue.getSession().getPrenom());
	}

	private void vueAdmin() {
		Composite composite = new Composite(shlKelbarBeta, SWT.NONE);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		TabFolder tabFolder = new TabFolder(composite, SWT.NONE);
		
		TabItem tbtmNewItem = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem.setText("New Item");
		
		ViewForm viewForm = new ViewForm(tabFolder, SWT.NONE);
		tbtmNewItem.setControl(viewForm);
		
		Button btnNewButton = new Button(viewForm, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		viewForm.setContent(btnNewButton);
		btnNewButton.setText("New Button");
		
		TabItem tbtmNewItem_1 = new TabItem(tabFolder, SWT.NONE);
		tbtmNewItem_1.setText("New Item");
		
		composite.pack();
	}
}

package appInterface;



import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.graphics.Point;

public class Application {

	protected Shell shlKelbarBeta;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Application window = new Application();
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
		shlKelbarBeta.setMinimumSize(new Point(800, 500));
		shlKelbarBeta.setSize(682, 430);
		shlKelbarBeta.setText("KelBar - Beta 1.0");
		shlKelbarBeta.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Menu menu = new Menu(shlKelbarBeta, SWT.BAR);
		shlKelbarBeta.setMenuBar(menu);
		
		MenuItem mntmBar = new MenuItem(menu, SWT.CASCADE);
		mntmBar.setText("Bar");
		
		Menu menu_1 = new Menu(mntmBar);
		mntmBar.setMenu(menu_1);
		
		MenuItem mntmAjouterBar = new MenuItem(menu_1, SWT.NONE);
		mntmAjouterBar.setText("Ajouter un bar");
		
		MenuItem mntmRechercherUnBar = new MenuItem(menu_1, SWT.NONE);
		mntmRechercherUnBar.setText("Rechercher un bar");
		
		MenuItem mntmEvnement = new MenuItem(menu, SWT.CASCADE);
		mntmEvnement.setText("Ev\u00E9nement");
		
		Menu menu_2 = new Menu(mntmEvnement);
		mntmEvnement.setMenu(menu_2);
		
		MenuItem mntmAjouterUnEvnement = new MenuItem(menu_2, SWT.NONE);
		mntmAjouterUnEvnement.setText("Ajouter un Ev\u00E9nement");
		
		MenuItem mntmNewItem = new MenuItem(menu_2, SWT.NONE);
		mntmNewItem.setText("Rechercher un \u00E9v\u00E9nement");
		
		MenuItem mntmUtilisateur = new MenuItem(menu, SWT.CASCADE);
		mntmUtilisateur.setText("Utilisateur");
		
		Menu menu_3 = new Menu(mntmUtilisateur);
		mntmUtilisateur.setMenu(menu_3);
		
		MenuItem mntmMonCompte = new MenuItem(menu_3, SWT.NONE);
		mntmMonCompte.setText("Mon compte");
		
		MenuItem mntmRechercherUnUtilisateur = new MenuItem(menu_3, SWT.NONE);
		mntmRechercherUnUtilisateur.setText("Rechercher un utilisateur");
		
		MenuItem mntmAjouterUnAbonne = new MenuItem(menu_3, SWT.NONE);
		mntmAjouterUnAbonne.setText("Ajouter un abonne");
		
		MenuItem mntmAjouterUnGrant = new MenuItem(menu_3, SWT.NONE);
		mntmAjouterUnGrant.setText("Ajouter un g\u00E9rant");
		
		MenuItem mntmAjouterUnAdministrateur = new MenuItem(menu_3, SWT.NONE);
		mntmAjouterUnAdministrateur.setText("Ajouter un administrateur");

	}
}

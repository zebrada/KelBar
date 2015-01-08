package appInterface;
import appModel.*;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.layout.TableColumnLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.jface.viewers.TableViewerColumn;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.wb.swt.SWTResourceManager;

public class InfoBar extends Composite {
	private Table table;
	private static class ContentProvider implements IStructuredContentProvider {
		public Object[] getElements(Object inputElement) {
			return new Object[0];
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public InfoBar(Composite parent, int style) {
		super(parent, style);
		setLayout(null);
		
		Button btnModifier = new Button(this, SWT.NONE);
		btnModifier.setBounds(5, 5, 57, 25);
		btnModifier.setText("Modifier");
		
		Button btnSupprimer = new Button(this, SWT.NONE);
		btnSupprimer.setBounds(70, 5, 67, 25);
		btnSupprimer.setText("Supprimer");
		
		Catalogue c = new Catalogue();
		c.getLb();
		
		Button btnAjouterUnvnement = new Button(this, SWT.NONE);
		btnAjouterUnvnement.setBounds(165, 5, 130, 25);
		btnAjouterUnvnement.setText("Ajouter un \u00E9v\u00E8nement");
		
		Canvas canvas = new Canvas(this, SWT.NONE);
		canvas.setBounds(322, 5, 118, 96);
		
		table = new Table(this, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));
		table.setBounds(5, 55, 311, 235);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableItem tableItem = new TableItem(table, SWT.NONE);
		tableItem.setText(new String[] {});
		tableItem.setText("Nom du Bar");
		
		TableItem tableItem_1 = new TableItem(table, SWT.NONE);
		tableItem_1.setText("Adresse");
		
		TableItem tableItem_2 = new TableItem(table, SWT.NONE);
		tableItem_2.setText("heure ouverture");
		
		TableItem tableItem_3 = new TableItem(table, SWT.NONE);
		tableItem_3.setText("Heure fermeture");
		
		TableItem tableItem_4 = new TableItem(table, SWT.NONE);
		tableItem_4.setText("Promotion");
		
		TableItem tableItem_5 = new TableItem(table, SWT.NONE);
		tableItem_5.setText("Evenement");
		
	

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
}

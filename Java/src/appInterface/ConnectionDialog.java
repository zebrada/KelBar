package appInterface;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;

public class ConnectionDialog extends Dialog {

	protected Object result;
	protected Shell shlConnection;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public ConnectionDialog(Shell parent, int style) {
		super(parent, style);
		setText("Connection");
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shlConnection.open();
		shlConnection.layout();
		Display display = getParent().getDisplay();
		while (!shlConnection.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shlConnection = new Shell(getParent(), getStyle());
		shlConnection.setSize(450, 300);
		shlConnection.setText("Connection");
		shlConnection.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		Composite composite = new Composite(shlConnection, SWT.NONE);
		
		Composite composite_1 = new Composite(shlConnection, SWT.NONE);

	}

}

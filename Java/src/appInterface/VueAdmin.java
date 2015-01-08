package appInterface;

import org.eclipse.swt.widgets.Composite;

public class VueAdmin extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public VueAdmin(Composite parent, int style) {
		super(parent, style);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

}

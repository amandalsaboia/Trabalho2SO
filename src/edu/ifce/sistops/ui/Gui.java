package edu.ifce.sistops.ui;

import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class Gui extends JPanel {
	public Gui() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0};
		gridBagLayout.rowHeights = new int[]{0};
		gridBagLayout.columnWeights = new double[]{Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{Double.MIN_VALUE};
		setLayout(gridBagLayout);
	}

	private static final long serialVersionUID = 134555342L;

}

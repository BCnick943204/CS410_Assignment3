package editmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;

public class CopyFunction implements ActionListener{
	private JTextPane textPane;
	
	public CopyFunction(JTextPane textPane) {
		this.textPane = textPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textPane.copy();
	}
}

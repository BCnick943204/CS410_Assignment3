package filemenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;

public class NewFileAction implements ActionListener{

	private JTextPane textPane;
	
	public NewFileAction(JTextPane textPane) {
		this.textPane = textPane;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		textPane.setText("");
	}

}

package editmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;

public class UndoFunction implements ActionListener{
	private JTextPane textPane;
	
	public UndoFunction(JTextPane textPane) {
		this.textPane = textPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

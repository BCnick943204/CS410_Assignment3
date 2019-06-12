package editmenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextPane;
import javax.swing.text.Position;
import javax.swing.text.StyledDocument;

public class PasteFunction implements ActionListener{
	private JTextPane textPane;
	
	public PasteFunction(JTextPane textPane) {
		this.textPane = textPane;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
        StyledDocument doc = textPane.getStyledDocument();
        Position position = doc.getEndPosition();
        System.out.println("offset"+position.getOffset());
        textPane.paste();		
	}

}

package editmenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

public class EditMenu extends JMenu{
private JTextPane document;
	
	public EditMenu(JTextPane document) {
		super("Edit"); //Give the menu a name
		this.document = document;
	
	    //Options for Edit menu
	    JMenuItem copyButton = new JMenuItem("Copy");
	    JMenuItem pasteButton = new JMenuItem("Paste");
	    JMenuItem undoButton = new JMenuItem("Undo");
	    
        //Giving the Edit menu options ActionListeners (to give the buttons their
        // functional behavior)
        copyButton.addActionListener(new CopyFunction(document));
        pasteButton.addActionListener(new PasteFunction(document));
        undoButton.addActionListener(new UndoFunction(document));
        
        //adding Edit menu options
        add(undoButton);
        add(copyButton);
        add(pasteButton);
	
	}
}

package filemenu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

public class FileMenu extends JMenu{
	private JTextPane document;
	
	public FileMenu(JTextPane document, JFrame appFrame) {
		super("File"); //Give the menu a name
		this.document = document;
		
	    //Options for File menu
	    JMenuItem newFileButton = new JMenuItem("New File");
	    JMenuItem saveFileButton = new JMenuItem("Save File");
	    JMenuItem printFileButton = new JMenuItem("Print File");
	    JMenuItem openFileButton = new JMenuItem("Open File");
	    
        //Giving the File menu options ActionListeners (to give the buttons their
        // functional behavior)
        newFileButton.addActionListener(new NewFileAction(document));
        saveFileButton.addActionListener(new SaveFileAction(document));
        printFileButton.addActionListener(new PrintFileAction(document, appFrame));
        openFileButton.addActionListener(new OpenFileAction(document));
	    
        //Adding File menu options
        add(newFileButton);
        addSeparator();
        add(saveFileButton);
        addSeparator();
        add(printFileButton);
        addSeparator();
        add(openFileButton);
        

	}
}

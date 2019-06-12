package simplenotepad;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import editmenu.*;
import filemenu.*;

public class SimpleNotePad extends JFrame {
	//Menu bar for file and edit options
    JMenuBar menuBar = new JMenuBar();

    //Text pane that will hold the document text
    JTextPane document = new JTextPane();
    
    public SimpleNotePad() {
        setTitle("A Simple Notepad Tool"); //Title for window

        menuBar.add(new FileMenu(document, this)); //Add File menu
        menuBar.add(new EditMenu(document)); //Add Edit menu
        setJMenuBar(menuBar);
        
        add(new JScrollPane(document)); //add text panel to frame and with a scrolling bar
        
        setPreferredSize(new Dimension(600,600));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
    }
    public static void main(String[] args) {
        SimpleNotePad app = new SimpleNotePad();
    }

}
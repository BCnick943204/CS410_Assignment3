package filemenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class OpenFileAction implements ActionListener{

	private JTextPane textPane;
	
	public OpenFileAction(JTextPane textPane) {
		this.textPane = textPane;
	}
	public void actionPerformed(ActionEvent arg0) {
		  File fileToOpen = null;
          JFileChooser fc = new JFileChooser();
          int returnVal = fc.showOpenDialog(null);
          if (returnVal == JFileChooser.APPROVE_OPTION)
              fileToOpen = fc.getSelectedFile();
          try {
              Reader in = new FileReader(fileToOpen);
              textPane.read(in, null);
              in.close();
          } catch (IOException ex) {
          }		
	}
}

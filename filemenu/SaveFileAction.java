package filemenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class SaveFileAction implements ActionListener{

	private JTextPane textPane;
	
	public SaveFileAction(JTextPane textPane) {
		this.textPane = textPane;
	}
	public void actionPerformed(ActionEvent arg0) {
		  File fileToWrite = null;
          JFileChooser fc = new JFileChooser();
          int returnVal = fc.showSaveDialog(null);
          if (returnVal == JFileChooser.APPROVE_OPTION)
              fileToWrite = fc.getSelectedFile();
          try {
              PrintWriter out = new PrintWriter(new FileWriter(fileToWrite));
              out.println(textPane.getText());
              JOptionPane.showMessageDialog(null, "File is saved successfully...");
              out.close();
          } catch (IOException ex) {
          }		
	}

}

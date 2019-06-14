package filemenu;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

public class PrintFileAction implements ActionListener{
	
	private JTextPane textPane;
	private JFrame jFrame;
	
	public PrintFileAction(JTextPane textPane, JFrame jFrame) {
		this.textPane = textPane;
		this.jFrame = jFrame;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
        try{
            PrinterJob pjob = PrinterJob.getPrinterJob();
            pjob.setJobName("Sample Command Pattern");
            pjob.setCopies(1);
            pjob.setPrintable(new Printable() {
                public int print(Graphics pg, PageFormat pf, int pageNum) {
                    if (pageNum>0)
                        return Printable.NO_SUCH_PAGE;
                    pg.drawString(textPane.getText(), 500, 500);
                    jFrame.paint(pg);
                    return Printable.PAGE_EXISTS;
                }
            });

            if (pjob.printDialog() == false)
                return;
            pjob.print();
        } catch (PrinterException pe) {
            JOptionPane.showMessageDialog(null,
                    "Printer error" + pe, "Printing error",
                    JOptionPane.ERROR_MESSAGE);
        }		
	}

}

package company;

import java.awt.Window;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * Κλάση για τη εποπτεία του τρόπου κλεισίματος των φορμών
 * 
 * @author periklis  - Από την 3η ΕΡΓΑΣΙΑ 2014-2015
*/
public class MyWindowEvent extends WindowEvent {

    public boolean exitAndSave;

    public MyWindowEvent(Window source, int id, boolean exitAndSave) {
        super(source, id);
        this.exitAndSave = exitAndSave;
    }

    public static boolean isExitAndSave(WindowEvent arg0) {
        String uc;
         
        if (arg0.getWindow() instanceof JFrame) {
            uc = ((JFrame) arg0.getWindow()).getTitle();
        } else if (arg0.getWindow() instanceof JDialog) {
            uc = ((JDialog) arg0.getWindow()).getTitle();
        }
               
        if (arg0 instanceof MyWindowEvent) {
            return ((MyWindowEvent) arg0).exitAndSave;
        } else {
            return false;
        }
    }
}

import gui.MainWindow;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;

public class jkeysafe {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
            boolean hasCocoa = false;
            boolean hasNimbus = false;
            try {
                for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        hasNimbus = true;
                        break;
                    }
                }
            } catch(Exception e) {
                Logger.getLogger(jkeysafe.class.getName()).log(Level.SEVERE, null, e);
            }
            
            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                    MainWindow mainWindow = new MainWindow();
                    mainWindow.setTitle("jkeysafe");
                    mainWindow.pack();
                    mainWindow.setVisible(true);
                }
            });
        }
}

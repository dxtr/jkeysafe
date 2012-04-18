import gui.MainWindow;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class jkeysafe {
	public jkeysafe(String[] args) {
            MainWindow mainWindow = new MainWindow();
            mainWindow.setTitle("jkeysafe");
            mainWindow.pack();
            mainWindow.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (javax.swing.UnsupportedLookAndFeelException | java.lang.ClassNotFoundException | java.lang.InstantiationException | java.lang.IllegalAccessException e) {
                /* TODO: Log */
            }
            jkeysafe main = new jkeysafe(args);
        }
}

import gui.MainWindow;

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
            jkeysafe main = new jkeysafe(args);
        }
}

import controllers.DefaultController;
import models.MainWindowModel;
import views.MainWindowView;

public class jkeysafe {
	
	public jkeysafe() {
		DefaultController controller = new DefaultController();
		MainWindowModel mainWindowModel = new MainWindowModel();
		MainWindowView mainWindowView = new MainWindowView(controller);
                
                controller.addView(mainWindowView);
                controller.addModel(mainWindowModel);
                
                mainWindowView.setTitle("jkeysafe");
                mainWindowView.setVisible(true);
                
                /*
                controller.addView(mainWindowView);
		controller.addModel(mainWindowModel);
		JFrame displayFrame = new JFrame("jkeysafe");
		displayFrame.getContentPane().add(mainWindowView, BorderLayout.CENTER);
		displayFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		displayFrame.pack();
		
		displayFrame.setVisible(true);
                */
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jkeysafe main = new jkeysafe();

	}

}

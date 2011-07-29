/*
 * MSN_FlyEmiratesApp.java
 */
package msn_flyemirates;

import de.javasoft.plaf.synthetica.SyntheticaBlackMoonLookAndFeel;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import de.javasoft.plaf.synthetica.SyntheticaSilverMoonLookAndFeel;
import javax.swing.UIManager;

/**
 * The main class of the application.
 */
public class MSN_FlyEmiratesApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override
    protected void startup() {
       try {
            UIManager.setLookAndFeel(new SyntheticaBlackMoonLookAndFeel());
        } catch (Exception e) {
        }



        //show(new MSN_FlyEmiratesView(this));
        Splash g = new Splash();
        g.setVisible(true);

    }

    protected void startup11() {
        show(new MSN_FlyEmiratesView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override
    protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of MSN_FlyEmiratesApp
     */
    public static MSN_FlyEmiratesApp getApplication() {
        return Application.getInstance(MSN_FlyEmiratesApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(MSN_FlyEmiratesApp.class, args);
    }
}

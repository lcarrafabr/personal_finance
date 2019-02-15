/*
 * PersonalFinanceApp.java
 */

package personalfinance;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class PersonalFinanceApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new PersonalFinanceView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of PersonalFinanceApp
     */
    public static PersonalFinanceApp getApplication() {
        return Application.getInstance(PersonalFinanceApp.class);
    }
    public static String ipMySQL;
    public static String portaMySQL;
    public static String bancoMySQL;
    public static String usuarioBancoMySQL;
    public static String senhaBancoMySQL;
    public static String usuario;
    public static String senha;
    public static Integer codigo_do_usuario;
    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(PersonalFinanceApp.class, args);
    }
}

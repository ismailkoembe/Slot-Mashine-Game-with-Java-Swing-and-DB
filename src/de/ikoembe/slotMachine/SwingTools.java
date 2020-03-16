package de.ikoembe.slotMachine;

import java.awt.*;

/**
 * Utility-Klasse für grafische Oberflächen.
 * 
 * @author fmk
 */
public class SwingTools {

    private SwingTools() {
    }

    /**
     * Zentriert den referenzierten Frame auf dem Bildschirm.
     * 
     * @param window 
     */
    public static void center(Window window) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - window.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - window.getHeight()) / 2);
        window.setLocation(x, y);
    }

    public static Point getCenterOnScreen(int screen, Dimension dimension) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsConfiguration[] gc = ge.getScreenDevices()[screen].getConfigurations();
        Rectangle screenBounds = gc[0].getBounds();

        Point pos = new Point();
        pos.x = screenBounds.x + (screenBounds.width / 2) - (dimension.width / 2);
        pos.y = screenBounds.y + (screenBounds.height / 2) - (dimension.height / 2);
        return pos;
    }

    public static void centerOnScreen(int screen, Window window) {
        window.setLocation(SwingTools.getCenterOnScreen(screen, window.getSize()));
    }
}

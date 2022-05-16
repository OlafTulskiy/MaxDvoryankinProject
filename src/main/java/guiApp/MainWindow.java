package guiApp;

import guiApp.windowParts.GameMap;
import guiApp.windowParts.InfoPanel;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 28.04.2022
 */

public class MainWindow extends JFrame {

    private int posX = 200;
    private int posY = 100;

    private int widthW = 768; //change size
    private int heightW = 356; //change size

    private GameMap gameMap;
    private InfoPanel infoPanel;

    public MainWindow() {
        setupWindow();

        gameMap = new GameMap();
        infoPanel = new InfoPanel(this);

        add(gameMap, BorderLayout.WEST);
        add(infoPanel, BorderLayout.EAST);

        setVisible(true);
    }

    private void setupWindow() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(widthW, heightW);
        setLocation(posX, posY);
        setResizable(true);
        setTitle("First GUI-App");

    }
}

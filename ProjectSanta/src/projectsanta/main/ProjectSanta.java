package projectsanta.main;

import java.awt.Dimension;
import java.awt.Font;
import java.util.ArrayList;

import projectsanta.main.page.ListCreationPage;
import projectsanta.main.page.MainMenuPage;

import userinterface.page.Page;
import userinterface.window.Window;

public class ProjectSanta {
	
	/*
	 * This program was made completely function in 4 days, with 915 lines of
	 * code on 12-22-13, created by Clay Kuznia.
	 */
	
	/* 									TODO:
	 *   * Make it so there can be more than one visible page at once. DONE
	 *   * Make it so the resource path for each Page can be specified (more like a library). DONE
	 *   * See if requestFocus() is needed in setVisiblePages()
	 *   + Make Window class be able to drag around the screen
	 *   - Remove all unused imports
	 *   - Remove FONT_SIZE_RATIO and use FontMetrics
	 *   * Look for anything that is project Santa specific, and remove it
	 *   
	 *   BUGS:
	 *   * Make it so you can exit the program using <Escape> when a JTextField has focus
	 */
	
	public static Dimension SIZE = new Dimension(800 * 2, 600);
	private static double SCALE = 1;
	
	public static Window window = new Window((int) (SIZE.width * SCALE), (int) (SIZE.height * SCALE));
	
	public static final String FONT = "comic sans ms";
	public static final int FONT_STYLE = Font.BOLD;
	public static final double FONT_SIZE_RATIO = 1.55;
		
	public static MainMenuPage mainPage = new MainMenuPage(0, 0, 800, 500);
	
	public ProjectSanta() {
		// Loading the Main Menu
		window.clearAndAddPage(mainPage);
		
		// Wait until everything is loaded to show program
		window.setVisible(true);
		window.requestFocus();
		window.refreshScreen();
	}
}

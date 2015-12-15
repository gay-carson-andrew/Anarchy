package gay.carson.andrew;
public class Main {
	static Game Anarchy_Offline;
	public static void main(String args[]) {
		init(); //Initialize default configuration or saved data
		start(); //Start the application
		save(); //Save all the data
		quit(); //Exit the application
	}
	public static void init() {
		Anarchy_Offline = new Game();
	}
	public static void start() {
		Anarchy_Offline.start();
	}
	public static void save() {
		Anarchy_Offline.save();
	}
	public static void quit() {
		Anarchy_Offline.quit();
	}
}

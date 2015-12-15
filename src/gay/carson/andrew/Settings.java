package gay.carson.andrew;

public class Settings {
	static int screenWidth;
	static int screenHeight;
	
	public Settings(int x, int y) {
		setScreen(x,y);
	}
	public Settings() {
		// TODO Auto-generated constructor stub
	}
	public void setScreen(int x, int y) {
		setScreenWidth(x);
		setScreenHeight(y);
	}
	public void setScreenWidth(int screenWidth) {
		this.screenWidth = screenWidth;
	}
	public void setScreenHeight(int screenHeight) {
		this.screenHeight = screenHeight;
	}
	public static int getScreenWidth() {
		return screenWidth;
	}
	public static int getScreenHeight() {
		return screenHeight;
	}
}

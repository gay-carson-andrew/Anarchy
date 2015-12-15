package gay.carson.andrew.display;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

public class Environment {

	public Environment() {
		
	}
	public GraphicsDevice getGraphicsDevice() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	}
	public int getScreenWidth() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getWidth();
	}
	public int getScreenHeight() {
		return GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDisplayMode().getHeight();
	}
}

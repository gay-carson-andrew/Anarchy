package gay.carson.andrew.display.image;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {
	
	BufferedImage BI;
	String name;

	Image(Object imgFrame) {
		setBufferedImage(imgFrame.toString());
		setName(imgFrame.toString());
	}
	private void setBufferedImage(String dir) {
		try {
			BI = ImageIO.read(new File(dir));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void setName(String dir) {
		name = dir.substring(dir.indexOf('/',9));
	}
	
	public String getName() {
		return name.substring(name.indexOf('/')+1,name.lastIndexOf('/'));
	}
	public int getFrameID() {
		return Integer.valueOf(name.substring(name.lastIndexOf("/")+1,name.lastIndexOf(".")));
	}
	public BufferedImage getImage() {
		return BI;
	}
	public String toString() {
		return name;
	}
	public void resize(int newW, int newH) { 
	    
	    java.awt.Image tmp = BI.getScaledInstance(newW, newH, java.awt.Image.SCALE_SMOOTH);
	    BI = new BufferedImage(newW, newH, BufferedImage.TYPE_INT_ARGB);

	    Graphics2D g2d = BI.createGraphics();
	    g2d.drawImage(tmp, 0, 0, null);
	    g2d.dispose();
	}  
}

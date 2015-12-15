package gay.carson.andrew.trash;

import java.awt.Color;
import java.awt.Graphics;

public class Background{

	Graphics G;
	int width,height;
	
	public Background(Graphics G, int width, int height) {
		this.G = G;
		this.width = width;
		this.height = height;
		
		draw();
	}
	public void draw() {
		outline();
		fill();
		
	}
	private void outline() {
		outlineGrass();
		outlineMountains();
	}
	private void fill() {
		fillMountains();
		fillGrass();
	}
	private void outlineGrass() {
		G.drawArc(-width/4, height/2, (3*width)/2, height/2, 0, 180);
	}
	private void fillGrass() {
		G.setColor(Color.green);
		G.fillArc(-width/4, height/2, (3*width)/2, height/2, 0, 180);
		G.fillRect(0, 3*height/4, width, height);
	}
	private void outlineMountains() {
		G.drawPolyline(new int[]{0,width/8,width/2,width/8,width/4,width/2}, new int[]{height,height/4,height,height,height/4,height}, 6);
	}
	private void outlineBackMountain() {
		
	}
	private void fillMountains() {
		G.setColor(Color.orange);
		G.fillPolygon(new int[]{0,width/8,width/2,width/8,width/4,width/2}, new int[]{height,height/4,height,height,height/4,height}, 6);
	}
}

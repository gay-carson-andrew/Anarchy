package gay.carson.andrew.display;

import gay.carson.andrew.display.image.ImageHandler;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;

import javax.swing.*;

public class GraphicalUserInterface extends JFrame{
	private static final long serialVersionUID = 1L;
	private ImageHandler IH;
	private Image buff;
	public GraphicalUserInterface() {
		super("Anarchy_Offline");
		init();
	}
	public GraphicalUserInterface(WindowListener WL,MouseListener ML, KeyListener KL) {
		this();
	}
	private void init() {
		IH = new ImageHandler();
	}
	public void setup(Environment GE) {
		//windowListener();
		fullscreen(GE);
		visible();
	}
	public void windowListener() {
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void paint(Graphics g) {
		setBuff();
		g.drawImage(buff,0,0,this);
	}
	public void setBuff() {
		if(buff == null) {
			buff = createImage(getWidth(),getHeight());
		}
		Graphics b = buff.getGraphics();
		b.drawImage(IH.getImage("background", 0).getImage(),0,0,null);
		//b.fillRect(0,0,getWidth(),getHeight());
		paintBuff(b);
	}
	public void paintBuff(Graphics g) {
		
	}
	public void visible() {
		this.setVisible(true);
	}
	public Graphics getBuffGraphics() {
		return buff.getGraphics();
	}
	public void update(String imgLabel, int x, int y) {
		
	}
	public void test(){
		System.out.println("Yay");
	}
	private void fullscreen(Environment GE) { 
		GE.getGraphicsDevice().setFullScreenWindow(this);
	}
	private void windowedfullscreen(Environment GE) {
		setSize(GE.getScreenWidth(), GE.getScreenHeight());
		setExtendedState(Frame.MAXIMIZED_BOTH);
	}
	public void setup() {
		// TODO Auto-generated method stub
		
	}
}

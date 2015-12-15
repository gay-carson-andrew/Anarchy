package gay.carson.andrew;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;






import gay.carson.andrew.display.Environment;
import gay.carson.andrew.display.GraphicalUserInterface;
import gay.carson.andrew.entity.Calculations;
public class Game {
	Settings Settings;
	GraphicalUserInterface GUI;
	Environment GE;
	Calculations C;
	WindowListener WL;
	MouseListener ML;
	KeyListener KL;
	
	//TimerHandler T;
	//ActionListener A;
	//int FrameRate; 
	//Timer timer;
	
	Game() {
		init();
	}
	private void init() {
		GE = new Environment();
		Settings = new Settings();
		GUI = new GraphicalUserInterface(WL,ML,KL);
		C = new Calculations();
	
		setup();
		/*A = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.repaint();
			}
		};*/
		//L = new EventHandler(GUI, "repaint", "", "");
		//L.create(MouseListener.class, GUI.getMouseMotionListeners(), "test");
		//FrameRate = 100;
		//timer = new Timer(FrameRate,A);
		
	}
	void setup() {
		GUI.setup();
		C.setup();
	}
	void start() {
		//timer.start();
		//S = new Sound();
	}
	void save() {
	}
	void quit() {
	}
}

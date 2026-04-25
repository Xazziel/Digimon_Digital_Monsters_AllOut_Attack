package DDMAOA;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{

	//Screen Settings
	
	final int originalTileSize = 32;
	final int scale = 3;
	
	final int tileSize = originalTileSize*scale;
	final int maxScreenCol = 12;
	final int maxScreenRow = 9;
	final int screenWidth = tileSize*maxScreenCol;
	final int screenHeight = tileSize*maxScreenCol;
	
	Thread gameThread;
	
	public GamePanel()
	{
		this.setPreferredSize(new Dimension(screenWidth,screenHeight));
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
	}

	public void startGameThread() {
		
		gameThread = new Thread(this);
		gameThread.start();
	}
	
	@Override
	public void run() {
		
		
		
	}
}

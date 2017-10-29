import java.awt.*;

public class LinesAndShapes extends DrawableAdapter {
	static LinesAndShapes ga = new LinesAndShapes();
	static GameBoard gb = new GameBoard(ga, "Lines and Shapes");
	
	public static void main(String[] args) {
		showGameBoard(gb);
	}
	
	public void draw (Graphics g){
		g.setColor (Color.BLACK);
		g.fillRect (0, 0, 500, 600);
		g.drawLine(100, 75, 260, 75);
		g.drawLine(300, 50, 400, 100);
		
		g.setColor(Color.WHITE);
		g.drawRect(50, 100, 50, 250);
		g.drawRect(50, 300, 130, 50);
		g.drawRect(250, 100,130, 50); 
		g.drawRect(250, 100, 50, 250);
		g.drawRect(250, 210, 90, 50);
		g.drawRect(250, 300, 130, 50);
		
		int x1 [] = {50, 100, 50}; 
		int y1 []= {100, 100, 150};
		g.fillPolygon(x1, y1, 3);
		g.setColor(Color.CYAN);
		int x2 [] = {100, 50, 100};
		int y2 [] = {100, 150, 200}; 
		g.fillPolygon(x2, y2, 3);
	
		g.setColor(Color.MAGENTA);
		int x3 [] = {50, 100, 50};
		int y3 [] = {150, 200, 300};
		g.fillPolygon(x3, y3, 3);
		
		g.setColor(Color.ORANGE);
		int x4 []= {100, 50, 100};
		int y4 []= {200, 300, 300};
		g.fillPolygon(x4, y4, 3);
		
		g.setColor(Color.pink);
		int x5 [] = {100, 50, 50}; 
		int y5 [] = {300, 300, 350};
		g.fillPolygon(x5, y5, 3);
		
		g.setColor(Color.green);
		int x6 []= {50, 100, 149};  
		int y6 []= {350, 300, 350};
		g.fillPolygon (x6, y6, 3);
		
		g.setColor(Color.YELLOW);
		int x7 [] = {100, 149, 180};
		int y7 [] = {300, 350, 300};
		g.fillPolygon(x7, y7, 3);
		
		g.setColor(Color.red);
		int x8 [] = {149, 180, 180};
		int y8 [] = {350, 350, 300};
		g.fillPolygon(x8, y8, 3);
		
		int x9 [] = {250, 380, 250};
		int y9 [] = {100, 100, 130};
		g.fillPolygon (x9, y9, 3);
		
		g.setColor  (Color.cyan);
		int x10 [] = {380, 380, 250, 250};
		int y10 [] = {150, 100, 130, 150};
		g.fillPolygon (x10, y10, 4);
		
		g.setColor  (Color.orange);
		int x12 [] = {300, 250, 250};
		int y12 [] = {150, 300, 150};
		g.fillPolygon (x12, y12, 3);
		
		g.setColor  (Color.magenta);
		int x13 [] = {300, 300, 250};
		int y13 [] = {300, 150, 300};
		g.fillPolygon (x13, y13, 3);
	
		
		g.setColor  (Color.yellow);
		int x15 [] = {250, 300, 250};
		int y15 [] = {350, 300, 300};
		g.fillPolygon (x15, y15, 3);
		
		g.setColor  (Color.white);
		int x16 [] = {250, 300, 350};
		int y16 [] = {350, 300, 350};
		g.fillPolygon (x16, y16, 3);
		
		g.setColor  (Color.PINK);
		int x17 [] = {300, 350, 380, 380 };
		int y17 [] = {300, 350, 350, 300};
		g.fillPolygon (x17, y17, 4);
		
		g.setColor  (Color.green);
		int x18 [] = {300, 300, 340};
		int y18 [] = {210, 260, 260};
		g.fillPolygon (x18, y18,3);
		
		g.setColor  (Color.blue);
		int x19 [] = {300, 340, 340};
		int y19 [] = {210, 210, 260};
		g.fillPolygon (x19, y19,3);
		
		g.setColor (Color.white);
		Font myFont = new Font ("brush script MT", Font.PLAIN, 90);
		g.setFont(myFont);
		g.drawString ("games", 125, 420); 
		
		
		
		}
		}
		
	
	



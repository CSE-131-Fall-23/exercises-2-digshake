package module4._02graphics;

import edu.princeton.cs.introcs.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while(!StdDraw.isMousePressed()) {
			StdDraw.pause(10);
			System.out.println("not pressed");
		}

		// here, the mouse has been pressed

		while(StdDraw.isMousePressed()) {
			StdDraw.pause(10);
			System.out.println("pressed");
		}
		// here the mouse is released
		
		
		// draw a point at the location of the mouse
		
		
		// here, a q has been typed
		
		
		StdDraw.text(0.5, 0.5, "Farewell!");

	}

}

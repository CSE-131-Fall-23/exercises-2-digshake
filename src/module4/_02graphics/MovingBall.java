package module4._02graphics;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class MovingBall {

	public static void main(String[] args) {
		double[][] positions = new double[1000][2];
		double[][] velocities = new double[1000][2];
		
		for(int i = 0; i < positions.length; i++) {
			positions[i][0] = Math.random(); //x position
			positions[i][1] = Math.random(); //y position
			
			velocities[i][0] = Math.random() * 0.01;
			velocities[i][1] = Math.random() * 0.01;
		}

		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.05);

		while (true) { //animation loop - 3 steps start here

			//Clear the canvas - step 1
			StdDraw.clear();

			//update the ball position - step 2
			for(int i = 0; i < positions.length; i++) { //once per ball
				positions[i][0] = positions[i][0] + velocities[i][0];
				positions[i][1] = positions[i][1] + velocities[i][1];
				if(positions[i][0] > 1 || positions[i][0] < 0) { //too far right
					velocities[i][0] = -velocities[i][0]; //back to left
				} 
				if(positions[i][1] > 1 || positions[i][1] < 0) { //too far right
					velocities[i][1] = -velocities[i][1]; //back to left
				} 

				//draw on canvas - step 2
				StdDraw.point(positions[i][0], positions[i][1]);
			}
			//pause to make the animation smooth - step 3
			StdDraw.show(10);

		}
	}
}

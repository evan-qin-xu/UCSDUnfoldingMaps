package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{
	public void setup() {
		size(90, 90);
		background(200, 200, 200);
	}
	
	public void draw() {
		fill(255, 255, 0);
		ellipse(75, 75, 85, 85);
		fill(0, 0, 0);
		ellipse(55, 60, 12, 20);
		ellipse(95, 60, 12, 20);
		
		noFill();
		arc(75, 90, 17, 17, 0, PI);
		
		
	}
}

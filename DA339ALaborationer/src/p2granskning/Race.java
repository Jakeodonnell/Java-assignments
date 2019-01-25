package p2granskning;

import java.util.Random;
import javax.swing.ImageIcon;

import p2.PaintWindow;


public class Race {
	private p2.PaintWindow window;
	private Car car1, car2;
	private int goalPosX = 80;
	private int goalPosY = 187;
	private int carStartPosX = 480;
	private int car1StartPosY = 210;
	private int car2StartPosY = 315;
	private int updateInterval = 15;
	private int maxDistanceMoved = 10;
	
	
	public Race(PaintWindow window, Car car1, Car car2) {
		this.window = window;
		this.car1 = car1;
		this.car2 = car2;
	}
		
	public void action() {
		window.setBackground(new ImageIcon("images/bg.GIF"));
		window.showImage(new ImageIcon("images/goal.GIF"), goalPosX, goalPosY);
		addCar(window, car1, carStartPosX, car1StartPosY);
		addCar(window, car2, carStartPosX, car2StartPosY);
		
		while (!carHitGoal(car1) && !carHitGoal(car2)) {
			moveCar(window, car1);
			moveCar(window, car2);
			try {
				Thread.sleep(updateInterval);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	private void addCar(PaintWindow window, Car car, int x, int y) {
		window.showImage(car.getImage(), car.getX(), car.getY());
		car.moveTo(x, y);
	}
	
	private boolean carHitGoal(Car car) {
		if (car.getX() <= goalPosX) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private void moveCar(PaintWindow window, Car car) {
		Random rand = new Random();
		int distanceMoved = rand.nextInt(maxDistanceMoved);
		
		int carPosX = car.getX();
		int newCarPosX = carPosX - distanceMoved;
		
		car.moveTo(newCarPosX, car.getY());
		updateCar(window, car);
	}
	
	private void updateCar(PaintWindow window, Car car) {
		window.hideImage(car.getImage());
		window.showImage(car.getImage(), car.getX(), car.getY());
	}
}

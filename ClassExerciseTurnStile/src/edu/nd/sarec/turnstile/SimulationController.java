package edu.nd.sarec.turnstile;

/**
 * Controls the entire Turnstile simulation
 * @author Jane
 *
 */
public class SimulationController {
	
	Turnstile turnstile;				// The turnstile
	final int longLineSize = 3;     	// How many people in line constitute a long line
	
	//Constructor
	public SimulationController() {
		turnstile = new Turnstile();
	}
	
	// Adds a person to the simulated line
	public void getInLine(String name) {
		System.out.println(name + " is getting in line");
		turnstile.getInLine(name);
	}
	
	
	// Simulates person adding a coin
	public void addCoin() {
		turnstile.addCoin();
	}
	
	
	// Simuates person pushing the turnstile
	public void pushTurnStile() {
		turnstile.pushTurnStile();
	}
	
	// Displays profit 
	public void showProfit() {
		turnstile.showProfit();
	}
	
	
	// Checks if the line is long
	public boolean hasLongLine() {
		if (turnstile.lineSize()> longLineSize)
			return true;
		else
			return false;
	}
	
}

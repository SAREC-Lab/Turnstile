package edu.nd.sarec.turnstile;


/**
 * Turnstile collects coins.  If a coin has been added and not yet 'spent' then the
 * turnstile can be pushed.
 * 
 * @author Jane
 *
 */
public class Turnstile {
	int availableTurns;  			// Counts number of coins entered that are not yet used
	TurnStileQueue turnstileQueue;	// Helper class tracks who is in the queue
	CoinCollector coinCollector;	// Helper class tracks coins and profit
	int profit = 0;					// Current profit
	
	// Constructor
	public Turnstile() {
		availableTurns = 0;
		coinCollector = new CoinCollector();
		turnstileQueue = new TurnStileQueue();
	}
	
	// Reset the turnstile queue
	public void reset() {
		//turnstileQueue.clearQueue();
		availableTurns=0;
	}
	
	// User adds a coin
	public void addCoin() {
		coinCollector.addCoin();
		availableTurns++;
	}
	
	// Returns current profit
	public int profit() {
		//return coinCollector.getProfit();
		return profit;
	}
	
	// Returns number of turnstile pushes still available based on coins collected
	public int getAvailableTurnCount() {
		return availableTurns;
	}
	
	// Checks if turnstile will move if pushed
	public boolean canEnterFromQueue() {
		if (availableTurns > 0)
			return true;
		else
			return false;
	}
	
	// Person enters the turnstile Queue
	// They don't enter money until they get close to the front of the queue
	public void getInLine(String name) {
		turnstileQueue.enterQueue(name);
	}
	
	// Displays profit
	public void showProfit() {
		System.out.println("Profit is: " + coinCollector.getProfit());
	}
	
	// User tries to push the turnstile
	// If it is pushable, person enters the zoo
	public void pushTurnStile() {
		String pushingPerson = turnstileQueue.peekQueue();
		if (availableTurns > 0) {
		   turnstileQueue.enterZoo();
		   availableTurns--;
		   System.out.println(pushingPerson + " has entered the zoo");
		} else {
			System.out.println(pushingPerson + " was denied entry");
		}
	}
	
	
	// Counts people in the queue
	public int lineSize() {
		return turnstileQueue.peopleCount();
	}
	
}

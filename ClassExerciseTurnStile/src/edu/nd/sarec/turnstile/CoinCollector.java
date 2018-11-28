package edu.nd.sarec.turnstile;


/**
 * Collects coins
 * @author Jane
 *
 */
public class CoinCollector {
	int totalCoins;				// Total coins collected
	int spentCoins;				// Counts how many have been used to push the turnstile
	
	
	// Constructor
	public CoinCollector() {
		totalCoins = 0;
		spentCoins = 0;
	}
	
	
	// Reset (for maintenance etc)
	public void reset() {
		totalCoins = 0;
		spentCoins = 0;
	}
	
	
	// Coin added
	public void addCoin() {
		totalCoins++;
	}
	
	// Coin spent (i.e., turnstile is pushed)
	public boolean spendCoin() {
		if (spentCoins < totalCoins) {
			spentCoins++;
			return true;
		}
		else
			return false;
	}
	
	// Returns available coin count
	public int getUnspentCount() {
		return totalCoins - spentCoins;
	}
	
	// Returns profit
	public int getProfit() {
		return totalCoins;
	}
	
	

}

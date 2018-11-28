package edu.nd.sarec.turnstile;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages the queue of people in the turnstile
 * @author Jane
 *
 */
public class TurnStileQueue {
	Queue<String> turnQueue;
	
	
	// Constructor
	public TurnStileQueue() {
		turnQueue = new LinkedList<String>();
	}
	
	
	// Check if people are in the queue
	public boolean hasPeople() {
		if (turnQueue.size() > 0 )
			return true;
		else
			return false;
	}
	
	// Clear the queue 
	public void clearQueue() {
		turnQueue.clear();
	}
	
	// Return queue count
	public int getCount() {
		return turnQueue.size();
	}
	
	// Return list of waiting people
	public Queue<String> getWaitingPeopleNames() {
		return turnQueue;
	}
	
	// Person is added to queue
	public void enterQueue(String name) {
		turnQueue.add(name);
	}
	
	// Get name of person at front of queue
	public String peekQueue() {
		if (turnQueue.size() > 0)
			return turnQueue.peek();
		else
			return "";
	}
	
	// Count people in the queue
	public int peopleCount() {
		return turnQueue.size();
	}
	
	
	// Person enters zoo and LEAVES the queue
	public String enterZoo() {
		String exitPerson = "";

		if (hasPeople()) {
			exitPerson = turnQueue.remove();
		}
				
		return exitPerson;
	}
}


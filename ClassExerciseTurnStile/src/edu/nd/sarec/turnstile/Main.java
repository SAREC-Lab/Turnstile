package edu.nd.sarec.turnstile;

public class Main {

	public static void main(String[] args) {
		SimulationController simController = new SimulationController();
		simController.getInLine("Mary");
		simController.getInLine("Frank");
		simController.addCoin();
		simController.pushTurnStile();
		simController.showProfit();
		simController.pushTurnStile();
		simController.addCoin();
		simController.pushTurnStile();
		simController.showProfit();
		simController.getInLine("John");
		simController.getInLine("Brian");
		simController.getInLine("Sally");
		simController.getInLine("Dee");
		if (simController.hasLongLine())
			System.out.println("Line is long");		
	}

}

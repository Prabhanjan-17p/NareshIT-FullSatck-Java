/*
 * toString() method
 * 		- it is used to run with the help of object name only
 * 		- Right click on the Program -> source -> generate toString()
 * 		- It reduce the complex of the program
 */

//ELC Class--------------------------
public class ToStringDemo {

	public static void main(String[] args) {
		Player virat = new Player();
		virat.setPlayerData(18, "Virat Kohli", 2000000);
		System.out.println(virat);

		System.out.println("...................");
		Player rohit = new Player();
		rohit.setPlayerData(45, "Rohit Sharma", 3999990);
		System.out.println(rohit);

	}

}

// BLC Class--------------------------
class Player {
	private int playerId;
	private String playerName;
	private double basePrice;

	public void setPlayerData(int playerId, String playerName, double basePrice) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.basePrice = basePrice;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", basePrice=" + basePrice + "]";
	}


}
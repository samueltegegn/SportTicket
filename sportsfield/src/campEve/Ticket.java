/**
 * 
 */


package campEve;

public class Ticket {
	public int number;
	public double price;
	
	public Ticket(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toString() {
		return "Number:" + this.number + "," + " price : " + this.price;

	}

	

}

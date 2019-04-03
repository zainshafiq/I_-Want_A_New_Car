/**
 * Car.java
 */

package ENSE470_Lab2;

/**
 * @author ShafiqZain
 *
 */

public interface Car {

	public String getDescription();
	
	public double getCost();

}

class BasicCar implements Car {
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Regular Car, ";
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 147000.00;
	}	
}
	
	
	

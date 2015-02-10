
public class Cat extends Mammal {
	
	private int numberOfLives;

	public Cat(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.setNumberOfLives(numberOfLives);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	

}

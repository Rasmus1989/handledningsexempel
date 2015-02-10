
public class Cat extends Mammal {
	
	private int numberOfLives;

	public Cat(String latinName, int gestationTime, int numberOfLives) {
		super(latinName, gestationTime);
		this.setNumberOfLives(numberOfLives);
	}

	@Override
	public String getInfo() {
		String info = "the cat " + getFriendlyName() + ", lat: " + getLatinName() + " nurses for "
				+ getGestationTime() + " months and has " + getNumberOfLives() + " lives";
		return info;
	}

	public int getNumberOfLives() {
		return numberOfLives;
	}

	public void setNumberOfLives(int numberOfLives) {
		this.numberOfLives = numberOfLives;
	}
	
	

}

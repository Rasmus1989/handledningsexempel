
public class Snake extends Animal {
	
	private boolean venomous;

	public Snake(String latinName, boolean venomous) {
		super(latinName);
		this.venomous = venomous;
	}


	public boolean isVenomous() {
		return this.venomous;
	}


	@Override
	public String getInfo() {
		String info = "";
		if(!this.venomous) {
			info = "the snake named " + getFriendlyName() + "lat: " + getLatinName() + " is not venomous";
		} else {
			info = "the snake named " + getFriendlyName() + "lat: " + getLatinName() + " is venomous";
		}
		return info;
	}

}

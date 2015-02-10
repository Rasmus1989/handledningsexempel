
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
		// TODO Auto-generated method stub
		return null;
	}

}

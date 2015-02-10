
public class Dog extends Mammal {
	
	private boolean isStupid;
	
	public Dog(String latinName, int gestationTime, boolean isStupid) {
		super(latinName, gestationTime);
		this.isStupid = isStupid;
	}
	
	public Dog(String latinName, int gestationTime, boolean isStupid, String friendlyName) {
		super(latinName, gestationTime);
		setFriendlyName(friendlyName);
	}

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public boolean isStupid() {
		return this.isStupid;
	}
	

}

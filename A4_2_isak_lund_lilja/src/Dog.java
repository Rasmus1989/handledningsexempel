
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
		String info = "";
		if(isStupid) {
			info = "the dog " + getFriendlyName() + ", lat: " + getLatinName() + " nurses for "
				+ getGestationTime() + " months and is stupid";
		} else {
			info = "the dog " + getFriendlyName() + ", lat: " + getLatinName() + " nurses for "
					+ getGestationTime() + " months and is not stupid";
		}
		return info;
	}
	
	public boolean isStupid() {
		return this.isStupid;
	}
	

}

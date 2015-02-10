
public abstract class Animal {
	private String latinName;
	private String friendlyName = "noname";
	
	public Animal(String latinName) {
		this.setLatinName(latinName);
	}
	
	public abstract String getInfo();
	
	public void setFriendlyName(String friendlyName) {
		this.friendlyName = friendlyName;
	}
	
	public String getFriendlyName() {
		return this.friendlyName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}
}

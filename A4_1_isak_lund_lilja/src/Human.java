
public class Human {
	
	private Dog dog;
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void buyDog() {
		this.dog = dog;
	}
	
	public String getInfo() {
		if(this.dog != null) {
			return this.name + " äger en hund som heter " + this.dog.getName();
		} else {
			return this.name + " äger inte en hund";
		}
	}

}

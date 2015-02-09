
public class Human {
	
	private Dog dog;
	private String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void buyDog(Dog dog) {
		this.dog = dog;
	}
	
	public String getInfo() {
		if(this.dog != null) {
			return getName()+ " äger en hund som heter " + this.dog.getName();
		} else {
			return getName() + " äger inte en hund";
		}
	}

}

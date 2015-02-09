
public class Test {

	public static void main(String[] args) {
		Human human = new Human("isak");
		System.out.println(human.getInfo());
		
		human.buyDog(new Dog("hundjävel"));
		System.out.println(human.getInfo());

	}

}

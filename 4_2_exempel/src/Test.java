import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		
		zoo.add(new Dog("canis lupus", 4, true));
		zoo.add(new Dog("canis lupus", 4, false, "brasse"));
		zoo.add(new Cat("lynx lynx", 3, 9));
		Cat cat = new Cat("lynx lynx", 3, 9);
		cat.setFriendlyName("misse");
		zoo.add(cat);
		zoo.add(new Snake("python skitfarlig", true));
		Snake snake = new Snake("python", false);
		snake.setFriendlyName("Bengt");
		zoo.add(snake);
		
		for(Animal animal : zoo) {
			System.out.println(animal.getInfo());
		}

	}

}

package lesson09.sub;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[10];
		animals[0] = new Human();
		animals[1] = new Human();
		animals[2] = new Dog();
		animals[3] = new Parrot();
		
		Talkable[] talkables = new Talkable[3];
		talkables[0] = new Human();
		talkables[1] = new Parrot();
		talkables[2] = new Speaker();
		for(Talkable t : talkables) {
			t.talk();
			
		}
		
		Human human = new Human();
		Dog dog = new Dog();
		System.out.println(human instanceof Human);
		System.out.println(human instanceof Animal);
		System.out.println(human instanceof Talkable);
		System.out.println(dog instanceof Talkable); // false
	}
}

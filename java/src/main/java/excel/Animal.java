package excel;

public abstract class Animal implements Mammal {
public void eat() {
	System.out.println("Eat like animal");
}

public void move() {
	System.out.println("move like animal");
}
public void sleep() {
	
	System.out.println("sleep like animal");
}

public static void main(String[] args) {
	Dog dog = new Dog();
	Animal anim = (Animal) dog;
	
	anim.eat();
	anim.move();
	anim.sleep();
	dog.eat();
}

}
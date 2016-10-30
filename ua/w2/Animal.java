public class Animal implements Pet {
	private final String name;

	public Animal(final String name) {
		this.name = name;
	}

	public void makeSound() {
	System.out.println(
		String.format("%s say : %s", this.name, "beep"));
	}

	private boolean isHungry() {
		return true;
	}
}
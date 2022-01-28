package razdel22;

public class Test {

	public static void main(String[] args) {
		Dog dog= new Dog();
		Cat cat= new Cat();
		BigDog bigDog= new BigDog();
		dog.greets();
		dog.greetsDog(bigDog);
		cat.greets();
		bigDog.greets();
		bigDog.greetsBigDog(bigDog);
		bigDog.greetsDog(bigDog);

	}

}

package SOLID.Liskov_Substitution_Principle;

public class Dog extends Animal{
	
    @Override
    public void makeNoise() {
        System.out.println("k�pek ses yapt�");
    }
}

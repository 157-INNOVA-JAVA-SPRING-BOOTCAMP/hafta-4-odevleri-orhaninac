package SOLID.Liskov_Substitution_Principle;

public class Cat extends Animal{
   @Override
	public void makeNoise() {
        System.out.println("kedi ses yaptý");
    }
}

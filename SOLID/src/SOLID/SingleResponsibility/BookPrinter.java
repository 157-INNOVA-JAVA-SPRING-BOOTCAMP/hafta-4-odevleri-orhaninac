package SOLID.SingleResponsibility;

public class BookPrinter {
	
    public void printTextToConsole(String text){
       System.out.println(text);
    }

    void printTextToAnotherPlatform(String text){
    	System.out.println(text);
    }

}

package SOLID.SingleResponsibility;

public class Book {
	
    private String name;
    private String author;
    private String text;



	public Book(String name, String author, String text) {
		super();
		this.name = name;
		this.author = author;
		this.text = text;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }

    public boolean isWordInText(String word){
        return text.contains(word);
    }
    

}

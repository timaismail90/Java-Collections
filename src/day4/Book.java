package day4;

public class Book {
	private String title;
	private double price;
	
	public Book(String bookTitle, double bookPrice) {
		this.title = bookTitle;
		this.price = bookPrice;
		
	}
	
	  String getTitle (){
		  return title;
		    
			
	}
	 
	 String getBookInfo() {
		 return title+ "-" +price;
		 
		 
	 }

}



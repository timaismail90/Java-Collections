package day4;

public class Textbook extends Book{
	private int edition;

	public Textbook(String title, double price, int edition) {
		super(title, price);
		this.edition = edition;
		}
	
	
   public String getBookInfo() {
//	
		return super.getBookInfo()+ "-" + this.edition;
		
	}
	
	public int getEdition (){
		
		return edition;
	}
		

	 public boolean canSubstituteFor(Textbook other){
		 return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());			
			
		 }
			
	 }
	
	
	
	
	
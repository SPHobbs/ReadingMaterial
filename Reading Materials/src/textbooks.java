
public class textbooks {
	private static String title;
	private static int pages;
	private static double price;
	public textbooks(String Title, int Pages, double Price) {
	    title = Title;
	    pages = Pages;
	    price = Price;
	}
	public String toString(){
		return "Title: " + title + ".\nPages: " + pages+ ".\nPrice: $" + price;
	}
}

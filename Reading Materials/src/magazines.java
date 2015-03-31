
public class magazines {
	private static String title;
	private static int pages;
	private static int edition;
	public magazines(String Title, int Pages, int Edition) {
	    title = Title;
	    pages = Pages;
	    edition = Edition;
	}
	public String toString(){
		return "Title: " + title + ".\nPages: " + pages+ ".\nEdition: " + edition;
	}
}

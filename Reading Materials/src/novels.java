
public class novels {
	private static String title;
	private static int pages;
	private static boolean fiction;
	public novels(String Title, int Pages, boolean Fiction) {
	    title = Title;
	    pages = Pages;
	    fiction = Fiction;
	}
	public String toString(){
		return "Title: " + title + ".\nPages: " + pages+ ".\nFiction?: " + fiction;
	}
}

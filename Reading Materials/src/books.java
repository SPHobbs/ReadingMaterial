
public class books {
	private static String title;
	private static int pages;
	private static boolean fiction;
	public books(String Title, int Pages, boolean Fiction) {
	    title = Title;
	    pages = Pages;
	    fiction = Fiction;
	}
	public String toString(){
		return "Title: " + title + ".\nPages: " + pages+ ".\nFiction?: " + fiction;
	}
}

package src;

import java.io.File;
import java.util.Hashtable;
import java.util.Scanner;
import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import textprocessing.In;


public class Web_Search_Engine {
	private static Scanner sc = new Scanner(System.in);	
	public static String os =  System.getProperty("os.name").toLowerCase();
	public static final String TEXT_RESET = "\u001B[0m";
	public static final String TEXT_BLACK = "\u001B[30m";
	public static final String TEXT_RED = "\u001B[31m";
	public static final String TEXT_GREEN = "\u001B[32m";
	public static final String TEXT_YELLOW = "\u001B[33m";
	public static final String TEXT_BLUE = "\u001B[34m";
	public static final String TEXT_PURPLE = "\u001B[35m";
	public static final String TEXT_CYAN = "\u001B[36m";
	public static final String TEXT_WHITE = "\u001B[37m";
	 public static final String RESET = "\033[0m";  // Text Reset
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

	public static void main(String[] args) throws Exception {
	   
	
		String choose = "yes";
		do {
		System.out.println(TEXT_GREEN+" 1) Enter 1 for the Web search in URL (http://geeksforgeeks.org/)\n"+TEXT_RESET);
		System.out.println(" 2) Enter 2 for searching the word from your webLink\n");
		System.out.println(" 3) Enter 3 to exit the web search enigine\n");
		String option = sc.next();


		switch (option) {
		case "1":
			 if(os.indexOf("wind") >= 0){
			FileUtils.cleanDirectory(new File(WEB_CRAWLING.HtmlFiles_folder_windows)); 
			FileUtils.cleanDirectory(new File(WEB_CRAWLING.TxtFiles_folder_windows)); 
			 }else {
					FileUtils.cleanDirectory(new File(WEB_CRAWLING.HtmlFiles_folder_mac)); 
					FileUtils.cleanDirectory(new File(WEB_CRAWLING.TxtFiles_folder_mac)); 
			 }
			String url = "http://geeksforgeeks.org/";
			choose = SearchWord.search1(url);
			break;
		case "2":
			 if(os.indexOf("wind") >= 0){
					FileUtils.cleanDirectory(new File(WEB_CRAWLING.HtmlFiles_folder_windows)); 
					FileUtils.cleanDirectory(new File(WEB_CRAWLING.TxtFiles_folder_windows)); 
					 }else {
							FileUtils.cleanDirectory(new File(WEB_CRAWLING.HtmlFiles_folder_mac)); 
							FileUtils.cleanDirectory(new File(WEB_CRAWLING.TxtFiles_folder_mac)); 
					 }
			System.out.println("Enter the Web Url");
			String link = sc.next();
			choose = SearchWord.search1(link);
		case "3":
			choose = "no";
			break;
	default:
		System.out.println("\nPlease enter correct option\n");
		choose = "yes";

		}
	}while(choose.equals("yes"));
	System.out.println("\nThanku For choosing our web Engine\n");
	//Clean webFiles and Text Files
	 if(os.indexOf("wind") >= 0){
			FileUtils.cleanDirectory(new File(WEB_CRAWLING.HtmlFiles_folder_windows)); 
			FileUtils.cleanDirectory(new File(WEB_CRAWLING.TxtFiles_folder_windows)); 
			 }else {
					FileUtils.cleanDirectory(new File(WEB_CRAWLING.HtmlFiles_folder_mac)); 
					FileUtils.cleanDirectory(new File(WEB_CRAWLING.TxtFiles_folder_mac)); 
			 }
 
	}

}	
	


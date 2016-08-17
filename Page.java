package tr.org.lyk2016.blog;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Page {
	private List<String> comments;
	private String title;
	private String body;
	private String category;
	private LocalDateTime date;

	public Page(String title, String body, String category) {
		this.title = title;
		this.body = body;
		this.category = category;
		date = LocalDateTime.now();
		this.comments = new ArrayList();
	}

	public List<String> getComments() {
		return comments;
	}

	public void setComments(List<String> comments) {
		this.comments = comments;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public LocalDateTime getDate() {
		return date;
	}


	public static void createPage(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the title:");
		String title = input.nextLine();

		System.out.println("Enter the body:");
		String body = input.nextLine();

		System.out.println("Enter the category:");
		String category = input.nextLine();
		
		Page page = new Page(title,body,category);
		PageHelper.addPage(page);
		System.out.println("Your page is created successfully");
		System.out.println("------------------------------");
	}
	
	public static void showPage(){
		System.out.println("=====Showing Page======");
		for(int i=1;i<PageHelper.getPageList().size();i++){
			System.out.println(i + "Title: "+PageHelper.getPageList().get(i).getTitle());
			System.out.println("    Text: "+PageHelper.getPageList().get(i).getBody());
		}
	}

}

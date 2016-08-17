package tr.org.lyk2016.blog;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Currency;
import java.util.Scanner;

public abstract class Post extends Page {

	private String type;

	public Post(String type, String title, String body, String category) {
		super(title, body, category);
		this.type = type;
		LocalDateTime date = LocalDateTime.now();

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static void createPost() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Post's type:");
		String type = input.nextLine();

		System.out.println("Enter the title:");
		String title = input.nextLine();

		System.out.println("Enter the body:");
		String body = input.nextLine();

		System.out.println("Enter the category:");
		String category = input.nextLine();

		if (type.equals("VideoPost")) {
			System.out.println("Enter the url:");
			String url = input.nextLine();
			VideoPost video = new VideoPost(title, body, category, type,url);
			PageHelper.addPost(video);
			System.out.println("Your VideoPost is created");
		}
		if (type.equals("TextPost")) {
			TextPost text = new TextPost(type, title, body, category);
			PageHelper.addPost(text);
			//System.out.println(text.getSummary());
			System.out.println("Your TextPost is created");
			System.out.println("------------------------------");
		}

	}
	public static void showPost(){
		System.out.println("=====Showing VideoPost======");
		for(int i=0;i<PageHelper.getPageList().size();i++){
			System.out.println(++i + "Title: "+PageHelper.getVideoPostList().get(i).getTitle());
			System.out.println(++i + "Url: "+PageHelper.getVideoPostList().get(i));
		}
	}

}
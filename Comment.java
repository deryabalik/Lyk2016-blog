package tr.org.lyk2016.blog;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Comment {
	private String author;
	private String text;
	private LocalDate commentDate;
	
	public Comment(String author, String text, LocalDate commentDate) {
		this.author = author;
		this.text = text;
		this.commentDate = commentDate;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public LocalDate getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(LocalDate commentDate) {
		this.commentDate = commentDate;
	}
	
	public static int createlistPosts() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Select a type: ");
		String type =reader.nextLine();
		if(type.equals("VideoPost")){
			System.out.println("VideoPost list");
			System.out.println(PageHelper.getTextPostList());
		
			
			printListPost(PageHelper.getVideoPostList());
		}
		if(type.equals("TextPost")){
			System.out.println("TextPost list");
			printListPost(PageHelper.getTextPostList());
		}
		System.out.println("Enter page number to see:");
		int input = reader.nextInt();
		input = input - 1;
		
		Post post = PageHelper.getVideoPostList().get(input);
		return -1;	
}
	private static void printListPost(List<Post> list) {
		int index = 1;
		for (int i =0;i<list.size();i++) {
			
			System.out.println(index + " - " + list.get(i).getTitle());
			System.out.println(index + " - " + list.get(i));
			index++;
		}
}
}
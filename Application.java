package tr.org.lyk2016.blog;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Please select an option:");
			int action = input.nextInt();
			String str;
			
			if (action == 1) {
				Page.createPage();
			}
			if (action == 2) {
				Post.createPost();
			}
			if (action == 3) {
				Comment.createlistPosts();
			}
			if (action == 4) {
				Page.showPage();
			}
			if (action == 5) {
				// TODO call show posts method
			}
		}

	}

}
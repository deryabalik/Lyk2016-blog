package tr.org.lyk2016.blog;
import java.util.ArrayList;
import java.util.List;

public class PageHelper {
	private static List<Page> pageList = new ArrayList<Page>();
	private static List<Post> videoPostList = new ArrayList<Post>();
	private static List<Post> textPostList = new ArrayList<Post>();

	public static void addPage(Page page) {
		pageList.add(page);
	}

	public static void addPost(Post post) {
		if(post instanceof VideoPost){
			videoPostList.add(post);
		}
		if(post instanceof TextPost){
			textPostList.add(post);
		}
		
		/*if (post.getType().equals("VideoPost")) {
			videoPostList.add(post);
		}
		if (post.getType().equals("TextPost")) {
			textPostList.add(post);
		}*/
	}

	public static List<Page> getPageList() {
		return pageList;
	}

	public static List<Post> getVideoPostList() {
		return videoPostList;
	}

	public static List<Post> getTextPostList() {
		return textPostList;
	}

}
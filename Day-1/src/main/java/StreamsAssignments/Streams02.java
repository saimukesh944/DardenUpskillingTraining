package StreamsAssignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class News{
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	
	public News(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId=newsId;
		this.postedByUser=postedByUser;
		this.commentByUser=commentByUser;
		this.comment=comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public String getPostedByUser() {
		return postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public String getComment() {
		return comment;
	}
}

public class Streams02 {
	

	
	public static int maxComments(List<News> news) {
		int id=0;
        int n1=0;
        for(News n: news)
        {
            int x = n.getComment().length();
            if(x>n1) {
                id=n.getNewsId();
                n1=x;
            }
        }
        return id;
    }
	

	
    public static long budgetCount(List<News>news) {
        long c=0;
        c=news.stream()
                .filter(n -> n.getComment().contains("budget"))
                .count();
        return c;
    }
    

    
    public static String maxCommentByUser (List<News>news) {
        String str="";
        long c=0;
        for(News n:news)
        {
            long x=news.stream()
            .filter(i->i.getCommentByUser().contains(n.getCommentByUser()))
            .count();
            if(x>c) 
            {
                c=x;
                str=n.getCommentByUser();
            }
        }
        return str;
    }
    

    
    public static Map<String, Integer>sortMaxCommentByUser(List<News>news){
        Map<String, Integer> m=new TreeMap<>();
        for(News n:news)
        {
            long x=news.stream().filter(i->i.getCommentByUser().contains(n.getCommentByUser()))
                    .count();
                    m.put(n.getCommentByUser(),(int)x);
        }
        return m;

    }
    public static void main(String[] args) {
        News n=new News(123, "abc", "xyz", "It is interesting");
        News n1=new News(124, "bcd", "abc", "Good work");
        News n2=new News(125, "cde", "bcd", "Informative");
        News n3=new News(126, "def", "abc","It is budget friendly");
        News n4=new News(127, "efg", "def", "Awesome news");
        List<News> List=new ArrayList<>();
        List.add(n);
        List.add(n1);
        List.add(n2);
        List.add(n3);
        List.add(n4);
        System.out.println("NewsId with maximum comments: "+maxComments(List));
        System.out.println("Count of the word 'Budget' in comments: "+budgetCount(List));
        System.out.println("User who posted maximum comments: "+maxCommentByUser(List));
        
        Map<String, Integer> m;
        m=sortMaxCommentByUser(List);
        for(Map.Entry<String, Integer> x:m.entrySet())
        {
            System.out.println(x.getKey()+":"+x.getValue());
        }
    }
}

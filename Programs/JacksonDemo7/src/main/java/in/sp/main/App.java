package in.sp.main;

import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sp.beans.Posts;

public class App 
{
    public static void main( String[] args) throws Exception
    {
    	String url = "https://jsonplaceholder.typicode.com/posts";
    	
    	ObjectMapper mapper = new ObjectMapper();
    	Posts[] posts_arr = mapper.readValue(new URL(url), Posts[].class);
    	for(Posts posts : posts_arr)
    	{
    		System.out.println("Userid : "+posts.getUserId());
    		System.out.println("Id : "+posts.getId());
    		System.out.println("Title : "+posts.getTitle());
    		System.out.println("Body : "+posts.getBody());
    		System.out.println("--------------------------------------");
    	}
    }
}

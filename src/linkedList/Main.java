package linkedList;
import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String [] args) {
		System.out.println("Enter the limit of cache");
		
		Scanner sc = new Scanner(System.in);
		  
  
        int limit = sc.nextInt();
        
        LRUCache LRUCache = new LRUCache(limit);
        for(int k=0;k<limit+1;k++) {
        	LRUCache.insert(sc.nextInt());
        }
        
        System.out.println("Elements in cache is:		");
        
        LRUCache.printCache();
        
	}

}


 
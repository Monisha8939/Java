import java.util.*;
public class qns_116 {
	public static int longestsubstring(String str) {
		Map<Character,Integer> map=new HashMap<>();
		int maxlen=0;
		int start=0;
		
		for(int i=0;i<str.length();i++) {
	        char ch=str.charAt(i);
	        
	        if(map.containsKey(ch) && map.get(ch)>=start) {
	        	start=map.get(ch)+1;
	        }
	        map.put(ch, i);
	        maxlen=Math.max(maxlen, i-start+1);
		}
		return maxlen;
}
	public static void main(String args[]) {
		String str="abcdefabcbb";
		System.out.println(longestsubstring(str));
	}
	
}



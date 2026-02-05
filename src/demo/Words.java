package demo;

public class Words {
	public static void main(String[] args) {
		 String[] words={"cat","car","ball","toy"};
	        System.out.println("Words starting with 'ca':");
	        
	        for (int i=0;i<words.length;i++) {
	            if (words[i].charAt(0)=='c'&& words[i].charAt(1)=='a') {
	                System.out.println(words[i]);
	         }
	     }
	}
}

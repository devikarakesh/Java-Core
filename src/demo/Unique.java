package demo;

public class Unique {
	    public static void main(String[] args) {
	    	  String str = "programming";
	          int len = str.length();

	          for (int i = 0; i<len; i++) {
	              int count = 0;

	              for (int j = 0; j < len; j++) {
	                  if (str.charAt(i)==str.charAt(j)) {
	                      count++;
	                  }
	              }

	              if (count==1){
	                  System.out.print(str.charAt(i) + " ");
	              }
	          }
	    }
}

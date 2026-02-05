package demo;

public class CountVowels {
	public static void main(String[] args) {
		String s="Welcome";
		int countv=0;
		int countc=0;

		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if(c>='A'&& c<='Z' ||c>='a' && c<='z')
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
				countv++;
			}else {
				countc++;
			}
		}
		System.out.println("vowels:"+countv);
		System.out.println("consonants:"+countc);
	}

}

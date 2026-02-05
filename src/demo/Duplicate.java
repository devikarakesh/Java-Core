package demo;

public class Duplicate {
    public static void main(String[] args) {
        String str = "programming";
        int len = str.length();

        for (int i = 0; i < len; i++) {
        	
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(str.charAt(i));
            }
        }
    }

}

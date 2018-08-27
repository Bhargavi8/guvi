
import java.util.Scanner;
 
 class Ideone1 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
String s2=sc.nextLine();
        String result1 = "";
String result2="";
        char firstChar = s1.charAt(0);
        result1 = result1 + Character.toUpperCase(firstChar);
        for (int i = 1; i < s1.length(); i++) {
            char currentChar = s1.charAt(i);
            char previousChar = s1.charAt(i - 1);
            if (previousChar == ' ') {
                result1 = result1+ Character.toUpperCase(currentChar);
            } else {
                result1 = result1 + currentChar;
            }
        }
 char secondChar = s2.charAt(0);
        result2 = result2 + Character.toUpperCase(secondChar);
        for (int i = 1; i < s2.length(); i++) {
            char currentChar = s2.charAt(i);
            char previousChar = s2.charAt(i - 1);
            if (previousChar == ' ') {
                result2 = result2 + Character.toUpperCase(currentChar);
            } else {
                result2 = result2 + currentChar;
            }
        }
        
        System.out.println(result1+""+result2);
    }
}

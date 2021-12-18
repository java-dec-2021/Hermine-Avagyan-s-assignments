

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

//1. create na empty string
//2. traverse trhough each letter in the string
//3. create a char variable that will store my letter[i]
public class StringReverse{
    public static void main(String[] args){
        String givenString = "Newton";
        String reversedString = "";
        char letter;
        System.out.println(givenString.length()-1);
        for (int i = givenString.length()-1; i>=0; i--){
            letter = givenString.charAt(i);
            reversedString += letter;
            System.out.println("letter");
        }
        System.out.println(reversedString);
    }
}
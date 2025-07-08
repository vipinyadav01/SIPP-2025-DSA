// write a function that will accept a string whose lenght is "len" the string has some #,&,*.? keywords in it now move
//all the string and return the whole string back and last print it 
//input: "the # Learn#P**rog&&ra??mo#n"
//output: "####TheLearnProgramon"
package Capgemini;
public class Question1 {
    public static String moveSymbolsToFront(String str) {
        StringBuilder specialChars = new StringBuilder();
        StringBuilder normalChars = new StringBuilder();
        String symbols = "#&*?";
        for (char ch : str.toCharArray()) {
            if (symbols.indexOf(ch) != -1) {
                specialChars.append(ch);
            } else if (ch != ' ') { 
                normalChars.append(ch);
            }
        }
        String result = specialChars.toString() + normalChars.toString();
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        String input = "the # Learn#P#rog#ra#mo#n";
        moveSymbolsToFront(input);
    }
}

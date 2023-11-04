import java.util.*;
public class morsetxt{
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       HashMap<Character,String> cm = new HashMap<>(){{
        put('A', ".-"); put('B', "-..."); put('C', "-.-."); put('D', "-.."); put('E', ".");
        put('F', "..-."); put('G', "--."); put('H', "...."); put('I', ".."); put('J', ".---");
        put('K', "-.-"); put('L', ".-.."); put('M', "--"); put('N', "-."); put('O', "---");
        put('P', ".--."); put('Q', "--.-"); put('R', ".-."); put('S', "..."); put('T', "-");
        put('U', "..-"); put('V', "...-"); put('W', ".--"); put('X', "-..-"); put('Y', "-.--");
        put('Z', "--..");put('0', "-----"); put('1', ".----"); put('2', "..---"); put('3', "...--"); put('4', "....-");
        put('5', "....."); put('6', "-...."); put('7', "--..."); put('8', "---.."); put('9', "----.");
        put(' '," ");
    }};
    HashMap<String,Character> mc = new HashMap<>(){{
        put(".-", 'A'); put("-...", 'B'); put("-.-.", 'C'); put("-..", 'D'); put(".", 'E');
        put("..-.", 'F'); put("--.", 'G'); put("....", 'H'); put("..", 'I'); put(".---", 'J');
        put("-.-", 'K'); put(".-..", 'L'); put("--", 'M'); put("-.", 'N'); put("---", 'O');
        put(".--.", 'P'); put("--.-", 'Q'); put(".-.", 'R'); put("...", 'S'); put("-", 'T');
        put("..-", 'U'); put("...-", 'V'); put(".--", 'W'); put("-..-", 'X'); put("-.--", 'Y');
        put("--..", 'Z');put("-----", '0'); put(".----", '1'); put("..---", '2'); put("...--", '3'); put("....-", '4');
        put(".....", '5'); put("-....", '6'); put("--...", '7'); put("---..", '8'); put("----.", '9');
        put(" ", ' ');
    }};
        System.out.println("MENU");
        System.out.println("Type 1 to convert text to Morse code: ");
        System.out.println("Type 2 to convert Morse code to text: ");
        System.out.println("Type 3 to exit: ");
        int x=sc.nextInt();
        sc.nextLine(); //handles newline char
        if(x==1) {
            System.out.println("Enter the text you want to convert: ");
            String txt =sc.nextLine().toUpperCase();
            String morse="";
            for(char c: txt.toCharArray()){
                morse+=cm.get(c)+" ";
            }
            System.out.printf("%s in morse code is: %s",txt,morse);
        }
        else if(x==2){
            System.out.println("Enter the morse code with space for letter: ");
            String mrs =sc.nextLine();
            String fin="";
            String[] mrw= mrs.split(" ");
            for(String c: mrw){
               String s=(""+mc.getOrDefault(c,' ')); //converts single-char to string.If key isnt present in the map, it appends space
                fin+=s;
            }
            System.out.printf("%s in text is: %s",mrs,fin);
            
        }
        else{
            System.out.println("EXITING...");
        }
    }
    }

import java.util.Scanner;

public class problem6{
    public static void main(String[] args)
    {
        char ch;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the Character:");
        ch=input.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println("Small letter");
        }
        else if(ch >='A' && ch<='Z')
        {
            System.out.println("Capital Letter");
        }
        else if(ch>='0'  && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Symbol");
        }
    }
}
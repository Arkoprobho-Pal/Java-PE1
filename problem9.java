import java.util.Scanner;

public class problem9{
    public static void main(String[] args){
        String str;
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=input.nextLine();
        //taking a blank string
        String rev="";
        for(char ch:str.toCharArray()){
            rev=ch+rev; //append reversely ,, before the rev string
        }
        System.out.println(rev);
    }
}
import java.util.Scanner;

public class problem10{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String input1;
        int input2;
        System.out.println("Enter a string as input1: ");
        input1=input.nextLine();
        System.out.println("Enter integer as input2: ");
        input2=input.nextInt();
        int len,index;
        len=input1.length();
        index=len-input2;
        String output=input1, subs=input1.substring(index);
        for(int i=0;i<input2;i++){
            output=output+subs;
        }
        System.out.println(output);
    }
}
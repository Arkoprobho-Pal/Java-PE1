import java.util.Scanner;

public class problem8{
    public static void main(String[] args){
        int target= 43;
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("Guess the Target Correctly( range : 1 to 50): ");
            int n=input.nextInt();
            if(n==target){
                System.out.println("Hooray! You guess the Target number correctly ,which is : "+n);
                break;
            }
        }
    }
}
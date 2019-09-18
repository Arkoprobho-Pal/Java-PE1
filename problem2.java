import java.util.Scanner;



public class problem2{
    public static void main(String[] argys)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type an integer:");
        int num=input.nextInt();
        if(num%2==0 && num>=20 && num<=30)
        {
            System.out.println("Jerry");
        }
        else if(num%2==1 && num >=20 && num<=30)
        {
            System.out.println("Tom");
        }
    }
}
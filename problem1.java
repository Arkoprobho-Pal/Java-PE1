import java.util.Scanner;

public class problem1{
    public static void main(String args[])
    {
        String num;
        Scanner input=new Scanner(System.in);
        System.out.println("Type a Number and Hit Enter:");
        num=input.nextLine();
        boolean palindrome=checkPalindrome(num);
        if(palindrome)
        {
            
            String msgevenSum=sumEven(num);
            System.out.println(num+ " is palindrome and sum of even numbers is "+msgevenSum+ " than 25");
        }
        else{
            System.out.println(num+ " is not palindrome" );
        }
        

    }
    public static boolean checkPalindrome(String number){
        int numlength=number.length();
        boolean flag=true;
        for(int i=0,j=numlength-1;i<j;i++,j--)
        {
            if(number.charAt(i)!= number.charAt(j))
            {
                flag=false;
                break;
            }
            
        }
        return flag;
    }
    public static String sumEven(String number)
    {   
        int numlength=number.length();
        int sum=0;
        for(int i=0;i<numlength;i++)
        {
            int a=Character.getNumericValue(number.charAt(i));
            if(a%2==0)
            {
                sum+=a;
            }
        }
        if(sum>25)
        {
            return "greater";
        }
        else{
            return "less";
        }
    }

}
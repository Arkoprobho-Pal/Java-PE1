import java.util.Arrays;
import java.util.Scanner;

public class problem7{
    public static void main(String[] args){
        int num;
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number:");
        num=input.nextInt();
        int count=0;
        int temp=num;
        //counting digits
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=num;
        //System.out.println("this is count="+count);
        int[] arr= new int[count];
        int evensum=0;
        //inserting digits
        for(int i=0;i<count;i++)
        {
            arr[i]=temp%10;
            if(arr[i]%2==0)
            {
                evensum=evensum+arr[i];
            }
            temp=temp/10;

        }
        //sort array using Arrays.sort() function
        Arrays.sort(arr);
        //swap first with last till middle to get reverse of ascending sort function
        for(int i=0,j=count-1;i<=j;i++,j--)
        {
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        System.out.print("Sorted number in non-increasing order : ");
        for(int i=0;i<count;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println("\nSum of even numbers :"+evensum);
        if(evensum>15){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }


    }
}
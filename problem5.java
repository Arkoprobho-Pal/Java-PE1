import java.util.Scanner;

public class problem5{
    public static void main(String[] args){
        String str;
        Scanner input=new Scanner(System.in);
        System.out.println("enter numbers differentiate with single space:");
        str=input.nextLine();
            String[] splitted=str.split(" ",0);
           int sum=0,eflag=0;
            for(String a:splitted){
                try {
                    sum+=Integer.parseInt(a);
                } catch (Exception e) {
                    //TODO: handle exception
                    eflag=1;
                    //System.out.println(e);
                }
            }
            if(eflag==0){
                System.out.println(sum);
            }
            else{
                System.out.println("error input");
            }
            

           /*
            float sum=0;
            float f;
            for(String a:splitted)
            {
                f=Float.parseFloat(a);
                sum=sum+f;
            }
            int num=(int)sum;
            float n=(float)num;
            if(n<sum){
                System.out.println("Error");
            }
            else{
            
                System.out.println(num);
            }*/
    }
}
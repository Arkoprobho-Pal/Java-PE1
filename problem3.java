import java.util.Scanner;

public class problem3{
    public static void main(String[] args){

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your Word:");
        String word=input.nextLine();

        int len=word.length();
        int errorflag=0;
        
        for(int i=0;i<len;i++)
        {
            char ch=word.charAt(i);
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
            {
                errorflag=0;
            }
            else{
                errorflag=1;
                System.out.print("Error !");
                break;
            }
            if(errorflag==0)
            {
                String result= checkVC(ch);
                System.out.print(result+" ");
            }
        }
    }
    public static String checkVC(char ch){
        if(ch=='a'|| ch=='A' || ch=='e' || ch=='E'|| ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U' )
        {
            return "Vowel";
        }
        else{
            return "Consonant";
        }
    }
    
}
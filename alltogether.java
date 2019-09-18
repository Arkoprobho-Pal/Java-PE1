import java.util.Scanner;

public class alltogether{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.println("Select one from below: \n ");
            System.out.println("problem1 : 1\nproblem2 : 2\nproblem3 : 3\nproblem4 : 4\nproblem5 : 5\nproblem1 : 6\nproblem2 : 7\nproblem3 : 8\nproblem4 : 9\nproblem5 : 10\n");
                int choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.println("you've selected problem1 as you choice \n");
                    problem1.main(null);
                    break;
                case 2:
                    System.out.println("you've selected problem2 as you choice \n");
                    problem2.main(null);
                    break;
                case 3:
                    System.out.println("you've selected problem3 as you choice \n");
                    problem3.main(null);
                    break;
                case 4:
                    System.out.println("you've selected problem4 as you choice \n");
                    problem4.main(null);
                    break;
                case 5:
                    System.out.println("you've selected problem5 as you choice \n");
                    problem5.main(null);
                    break;
                case 6:
                    System.out.println("you've selected problem6 as you choice \n");
                    problem6 instance= new problem6();
                    instance.main(null);
                    break;
                case 7:
                    System.out.println("you've selected problem7 as you choice \n");
                    problem7.main(null);
                    break;
                case 8:
                    System.out.println("you've selected problem8 as you choice \n");
                    problem8.main(null);
                    break;
                case 9:
                    System.out.println("you've selected problem9 as you choice \n");
                    problem9.main(null);
                    break;
                case 10:
                    System.out.println("you've selected problem10 as you choice \n");
                    problem10.main(null);
                    break;
                    
                default:
                    System.out.println("Please choose a correct option\n");
            }
            System.out.println("\n\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n\n");

        }
    }
}
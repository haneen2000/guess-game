import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Random rand =new Random();

        System.out.println("i choose number from 1 to 100 \n try to guess them");
        int noOfTry=10;
        int theno =rand.nextInt(101);
        System.out.println("you have"+noOfTry+"guess(es)");

        int loop=1;
        while (loop==1){
            int guessno =input.nextInt();

            if(noOfTry<=1)
                break;
            if (guessno==theno){
                System.out.println("you win");
                loop=0;
            }
            else if (guessno > theno){
                 System.out.println("try smaller no");
                noOfTry--;
                System.out.println("you have"+noOfTry+"guess(es)");

            }
            else if (guessno < theno){
                System.out.println("try bigger no");
                noOfTry--;
                System.out.println("you have"+noOfTry+"guess(es)");

            }
        }
        if (noOfTry<=1)
        System.out.println("you lose");
    }}

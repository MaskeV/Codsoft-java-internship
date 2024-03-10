import java.util.Scanner;
import java.util.Random;

public class RandomNumberGUesser{
  public static void main(String[] args){
  int lowerBound;
  int upperBound;
  int currentGuess;
  int numGuess;
  Scanner sc= new Scanner(System.in);
  int rd;
  int n;
  int score=0;
 System.out.print("Enter no of rounds you want to play: ");
  n=sc.nextInt();
  for(rd=1;rd<=n;rd++){
    System.out.println ("Round: "+rd);
    System.out.print("Enter lowebound:");
    lowerBound=sc.nextInt ();
    System.out.print("Enter upperbound:");
    upperBound=sc.nextInt ();
    Random no = new Random();
    numGuess= no.nextInt(lowerBound,upperBound+1);
    int k=0;
    System.out.println("Guess a number between "+lowerBound+" and "+upperBound+":");
    currentGuess=sc.nextInt();
    while(currentGuess!=numGuess)
    {
        if(currentGuess<lowerBound||currentGuess>upperBound)
        {
            System.out.println("Guess out of bound");
            k++;
            currentGuess = sc.nextInt();
            continue;
        }
      int diff=currentGuess-numGuess;
      if(diff>0) {
            System.out.println ("Too high");
            currentGuess= sc.nextInt ();   
            k++;
      }
      else {
            System.out.println ("Too low:");
            currentGuess =sc.nextInt();  
            k++;
      }
      if(k==5)
      {
        System.out.println ("You lose! Try again!");
        break;
      }
    } 
       if(k<5)
       {
        System.out.println ("Guess is Correct");
        score+=10;
       }
    }
      System.out.println("Your score is "+score);
  }
  
  
}


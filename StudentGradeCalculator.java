import java.util.Scanner;
public class StudentGradeCalculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out. println ("Enter marks of each subject:");
    
    System.out.print ("Maths:");
    int mat = sc.nextInt();
    System.out.print ("English:");
    int eng = sc.nextInt();
    System.out.print ("Marathi:");
    int mar= sc.nextInt();
    System.out.print ("Sience:");
    int sci= sc.nextInt();
    System.out.print ("History :");
    int his= sc.nextInt();
    
    int total = mat+ eng + mar +sci+ his;
    float per =total/5;
    String grade;
    if(per>=95)
    {
      grade="A+";
    }
    else if(per>=90&&per<95)
    {
      grade="A";
    }
    else if(per>=85&&per<90)
    {
      grade="B+";
    }
    else
if(per>=80&&per<85)
{
  grade="B";
}
    else if(per>=75&&per<80)
    {
      grade="C+";
    }
    else if(per>=70&&per<75)
    {
      grade="C";
    }
    else if(per>=65&&per<70)
    {
      grade="D+";
    }
    else if(per>=60&&per<70)
    {
      grade="D";
    }
    else 
    {
      grade="F";
    }
    System.out.println("Grand total= "+total);
    System.out.println ("Average Percentage= "+per);
System.out.println("Grade= "+grade);
    
  }


}

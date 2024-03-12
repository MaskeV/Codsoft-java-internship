import java.util.Scanner;
public class CourseRegistration{
      String name,email,cono;
    public void studentRegistration(){
       System.out.print("Full name:");
       Scanner sc = new Scanner(System.in);
       name = sc.nextLine();
       System.out.print("Email Id:");
       email=sc.next();
       while(email.contains("gmail.com")==false)
       {
        System.out.print("Invalid email try again!\nEmail Id=");
        email=sc.next();
       }
       System.out.print("Contact no:");
       cono=sc.next();
       while(cono.length()!=10)
       {
         System.out.println("Invalid No");
         System.out.print("Enter valid Contact no:");
         cono=sc.next();
       }
       System.out.println("Choose course you want to register for:\n101.Python for Beginners\n201.Jav Masterclass\n301.Basics of java\n401.ML using Python");
       System.out.print("Enter course code:");
       int ch=sc.nextInt();
       switch(ch)
       {
        case 101:
        System.out.println("Course prize:Rs.1000");

        case 201:
        System.out.println("Course prize:Rs.700");
        case 301:
        System.out.println("Free course");
        case 401:
        System.out.println("Course prize:Rs.1500");
       }
       System.out.print("Slots available are:1.15march-21march  2.25March-31March\nSelect slot:");
       sc.nextInt();
       System.out.print("Enter Y to register and N to cancle registration:");
       char reg=sc.next().charAt(0);
       if(reg=='Y'){
       System.out.println("Thank you for registring ");
       }
       else{
         System.out.println("Registration cancelled");
       }


    }
    public static void main(String[] args) {
        System.out.println("Welcome to Course Store");
        Scanner sc = new Scanner(System.in);
        boolean flag=true;
        while (flag) {
        System.out.println("101.Python for Beginners\n201.Jav Masterclass\n301.Basics of java\n401.ML using Python");
        System.out.print("Enter course code of course you want to know about: ");
        int ch=sc.nextInt();
        char co='N';
        switch(ch)
        {
           case 101 :
           System.out.println("Course code: "+ch);
           System.out.println("Course name:Python for beginners\nInstructor:Anand Jadhav\nLanguage:English\nDuration:3 Weeks\nMode:Online\nTiming:9pm to 10pm");
           System.out.println("Intake:50 Students per slot\nSlots available are:1.15march-21march  2.25March-31March");
           System.out.println("Description:\nThis course introduces you to basics of Python programming.\nThe topics covered in this course are:\n1.Programming Fundamentals\n2.Python Baics\n3.Data Structures\n4.Object oriented programming using Python \nPrice: Rs.1000");
           System.out.print("To Start registration enter Y and to explore more enter N:");
           co=sc.next().charAt(0);
           if(co=='Y'){
            flag=false;
           }
           break;
         
           case 201:
           System.out.println("Course code: "+ch);
           System.out.println("Course name:Java Masterclass\nInstructor:Ankita Tiwari\nLanguage:English\nDuration:15 days\nMode:Online\nTiming:Flexible");
           System.out.println("Intake:50 Students per slot\nSlots available are:1.15march-21march  2.25March-31March");
           System.out.println("Description:\nThis course introduces you to basics of core java along with object oriented programming.\nThe topics covered in this course are:\n1.Programming Fundamentals\n2.Java Baics\n3.Data Structures\n4.Object oriented programming with Java\nPrice: Rs.700");
           System.out.print("To Start registration enter Y and to explore more enter N:");
           co=sc.next().charAt(0);
           if(co=='Y'){
            flag=false;
           }
           break;
      

           case 301:
           System.out.println("Course code: "+ch);
           System.out.println("Course name:Basics of C language\nInstructor:Chirag Bhosale\nLanguage:English\nDuration:4 Weeks\nMode:Online\nTiming:8pm to 9pm");
           System.out.println("Intake:50 Students per slot\nSlots available are:1.15march-21march  2.25March-31March");
           System.out.println("Description:\nThis course introduces you to basics of C language along with data structures.\nThe topics covered in this course are:\n1.C Fundamentals\n2.Data Structures\n3.Functions\n4.Recursion\nFree course");
           System.out.print("To Start registration enter Y and to explore more enter N:");
           co=sc.next().charAt(0);
           if(co=='Y'){
            flag=false;
           }
           break;

           case 401:
           System.out.println("Course code: "+ch);
           System.out.println("Course name:ML using Python\nInstructor:Viraj Maske\nLanguage:English\nDuration:1 Week\nMode:Online\nTiming:Flexible");
           System.out.println("Intake:50 Students per slot\nSlots available are:1.15march-21march  2.25March-31March");
           System.out.println("Description:\nThis course introduces you to basics of ML along with 5 ML projects\nThe topics covered in this course are:\n1.Ml Fundamentals\n2.Algorithms\n3.Tenserflow\n4.ML projects\nPrice: Rs.1500");
           System.out.print("To Start registration enter Y and to explore more enter N:");
           co=sc.next().charAt(0);
           if(co=='Y'){
             flag=false;
           }
           break;
        
           default:
           System.out.print("Sorry course not available \nEnter available course code:");
           ch=sc.nextInt();
        } 
  
        }
         CourseRegistration cs= new CourseRegistration();
        cs.studentRegistration();
      
        sc.close();
    }
}
import java.util.Scanner;

public class userclass {

    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        Studentmanagementsystem  sms=new Studentmanagementsystem();
    
        while(true){

            System.out.println("Student Management System");
            System.out.println("1: Add Student ");
            System.out.println("2:Remove Student");
            System.out.println("3:Search Student");
            System.out.println("4:Display All Student");
            System.out.println("5:Exit");
            System.out.println("Enter your choice");
            int choice=scn.nextInt();
            scn.nextLine();
            switch(choice){

              case 1:
                   System.out.println("Enter Student name");
                   String name=scn.nextLine();
                   System.out.println("Enter student Roll number");
                   int roll=scn.nextInt();
                   scn.nextLine();
                   System.out.println("Enter Student Grade");
                   String grade=scn.nextLine();

                   sms.addStudent(new student(name, roll, grade));
                   break;

              case 2:
                     System.out.println("Enter roll number to remove student");
                     sms.removeStudent(scn.nextInt());
                     break;
              
              case 3:
                     System.out.println("Enter Roll number to search student");
                     student s=sms.searchStudent(scn.nextInt());
                     if(s!=null){
                        System.out.println("Student found ");
                        System.out.println(s);
                    }
                     else
                     System.out.println("Student not found");
                     break;

              case 4:
                     
                    sms.displayall();
                    break;
              case 5:
                     System.out.println("Exiting the application.");
                     System.exit(0);
                     break;
              default:
                    System.err.println("Invalid choice.please enter valid choice ");
                
            }



        }
    
    }
    
}

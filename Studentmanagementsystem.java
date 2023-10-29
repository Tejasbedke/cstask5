import java.util.ArrayList;
public class Studentmanagementsystem {
    

    private ArrayList<student> Students=new ArrayList<>();
     

    public void addStudent(student stud){
        Students.add(stud);
    }

    public void removeStudent(int rollnumber){
        Students.removeIf(student ->student.getRollno()==rollnumber);
    }

    public student searchStudent(int rollno){
        for(student s:Students){
            if(s.getRollno()==rollno){
                return s;
            }
        }
        return null;
    }

    public void displayall(){

        for (student s:Students){
            System.out.println(s);
        }
    }

}

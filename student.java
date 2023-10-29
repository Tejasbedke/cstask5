public class student {

  private  String Name;
  private  int rollno;
  private String grade;

student(String name,int roll,String grade){
    this.Name=name;
    this.rollno=roll;
    this.grade=grade;
}

public String getName() {
    return Name;
}
public int getRollno() {
    return rollno;
}
public String getGrade() {
    return grade;
}

    @Override
    public String toString(){
        return  "\tStudent Name:->"+Name+
                "\tStudent roll No:->"+rollno+
                "\tStudent grade:->"+grade;
    }
    

}


public class School {

    
    public static void main(String[] args) {

        Student student1=new Student("Rose",1,"9087908767","09/03/1999",'A');
        student1.Student_info();

        Teacher teacher1=new Teacher("ABC",40,"AB12",60000,"English");
        teacher1.Teacher_info();

        Subject sub1=new Subject("English",5);
        Subject sub2=new Subject("Marathi",5);
        Subject sub3=new Subject("Hindi",5);
        Subject sub4=new Subject("Mathematics",4);
        Subject sub5=new Subject("Science",4);


        sub1.Subject_info();
        sub2.Subject_info();
        sub3.Subject_info();
        sub4.Subject_info();
        sub5.Subject_info();

        
    }
}


public class Student
    {
        private String name;
        private int roll_no;
        private String contact;
        private String dob;
        private char grade;

        public Student(String name,int roll_no,String contact,String dob,char grade)
        {
            this.name=name;
            this.roll_no=roll_no;
            this.contact=contact;
            this.dob=dob;
            this.grade=grade;
        }

        public void Student_info()
        {
            System.out.println("Student Name :- "+name);
            System.out.println("Roll Number :- "+roll_no);
            System.out.println("Cont Number :- "+contact);
            System.out.println("Student DOB :- "+dob);
            System.out.println("Grade :- "+grade);
            System.out.println();
        }

    }
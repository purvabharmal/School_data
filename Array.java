class Student
{
    int roll_no;
    String name;
    int marks;
}

public class Array {

    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.roll_no=1;
        s1.name="Harry";
        s1.marks=78;

        Student s2=new Student();
        s2.roll_no=2;
        s2.name="Yash";
        s2.marks=89;

        Student s3=new Student();
        s3.roll_no=3;
        s3.name="Shiv";
        s3.marks=98;

        Student students[]=new Student[3];
        
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;

        // for(int i=0;i<students.length;i++)
        // {
        //     System.out.println(students[i].roll_no + ":" +students[i].name+ ":" +students[i].marks);
        //     System.out.println();
        // }

        for(Student stud : students)
        {
            System.out.println(stud.roll_no + ":" +stud.name+ ":" +stud.marks);
        }

        // int num[][]=new int[3][4];

        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         num[i][j]=(int)(Math.random()*100);
        //     }
        // }

        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(num[i][j] +" ");
        //     }
            
        //     System.out.println();
        // }
        

        

    }
    
}

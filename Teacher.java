
    public class Teacher
    {
        private String name;
        private int age;
        private String emp_id;
        private double salary;
        private String sub; 

        public Teacher(String name,int age,String emp_id,double salary,String sub)
        {
            this.name=name;
            this.age=age;
            this.emp_id=emp_id;
            this.salary=salary;
            this.sub=sub;
        }

        public void Teacher_info()
        {
            System.out.println("Name :- "+name);
            System.out.println("Age :- "+age);
            System.out.println("ID :- "+emp_id);
            System.out.println("Salary :- "+salary);
            System.out.println("Subject :- "+sub);
            System.out.println();
        }
    }

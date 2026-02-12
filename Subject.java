
    public class Subject
    {
        private String sub_name;
        private int sub_credit;

        public Subject(String sub_name,int sub_credit)
        {
            this.sub_name=sub_name;
            this.sub_credit=sub_credit;
        }

        public void Subject_info()
        {
            System.out.println("Subject Name :- "+sub_name);
            System.out.println("Credit Points :- "+sub_credit);
            System.out.println();
        }

    }

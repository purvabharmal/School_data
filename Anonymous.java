class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}


public class Anonymous
{
    public static void main(String[] args) {
        
        A obj=new A()
        {
            public void show()
            {
                System.out.println("In show");
            }
        };
        obj.show();

    }

}
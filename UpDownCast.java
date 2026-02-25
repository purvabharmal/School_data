class A
{
    public void show()
    {
        System.out.println("In A show");
    }
}

class B extends A
{
    public void show1()
    {
        System.out.println("In B show");
    }
}


public class UpDownCast {

    public static void main(String[] args) {
        
        A obj=(A) new B();    //Upcasting 
        obj.show();

        B obj1=(B) obj;      //Downcasting
        obj1.show1(); 
    }
    
}

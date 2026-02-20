class Human
{
    private int age;
    private String name;

    public Human()      //default
    {
        age=12;
        name="Harry";

        //System.out.println("In Constructor...");
    }

    public Human(int age,String name)  //parameterized constructor
    {
        this.age=age;
        this.name=name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age=age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
} 


public class Constr {

    public static void main(String[] args) {

        Human obj=new Human();
        Human obj1=new Human(25,"Radha");

        System.out.println(obj.getName()+":"+obj.getAge());
        System.out.println(obj1.getName()+":"+obj1.getAge());

        // obj.setAge(25);
        // obj.setName("Purva");

        // System.out.println(obj.getName()+":"+obj.getAge());
        
    }
    
    
}

abstract class Car
{
    public abstract void drive();
    public abstract void fly();
    
    public void playMusic()
    {
        System.out.println("playing music...");
    }
}

abstract class Venue extends Car
{
    public void drive()
    {
        System.out.println("driving...");
    }
}

class UpdatedVenue extends Venue  // concrete class.. we can create object of concrete class
{
    public void fly()
    {
        System.out.println("Flying...");
    }
}

public class Abstract {
    
    public static void main(String[] args) {

        Car obj=new UpdatedVenue();   // We cannot create the object of "abstract class".. 
        
        obj.playMusic();
        obj.drive();
        obj.fly();
    }

}

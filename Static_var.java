class Mobile
{
    String brand;
    int price;
    static String name; 

    public void show()
    {
        System.out.println(brand+" : "+price+" : "+name);
    }
}

public class Static_var {

    public static void main(String[] args) {

        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=150000;
        Mobile.name="Smartphone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=100000;
        Mobile.name="phone";

        obj1.show();
        obj2.show();

    }
    
}

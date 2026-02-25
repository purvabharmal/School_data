final class Cal
{
    final public void show()
    {
        System.out.println("In show method");
    }

    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}

// class Advcal extends Cal  // this class can't extend class Cal because of final 
// {
//     public void show() //this method does not override above show because of final
//     {
//         System.out.println("In show");
//     }
// }

public class Final {

    public static void main(String[] args) {
        
        Cal obj=new Cal();
        obj.show();
        obj.add(40,10);

        // final int num=2;
        // //num=9; it gives error here by using final keyword
        // System.out.println(num);
    }
    
}

class A        //extends Object by default
{
    public A()
    {
        super();                //Every constructor has by default super()method 
        System.out.println("In A");
    }

    public A(int n)
    {
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B()
    {
        super();                //Every constructor has by default super()method 
        System.out.println("In B");
    }

    public B(int n)
    {
        this();
        //super(5);
        System.out.println("In B int");
    }

}

public class Demo {

    public static void main(String[] args) {

        B obj=new B();
        
        // int x=20;
        // int y=15;

        // if(x>10 && y<=20)
        //     System.out.println("True");
        // else
        //     System.out.println("False");

        // int i=1;

        // while(i<=5)
        // {
        //     System.out.println("Hey "+i);

        //     int j=1;
        //     while(j<=3)
        //     {
        //         System.out.println("hi "+j);
        //         j++;
        //     }
        //     i++;
        // }


        // int i=5;

        // do 
        // {
        //     System.out.println("Hello "+i);
        //     i++;
        // }while(i<=4);

        // for(int i=1;i<6;i++)
        // {
        //     System.out.println("Day "+i);

        //     for(int j=1;j<=9;j++)
        //     {
        //         System.out.println(" " +(j+8)+"-"+" "+(j+9));
        //     }
        // }    




    }
    
}

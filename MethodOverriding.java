class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }
}

class AdvCalc extends Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2+100;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        
        AdvCalc obj=new AdvCalc();
        int r=obj.add(1,2);
        System.out.println(r);
    }
    
}

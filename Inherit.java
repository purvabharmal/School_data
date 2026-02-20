
public class Inherit {
    
    public static void main(String[] args) {

        AdvCalc obj=new AdvCalc();

        int r1=obj.add(20,786);
        int r2=obj.sub(67,60);
        int r3=obj.multiplication(34,20);
        int r4=obj.division(20,10);


        System.out.println("Addition="+r1+" "+"Subtraction="+r2);
        System.out.println("Multiplication="+r3+" "+"Division="+r4);
        
    }
}

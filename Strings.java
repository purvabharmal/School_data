public class Strings {

    public static void main(String[] args) {
        
        // String name=new String("Purva"); //mutable string (no change in string)

        // System.out.println("Hey " +name);
        // System.out.println(name.charAt(3));

        // String name="Purva";
       // name=name +" Bharmal";

        // System.out.println("Hello "+name);

        // String s1="Purva";
        // String s2="purva";

        // System.out.println(name==s1);

        StringBuffer s=new StringBuffer("Purva"); //Immutable String (change in string)

        System.out.println(s.capacity());
        s.append(" Bharmal");
        //s.deleteCharAt(2);
        s.insert(0,"Hello ");
        System.out.println(s);
    }
    
}

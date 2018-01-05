package Lab2;



public class CompareDriver
{
    
    /**
     * Constructor for objects of class CompareDriver
     */
    public static void main(String[] args)
    {
        String s1 = new String("hi");
        String s2 = new String("bye");
        
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        
        System.out.println(Compare1.largest(s1, s2));
        System.out.println(Compare3.largest(s1, s2));
        System.out.println(Compare3.largest(i1, i2));
        System.out.println(Compare3.largest(s1, i2));
    }

}

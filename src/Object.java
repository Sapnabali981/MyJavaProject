
public class Object{
    public String toString()
    {
        return "Hey";
    }
    public static void main(String args[])
    {
        System.out.println("Every java class is extending a object class");
        /*
        well we know right every java class will extend object class
        */
       As a=new As();
       System.out.println(a);
       /*
        here I have basically created 2 objects 
        with the help of Tostring method we will be getting the memory address of a object
       */
       As a1=new As();
       System.out.println(a1);
    String b=a1.toString();
    /*
    here basically this to string method is inherited from object class.
    which is going to return actual memory address of an object in the form of hexadecimal.
    can we customize the toString method yes we can do that as well
    in order to check whether both the Reference variable are pointing to same object or not for that we can make use of == operator.
    in order to check whether both object are containing same contents are not for that we will make use equals method.
    */
    System.out.println(b);
    System.out.println(a1==a);//false I guess both object are different so output will be false.
    System.out.println(a.equals(a1));//false.
    /*
    Both objects are equal only if there hashcode and contents both are same
    if one of factor is not matching then they are not equal at all.
    but we do can customize the equal method as well and over ride it provide our own implementation.
    */
    }

}
class As{
    int marks=20;
    public String toString()
    {
        return "Hey";
    }
    public boolean equals(As a1){

        return this.marks==a1.marks;//for comparing integer value we make use of equal to equal operator.
    }
    /*
    equals method == operator behaves differently in terms of string as well in terms of objects
    even IDE also generates toString and equals method.
    */
}

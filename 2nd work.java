 class human{
    void head(){
        System.out.println("Eyes");
        System.out.println("mouth");
        System.out.println("nose");
        
    }
}
class Person extends human{
public void legs(){
    System.out.println("people have two arms");
}
}
class child extends person{
    void female(){
        System.out.println("breasts");
        System.out.println("shoulder");
        System.out.println("hands");
    }
}
interface bodyparts{
    void feet();
}
class A extends person implements bodyparts{
   public void feet(){
    System.out.println("toes");
    
}
}
public class secondinheritance{
    public static void main(String[] args) {
        chipanze X= new child();
        X.head();
        X.female();
        //X.feet();
        X.legs();

    }
}

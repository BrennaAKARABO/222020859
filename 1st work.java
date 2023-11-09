class Animal{
void eat(){
    System.out.println("animal is eating");   
}
  
}
 class carnivores extends animals{
    void barking(){
        System.out.println("dog");
    }
}
 class domestic extends carnivores{
    void quadrapedal()
        System.out.println("puppy");
    }
 }
 interface mamal{
    void obj();
 }
 class n extends doemstic implements mamal{
public void obj(){
    System.out.println("These are animals");
}
}
public class firstinheritance{
    public static void main(String[] args) {
        domestic c= new domestic ();
        c.dog();
        c.barking();
        c.quadrapedal();
        

        

    }
}
        
    


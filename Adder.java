public class Adder {
    public int add(int num1, int num2){
        return num1 + num2;

    }
    public class Main{
        public static void main(String[] args) {
            Adder myAdder= new Adder();
            int result= myAdder.add(5,2);
            System.out.println("result: " + result);
            
        }
    }
}


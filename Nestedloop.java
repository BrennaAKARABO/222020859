public class Nestedloop {
    public static void main(String[] args) {
        for (int i = 19; i <= 20; ++i) {

            for (int j = 10; j < 20; ++j) {
                System.out.println(i + "" + j);
            }
        }
    }

}

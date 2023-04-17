package introduction.studendeneme;

public class carpma {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(j + " x " + i + " = " + i * j + "\t\t");
            }
            System.out.println();
        }
    }
}

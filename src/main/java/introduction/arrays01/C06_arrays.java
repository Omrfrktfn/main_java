package introduction.arrays01;

public class C06_arrays {
    public static void main(String[] args) {

        int[] dizi = {1, 2, 3, 4, 5};
        int hedef = 6;
        boolean sonuc = elemanKontrol(dizi, hedef);
        System.out.println(sonuc);

    }
    public static boolean elemanKontrol(int[] dizi, int hedef) {
        for (int eleman : dizi) {
            if (eleman == hedef) {
                return true;
            }
        }
        return false;

    }
}

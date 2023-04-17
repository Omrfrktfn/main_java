package practices.day_02_practice;

public class C04_SwitcCase {
    public static void main(String[] args) {
        /*

            Bir restoranda, müşteriler menüden yemeklerini seçerler.
            Restoran, müşterilerin seçtiği yemeği pişirmek için bir
            program yazilmasini ister. Örneğin, müşteriler menuden hangi yemegi
            secerse  o menunun musteriye hazirlanip sunuldugu ve ucretin
            belirlendigi bir program yaziniz

*/

        /*
        hamburger 200 TL
        pizza 500 TL
        tavuk 711 TL
         */

        String yemek = "pizza";
        switch (yemek) {
            case "hamburger":
                System.out.println("Hamburger Menusu 200 TL");
                break;

            case "pizza":
                System.out.println("Pizza Menusu 500 TL");
                break;

            case "tavuk":
                System.out.println("Tavuk Menusu 200 TL");
                break;
            default:
                System.out.println("Girilen yemek menude yoktur....");

        }

        System.out.println("****************************************");
     /*
Hayvanat bahçesinde ziyaretçilere yemek vermek için bir robot kullanılıyor.
Ziyaretciler hangi hayvani beslemek istiyorsa onun ismini yazsin  ve Robotta
gidip o hayvani beslesin.Örneğin, ziyaretçilerin "fil" hayvanını beslemek
istediklerini söylediklerinde, robot fil hayvanının yanına gider ve
onlara yemek verir.Ziyaretçilerin hangi hayvanları beslemek istediklerini
kontrol eden bir program yaziniz
elephant lion giraffe
 */
    }
}

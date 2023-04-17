package javaders.day38enumsiterators;

public class EnumRunner {
    public static void main(String[] args) {
        String capitalOfIllinois = UsStatesEnum.ILLINOIS.getCapital();
        System.out.println("capitalOfIllinois = " + capitalOfIllinois);

        String abbreviationOfFlorida = UsStatesEnum.FLORIDA.getAbbreviation();
        System.out.println("capitalOfFlorida = " + abbreviationOfFlorida);

        System.out.println(UsStatesEnum.ALASKA);//ne yazilimis ise o data'yi bize veririr.

        String abbreviationOfAlaska = UsStatesEnum.getStateNameByUsingAbbreviation("AK");
        System.out.println("abbreviationOfAlaska = " + abbreviationOfAlaska);
    }
}

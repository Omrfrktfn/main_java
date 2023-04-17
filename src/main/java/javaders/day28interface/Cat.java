package javaders.day28interface;

public class Cat implements Mammal{

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }


    public static void main(String[] args) {
        System.out.println("Animal age : " + Animal.age);
        System.out.println(Mammal.feedBaby);
        //interfaceler'de variable cagiriken interface adini kullanarak cagirin.
        //Bu hem static variable'nin olmanin geregidir hemde okunurlulugu artirir.
        System.out.println("Mammal age : " +Mammal.age);
    }

}

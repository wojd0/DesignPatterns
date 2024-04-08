package creational.prototype;

public class Haribo extends Jelly {
    Haribo(String name, int amountInPack, String[] flavors, int price) {
        this.name = name;
        this.amountInPack = amountInPack;
        this.flavors = flavors;
        this.price = price;
    }

    @Override
    void eat() {
        String eatMessage = String.format("Yum, tasty gummy bears! %s left in the pack", amountInPack--);
        System.out.println(eatMessage);
    }

    @Override
    public Jelly clone() {
        return new Haribo(this.name, this.amountInPack, this.flavors, this.price);
    }
}

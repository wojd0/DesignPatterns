package creational.prototype;

public class JellySnake extends Jelly {

    JellySnake(String name, int amountInPack, String[] flavors, int price) {
        this.name = name;
        this.amountInPack = amountInPack;
        this.flavors = flavors;
        this.price = price;
    }

    @Override
    void eat() {
        if (amountInPack > 0) {
            String eatMessage = String.format("Yum, tasty gummy bears! %s left in the pack", amountInPack--);
            System.out.println(eatMessage);
        } else {
            System.out.println("No snakes left :<");
        }
    }

    @Override
    public Jelly clone() {
        return new JellySnake(name, amountInPack, flavors, price);
    }
}

package creational.prototype;

public abstract class Jelly {
    String name;
    int amountInPack;
    String[] flavors;
    int price;

    abstract void eat();
    public abstract Jelly clone();
}

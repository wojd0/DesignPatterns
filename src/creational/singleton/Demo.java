package creational.singleton;

public class Demo {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.callThem();
        demo.callThemWithPurpose();
    }

    void callThem() {
        CallCenter callCenter = CallCenter.provide();
        System.out.println(callCenter.call());
    }

    void callThemWithPurpose() {
        CallCenter callCenter = CallCenter.provide();
        System.out.println("**ugh**");
        System.out.println(callCenter.call());
        System.out.println(callCenter.call());
        System.out.println(callCenter.call());
        System.out.println(callCenter.call());
    }
}

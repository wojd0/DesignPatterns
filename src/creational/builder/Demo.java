package creational.builder;

public class Demo {
    public Demo() {
        PenBuilder penBuilder = new PenBuilder();
        penBuilder
                .clippable()
                .setColor("red")
                .setMaterial(Material.GOLD);

        Pen builtPen = penBuilder.build();
        System.out.println(builtPen.printDescription());

        PencilBuilder pencilBuilder = new PencilBuilder();
        pencilBuilder
                .clickable()
                .setMaterial(Material.WOOD)
                .setColor("brown");
        Pencil builtPencil = pencilBuilder.build();
        System.out.println(builtPencil.printDescription());
    }
}

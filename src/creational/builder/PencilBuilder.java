package creational.builder;

public class PencilBuilder implements Builder {
    private Pencil pencil = new Pencil();

    public Pencil build() {
        return pencil;
    }

    @Override
    public void reset() {
        pencil = new Pencil();
    }

    @Override
    public Builder setColor(String color) {
        pencil.color = color;
        return this;
    }

    @Override
    public Builder setMaterial(Material material) {
        pencil.material = material;
        return this;
    }

    @Override
    public Builder clickable() {
        pencil.clickable = true;
        return this;
    }

    @Override
    public Builder clippable() {
        pencil.clippable = true;
        return this;
    }
}

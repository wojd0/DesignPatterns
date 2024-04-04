package creational.builder;

public class PenBuilder implements Builder {
    private Pen pen = new Pen();

    public Pen build() {
        return pen;
    }

    @Override
    public void reset() {
        pen = new Pen();
    }

    @Override
    public Builder setColor(String color) {
        pen.color = color;
        return this;
    }

    @Override
    public Builder setMaterial(Material material) {
        pen.material = material;
        return this;
    }

    @Override
    public Builder clickable() {
        pen.clickable = true;
        return this;
    }

    @Override
    public Builder clippable() {
        pen.clippable = true;
        return this;
    }
}

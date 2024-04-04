package creational.builder;

public interface Builder {
    public void reset();
    public Builder setColor(String color);
    public Builder setMaterial(Material material);
    public Builder clickable();
    public Builder clippable();
}

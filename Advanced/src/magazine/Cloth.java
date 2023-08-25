package magazine;

public class Cloth {
    //•	color: String
    //•	size: int
    //•	type: String
    private String color;
    private int size;
    private String type;

    public Cloth(String color, int size, String type) {
        this.color = color;
        this.size = size;
        this.type = type;
    }

    @Override
    public String toString() {
        //"Product: {type} with size {size}, color {color}"
        return String.format("Product: %s with size %d, color %s", type, size, color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

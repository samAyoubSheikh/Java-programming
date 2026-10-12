public interface DrawableInterface {
    void draw();
}
class Rectangle implements DrawableInterface {
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle...");
    }
    }
class Circle implements DrawableInterface {
    @Override
    public void draw() {
        System.out.println("Drawing circle...");
    }
        public static void main(String[] args) {
            // this will print drawing rectangle
            DrawableInterface d = new Rectangle();
            d.draw();
            DrawableInterface d2 = new Circle();
            d2.draw();
        }
    }


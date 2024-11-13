// sdk install java 23.0.1-librca && sdk use java 23.0.1-librca
// java --enable-preview Main.java 
record Point(int x, int y) {}
record Rectangle(int width, int height) {}
record Circle(int radius) {}

void main() {
    var point = new Point(1, 2);
    println(describePoint(point));

    var shape = new Circle(5);
    var area = calculateArea(shape);
    println("Area of the shape: %s !%n".formatted(area));
}

String describePoint(Point point) {
    return switch (point) {
        case Point(int x, int y) when x == 0 && y == 0 -> "Origin";
        case Point(int x, int y) when x == 1 && y == 2 -> "1,2";
        default -> throw new IllegalStateException("Unexpected value: " + point);
    };
}

double calculateArea(Object shape) {
    return switch (shape) {
        case Rectangle(var height, var width) -> height * width;
        case Circle(var radius) -> Math.PI * radius * radius;
        default -> throw new IllegalArgumentException("Unknown shape");
    };
}
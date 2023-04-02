public class Shape {
    public static void main(String[] args) {
        PrintFigure printFigure = new PrintFigure();
        printFigure.printT();
    }
}
class PrintFigure{
    Circle circle = new Circle();
    void printC(){
        System.out.println(circle.getCircle());
    }
    Quad quad = new Quad();
    void printQ(){
        System.out.println(quad.getQuad());
    }
    Square square = new Square();
    void printS(){
        System.out.println(square.getSquare());
    }
    Triange triange = new Triange();
    void printT(){
        System.out.println(triange.getTriange());
    }
    Prism prism = new Prism();
    void printP(){
        System.out.println(prism.getPrism());
    }
}
class Circle extends Shape{
    private String Circle = "Circle";

    public String getCircle() {
        return Circle;
    }
}
class Quad extends Shape{
    private String Quad = "Quad";

    public String getQuad() {
        return Quad;
    }
}
class Square extends Shape{
    private String Square = "Square";

    public String getSquare() {
        return Square;
    }
}
class Triange extends Shape{
    private String Triange = "Triange";

    public String getTriange() {
        return Triange;
    }
}
class Prism extends Shape{
    private String Prism = "Prism";

    public String getPrism() {
        return Prism;
    }
}
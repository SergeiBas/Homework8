package org.ShapeMain;

public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Quad quad = new Quad();
        Square square = new Square();
        Triange triange = new Triange();
        Prism prism = new Prism();
        PrintFigure printFigure = new PrintFigure();
        printFigure.print(circle.getCircle());
    }
}


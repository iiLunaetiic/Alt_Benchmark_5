package QuestionOne.Models;

public class Square extends AbsShape {
    private double length;

    public Square(double l) {
        this.length = l;
        printShapeInfo();
    }

    @Override
    public void printShapeInfo() {
        System.out.println("Area of this Square is " + Math.pow(this.length, 2));
    }
}

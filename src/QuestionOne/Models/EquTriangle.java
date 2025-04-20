package QuestionOne.Models;

public class EquTriangle extends AbsShape {
    private double side;

    public EquTriangle(double s) {
        this.side = s;
        printShapeInfo();
    }

    @Override
    public void printShapeInfo() {
        System.out.println("Area of this Equilateral Triangle is " + (Math.sqrt(3)/4)*Math.pow(this.side, 2));
    }
}

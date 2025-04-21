package QuestionOne.Factories;

import QuestionOne.Models.AbsShape;
import QuestionOne.Models.EquTriangle;

public class EquTriangleFactory implements IShapeFactory {

    @Override
    public AbsShape make(double val) {
        return new EquTriangle(val);
    }
}

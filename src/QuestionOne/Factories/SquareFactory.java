package QuestionOne.Factories;

import QuestionOne.Models.AbsShape;
import QuestionOne.Models.Square;

public class SquareFactory implements IShapeFactory
{
    @Override
    public AbsShape make(double length)
    {
        return new Square(length);
    }
}

package QuestionOne.Factories;

import QuestionOne.Models.AbsShape;

public interface IShapeFactory
{
    public AbsShape make(double length);
}

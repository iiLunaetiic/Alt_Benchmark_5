package QuestionOne.Factories;

import QuestionOne.Models.AbsShape;

public interface IShapeFactory {
    AbsShape make(double val);
}

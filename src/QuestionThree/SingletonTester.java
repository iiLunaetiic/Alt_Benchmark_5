package QuestionThree;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.Assert.*;

public class SingletonTester
{


    @Test(timeout=200)
    public void test_Only_One_Instance_Possible()
    {
        MyOnlyObject obj = MyOnlyObject.getInstance(); //create the first, and only, instance.
        obj.setAmount(10);

        //When using the lazy initialization implementation, the call to getInstance should not call the private constructor again

        MyOnlyObject potentialSecondObj = MyOnlyObject.getInstance();//Try to intentionally cause aliasing

        //when we intentionally use aliasing, it means I should be able to edit the value of obj through the
        //potentialSecondObj pointer... If we actually created a 2nd object, then aliasing didn't occur and we'd get 2
        //different objects with 2 different memory locations and changing the 2nd pointer's value would not change obj's


        potentialSecondObj.setAmount(50);

        if(obj.getAmount() == null)
            fail("You likely didn't correctly implement either the getter or setter for the amount field");
        assertEquals(50, (int) obj.getAmount());
    }

    @Test(timeout=200)
    public void test_Constructor_Private() {
        MyOnlyObject obj = MyOnlyObject.getInstance();

        //use reflection to grab MyOnlyObject's constructors
        Constructor[] cons = obj.getClass().getDeclaredConstructors();
        for(Constructor c : cons)
        {
            if(!Modifier.isPrivate(c.getModifiers()))//if any of the constructors are not private
                fail("Constructor is public, which breaks the purpose of the singleton pattern.");//fail this test
        }
    }


}

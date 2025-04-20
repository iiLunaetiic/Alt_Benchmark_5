Introduction:
    This question will test your ability to learn a new design pattern, in this case, the Singleton Pattern.

    The Singleton Pattern is used for when we only ever want to have a 'single' (hence the name) instance of an object.

    The Singleton Pattern is probably the easiest design pattern to learn, but it's also a very important one. Remember that
    this exam is still open internet, so use some online resources to learn how to implement this design pattern. I don't
    really care which one you use as long as your resource isn't an AI tool that you have do this (or any other) question for
    you.

    The textbook in my syllabus is a good resource and is where the Singleton Design pattern was popularized, but websites
    like GeeksForGeeks and Tutoralspoint are also good resources that explain this pattern in a simple way.

TODO:
    * Your job is to turn MyOnlyObject into an object that you're only allowed to have one instance of.
    * Make sure you follow the TODOs in the MyOnlyObject file.
    * Be sure you pay attention to the variable names it tells you to use or your tests won't pass.

TIP:
    There's another class, called SingletonTester.java that YOU ARE NOT ALLOWED TO EDIT. This test will provide 2 Junit
     tests that you can use to ensure that your implementation of the Singleton Pattern was done correctly.

    There's actually a few different implementations of The Singleton Pattern. The easiest, and the one I expect you to
    use, is what is known as the "Lazy initialization" implementation. In this implementation, you wait until the static method
    used for accessing the instance of the object is called(getInstance() in this case) to initialize the instance of the object.

    There's a few other implementations that are used for preventing the use of multithreading for creating multiple
    instances of the singleton object. Multithreading is nowhere near within the scope of this course, so don't
    implement that version.
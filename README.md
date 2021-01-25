# Builder_pattern
Similarly, when we have a model class and that class is having a number of parameter out of which some are important and some are not important then
we can use the Builder pattern. By using the Builder pattern, the user need not call all the methods(as in the case of constructors) present in the class.
The user can call only the required methods and even the order of calling of the method is
not fixed i.e you can call any method before and after any method. There is no need for new keyword here(for java). Let's understand this with the help of an example.

in example 1 : have to pass the processor because this is a necessary component and rest are optional. Here, we are not passing the screen size, so the default value of the screen size will be used

in example 2 : have to pass the user_name because this is a mandatory component and rest are optional.

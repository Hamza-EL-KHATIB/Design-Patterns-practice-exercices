## Creational Patterns:

- #### Singleton: Create a Logger class that ensures only one instance of the logger exists.
```java
/**
 * Logger class implementing the Singleton design pattern.
 * This class ensures that only one instance of Logger is created throughout the application.
 */
public class Logger {

    // The single instance of Logger that will be used throughout the application.
    private static Logger logger;

    // Private constructor to prevent instantiation of the Logger class from outside the class.
    private Logger() {
    }

    /**
     * Method to get the single instance of Logger.
     * If the instance does not exist, it is created.
     * @return the single instance of Logger.
     */
    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
```
- #### Factory Method: Create a ShapeFactory that generates different types of Shape objects (like Circle, Rectangle, Square) based on the input it receives.
- #### Abstract Factory: Extend the previous exercise to have an AbstractFactory that produces ShapeFactory and ColorFactory. The ColorFactory should be able to produce different Color objects.
- #### Builder: Design a PizzaBuilder where you can customize a Pizza object step by step, choosing the type of crust, toppings, size, etc.
- #### Prototype: Implement a Cell class that can replicate itself.

## Structural Patterns:

- #### Adapter: Create a MediaPlayer interface and a MediaAdapter class to play different types of audio formats.
- #### Bridge: Design a Shape abstraction and several Shape implementations like Circle, Square. Also create a Color interface and several Color implementations like Red, Blue. The Shape class uses the Color interface to fill itself with color.
- #### Composite: Implement an Employee class, where an employee can have a list of other employees reporting to them.
- #### Decorator: Create a Coffee interface and use decorator pattern to add different types of toppings.
- #### Facade: Create a Computer class that has a start() method, which internally calls methods from CPU, Memory, and HardDrive.

## Behavioral Patterns:

- #### Observer: Implement a WeatherStation that notifies WeatherDisplay objects whenever it updates its measurements.
- #### State: Design a TrafficLight that changes its State from Red to Green to Yellow.
- #### Strategy: Implement a ShoppingCart where the payment strategy (CreditCard, Paypal) can be chosen at runtime.
- #### Template Method: Create an Algorithm abstract class with a template method solveProblem(), and let ConcreteAlgorithmA and ConcreteAlgorithmB classes implement this method.
- #### Visitor: Implement Book, CD and DVD classes. They can accept a Visitor like ShippingVisitor which calculates the shipping cost for the items.
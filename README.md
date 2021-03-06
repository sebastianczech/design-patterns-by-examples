# Design Patterns by examples

[![BCH compliance](https://bettercodehub.com/edge/badge/sebastianczech/design-patterns-by-examples?branch=master)](https://bettercodehub.com/)

Examples of my code for selected design patterns 
described in [Source Making](https://sourcemaking.com/design_patterns) 
and [Refactoring Guru](https://refactoring.guru/design-patterns).

## Creational patterns

* [Abstract Factory](design-patterns-creational/src/test/java/com/sebastianczech/AbstractFactoryTest.java) - Creates an instance of several families of classes
* [Builder](design-patterns-creational/src/test/java/com/sebastianczech/BuilderTest.java) - Separates object construction from its representation
* [Factory Method](design-patterns-creational/src/test/java/com/sebastianczech/FactoryMethodTest.java) - Creates an instance of several derived classes
* Object Pool - Avoid expensive acquisition and release of resources by recycling objects that are no longer in use
* Prototype - A fully initialized instance to be copied or cloned
* [Singleton](design-patterns-creational/src/test/java/com/sebastianczech/SingletonTest.java) - A class of which only a single instance can exist

## Structural patterns

* [Adapter](design-patterns-structural/src/test/java/com/sebastianczech/AdapterTest.java) - Match interfaces of different classes
* Bridge - Separates an object's interface from its implementation
* Composite - A tree structure of simple and composite objects
* [Decorator](design-patterns-structural/src/test/java/com/sebastianczech/DecoratorTest.java) - Add responsibilities to objects dynamically
* Facade - A single class that represents an entire subsystem
* Flyweight - A fine-grained instance used for efficient sharing
* Private Class Data - Restricts accessor/mutator access
* [Proxy](design-patterns-structural/src/test/java/com/sebastianczech/ProxyTest.java) - An object representing another object

## Behavioral patterns

* Chain of responsibility - A way of passing a request between a chain of objects
* Command - Encapsulate a command request as an object
* Interpreter - A way to include language elements in a program
* Iterator - Sequentially access the elements of a collection
* Mediator - Defines simplified communication between classes
* Memento - Capture and restore an object's internal state
* [Null Object](design-patterns-behavioral/src/test/java/com/sebastianczech/NullObjectTest.java) - Designed to act as a default value of an object
* Observer - A way of notifying change to a number of classes
* State - Alter an object's behavior when its state changes
* [Strategy](design-patterns-behavioral/src/test/java/com/sebastianczech/StrategyTest.java) - Encapsulates an algorithm inside a class
* Template method - Defer the exact steps of an algorithm to a subclass
* Visitor - Defines a new operation to a class without change
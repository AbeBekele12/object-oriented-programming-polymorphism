
# Object-Oriented Programming: Polymorphism

This project demonstrates the concept of polymorphism in object-oriented programming using Java. Polymorphism is the ability of an object to take on different forms depending on the context. In this project, I have created a superclass called Animal and three subclasses: Dog, Cat, and Bird. Each subclass overrides the methods of the superclass to perform different actions, such as making sounds, moving, and eating.

## Installation and Usage

To run this project, you need to have Java installed on your system. You can download and install Java from [here].

To compile and run the project, follow these steps:

- Clone or download this repository to your local machine.
- Open a terminal or command prompt and navigate to the project directory.
- Compile the project using the command `javac Polymorphism.java`.
- Run the project using the command `java Polymorphism`.

You should see the output of the project in the terminal or command prompt, showing the different behaviors of the animals.


## Documentation

This project uses the concept of polymorphism to show how different objects can share the same interface but have different implementations. Polymorphism can be achieved in two ways: by using inheritance or by using interfaces.

In this project, I have used inheritance to create a hierarchy of classes that inherit from a common superclass. The superclass is called Animal and it defines some abstract methods that all animals have, such as makeSound, move, and eat. The subclasses are Dog, Cat, and Bird, and they override the methods of the superclass to provide their own specific behaviors.

For example, the makeSound method of the Animal class is abstract and has no body. The subclasses implement this method according to their own sounds. The Dog class makes a "woof" sound, the Cat class makes a "meow" sound, and the Bird class makes a "tweet" sound.

The Polymorphism class is the main class that creates and tests the objects of the subclasses. It creates an array of Animal objects and assigns them different instances of the subclasses. Then, it loops through the array and calls the methods of each object. The output shows the polymorphism in action, as each object performs the same method but with different results.



Here is a sample output of the project:

```
Animal at index 0 makes a sound
Woof
Animal at index 0 moves
Dog runs
Animal at index 0 eats
Dog eats meat

Animal at index 1 makes a sound
Meow
Animal at index 1 moves
Cat walks
Animal at index 1 eats
Cat eats fish

Animal at index 2 makes a sound
Tweet
Animal at index 2 moves
Bird flies
Animal at index 2 eats
Bird eats seeds
```

For more information about polymorphism and object-oriented programming, you can check out these resources:

- [Polymorphism in Java]
- [Object-Oriented Programming Concepts]
- [Java Tutorial: Inheritance and Polymorphism]









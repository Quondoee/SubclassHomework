# Chapter 2 , 3 and 4 Notes


* Class , Method , Object and Instance variable
  
* Declaring a varibale means variable must have a name and a type
- EX: Car mycar(name) = new Car or (data type)int count(name)
  
*  You can assign the value of a variable in one of several ways
  - type a literal value after the equals sign ( int x = 12 or like boolean isGood = true)
  - assign the value of one variable to another ( x = y )
  - use an expression combining the two ( x = y +43 )

# OBJECTS

* there is no such thing as an object variable
* there is only an object REFERENCE variable
* An object REFERENCE variable holds bits that represent a way to access an object
* An object reference is just another variable value.

# Primitive and Reference variables

* Primitive variables EX: byte x = 7
* Reference variables EX: Dog myDog = ne Dog();
  - Dog myDog declares the reference variable
  - new Dog creates the object
  - and the equals sign " = " link the object and the reference

  # Creating arrays for objects
  - Declare the array with object name EX: Dog [] pets; , pets = name of array
  - Create a new dog array with a length of 7 EX: pets = new Dog[7];
  - create new Dog objects and assign them to the array
  - EX: pets[0] = new Dog();
        pets[1] = new Dog();
         and etc
  - You can access the DOGs instance variable within the array as such wit the index position in the array:
  - EX: Dog[0] myDogs = new Dog[2];
        myDogs [0] = new Dog ();
        myDogs[0] .name = "Fido";
        myDogs[0] .bark();

  # How objects behave
  * state affects behavior , behavior affects state.
  * Objects have state ands behavior , represented by instance variables and methods.
  



   

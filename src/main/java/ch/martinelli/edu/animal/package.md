```mermaid
classDiagram
direction BT
class Animal
class Capricorn
class Cat
class Dog
class Pet
class WildAnimal

Capricorn  -->  Pet 
Cat  -->  Pet 
Dog  -->  Pet 
Pet  -->  Animal 
WildAnimal  -->  Animal 
```
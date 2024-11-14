package ch.martinelli.edu.animal;

public abstract sealed class Pet extends Animal
permits Cat, Dog{
}

package ch.martinelli.edu;

import ch.martinelli.edu.animal.Cat;
import ch.martinelli.edu.animal.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PatternMatchingTest {

    /**
     * Exercise 1: Remove unnecessary casts
     */
    @Test
    public void instanceOf() {
        Object obj = new Dog();

        if (obj instanceof Dog dog) {
            assertEquals("Wuff", dog.bark());
            System.out.println(dog.bark());
        } else if (obj instanceof Cat cat) {
            assertEquals("Miau", cat.meow());
        }
    }

    /**
     * Exercise 2: Replace the if statement with a switch expression
     */
    @Test
    void patternMatching() {
        assertEquals("null", getType(null));
        assertEquals("String is Hello", getType("Hello"));
        assertEquals("else", getType(Integer.valueOf("1")));
    }

    private String getType(Object object) {
        if (object == null) {
            return "null";
        } else if (object instanceof String value) {
            return "String is " + value;
        } else {
            return "else";
        }
    }
}

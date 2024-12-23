package ch.martinelli.edu;

import ch.martinelli.edu.animal.Capricorn;
import ch.martinelli.edu.animal.Pet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SealedClassesTest {

    /**
     * Exercise: A capricorn (Steinbock) is not a pet!
     * Seal the class pet and only allow cats and dogs.
     * Fix the assertion.
     */
    @Test
    void noPet() {
        Capricorn capricorn = new Capricorn();

        assertTrue(capricorn instanceof Pet);
    }

    /**
     * Exercise:
     * Seal all classes and add the correct permitted subclasses.
     * Add and UnknownAnimal class that permits any subclass.
     */
    @Test
    void unknownAnimal() {

    }

    /**
     * Exercise: Use a switch expression and test exhaustiveness
     */
    @Test
    void switchExhaustiveness() {
    }

}

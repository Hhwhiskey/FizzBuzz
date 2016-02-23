package Test;

import com.kevinhodges.FizzBuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Return “fizz”, “buzz” or “fizzbuzz”.
 * <p>
 * For a given natural number greater than zero return:
 * <p>
 * “fizz” if the number is dividable by 3
 * “buzz” if the number is dividable by 5
 * “fizzbuzz” if the number is dividable by 15
 * the same number if no other requirement is fulfilled
 */


public class FizzBuzzTest {

    private FizzBuzz fizzbuzz;

    @Before
    public void setUp() {
        fizzbuzz = new FizzBuzz();
    }

    @Test
    public void oneReturns1() {
        //Arrange

        //Act
        String result = fizzbuzz.fizzBuzz(1);

        //Assert
        assertEquals("1", result);
    }

    @Test
    public void intReturnsIntString() {
        //Arrange

        //Act
        String result = fizzbuzz.fizzBuzz(2);

        //Assert
        assertEquals("2", result);
    }

    @Test
    public void int3ReturnsFizz() {
        //Arrange

        //Act
        String result = fizzbuzz.fizzBuzz(3);

        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void intDivisibleBy3ReturnsFizz() {
        //Arrange

        //Act
        String result = fizzbuzz.fizzBuzz(6);

        //Assert
        assertEquals("Fizz", result);
    }

    @Test
    public void intDivisibleBy5ReturnsBuzz(){
      //Arrange

      //Act
      String result = fizzbuzz.fizzBuzz(10);

      //Assert
      assertEquals("Buzz", result);
    }

    @Test
    public void intDivisibleBy15ReturnsFizzBuzz(){
      //Arrange

      //Act
      String result = fizzbuzz.fizzBuzz(15);

      //Assert
      assertEquals("FizzBuzz", result);
    }
}

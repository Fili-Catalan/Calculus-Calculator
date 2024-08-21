/**
 * This is an interface to be implemented by the CalculusCalculator classes.
 *
 * Since the bright possibility is that we're going to have more than one form
 * of calculus to compute, it makes sense to generalize this kind of calculator
 * for organizations sake.
 *
 * Every calculus calculator that we create must have the following:
 *   1)  A compute/execute function to actually carry out the
 *       computation of the equation we're dealing with.
 *   2)  A parser to translate the equation into something that the program
 *       can understand and derive steps for computation and execution.
 *       
 * That's it for now.
 * 
 */
public interface CalculatorInterface
{
    /**
     * This is in charge of taking in the user's input.
     */
    public void read();

    /**
     * This is to parse the user input from a String into something that
     * translates to a mathematical expression that the program can understand
     * and eventually compute.
     */
    public void parse(String expression);

    /**
     * This takes the mathematical expression derived from the String and performs
     * the computation.
     */
    public void execute();
}
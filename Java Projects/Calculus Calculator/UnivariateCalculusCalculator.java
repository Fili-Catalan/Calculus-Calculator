/**
 * The purpose of this class is to symbolically solve any sort of Calculus problem by reading in
 * a calculus problem in the form of a String and return the solution either as a symbolic equation
 * or a value, depending on the inputs.
 * 
 * This calculator will perform simple mathematics like addition, subtraction, multiplication and division.
 * It will also perform derivative and integral Calculus. For now, this Calculus Calculator will focus on
 * these two broadly defined concepts of Calculus. 
 * 
 * You will be able to differentiate equations, ranging from simple algebraic equations to complex
 * trigonometric equations. You will also be able to take the integral of the same variety of
 * equations.
 * 
 * Description
 * -----------
 * This calculator assumes the following:
 *      1)  The input is a String that makes symbolic mathematical sense. This means that there are rules
 *          that must be followed in terms of what qualifies as a function that can be calculated using
 *          Calculus in a symblic context. Here are some of the rules:
 *              a)  There cannot be any more than one space between any character in the equation.
 *              b)  The operations defined within the equation, whether it be multiplication, addition,
 *                  subtraction, or division must adhere to the symbolic dictionary defined for each of
 *                  these operations. The dictionary consists of the following:
 *                      *) '+' : addition
 *                      *) '-' : subtraction
 *                      *) '*' : multiplication
 *                      *) '/' : division
 *                      *) 'derivative' : derivative
 *                      *) 'integral' : integral
 *              c)  Since this calculator is going to be solving problems at the univariate level, the
 *                  only variables that we're going to be dealing with are 'x' for the domain variables
 *                  and a choice between 'y' or 'f(x)' for the range variable (i.e. the variable of the
 *                  equation).
 *                  An example of this is the following:
 *                      f(x) = x + 1
 *                          or
 *                      y = x + 1
 *                  Either of these equations will work for the calculator.
 *              d)  There can be an instance of more than one 'x' in the equations. Here is an example of 
 *                  this:
 *                      f(x) = x^2 + x + 1
 *                              or
 *                      y = x^2 + x + 1
 *              e)  Any other variable that shows up within the equation is going to be considered as a
 *                  constant. For example:
 *                      f(x) = x^2 + ax + c has 'a' and 'c' as part of the 
 *                      equation. In this case, 'x' is your variable and any
 *                      differentiation or integration will be based around 'x'.
 *                      'a' and 'c' will be considered constants and will be
 *                      treated as such in any differentiation and integration
 *                      that occurs.
 * 
 *      2)  As of right now, there will not be any sort of multivariate
 *          calculus at user's disposal. This will be a univariate
 *          calculus calculator for the time being. As we introduce more
 *          rules into the program, we will lay out the foundations of
 *          multivariable calculus.
 * 
 *      3)  There are going to be underlying rules that will handle the how the
 *          integration and differentiation is performed. We need to
 *          compartmentalize these procedures to make debugging easy for us. Trying
 *          to debug a class thats 5000 lines long sucks.
 */

public class UnivariateCalculusCalculator {

    public UnivariateCalculusCalculator()
    {
        System.out.println("Starting calculator");
    }
    
}

/**
 * Leeds University coursework example Unit 4 (year 2000)
 * 
 * @author Mike Hewitt 
 * @version 06 September 2016
 */
public class Problem2
{
    /**
     * Main method 
     * 
     * @param args command line input parameters 
     */
    public static void main(String[] args)
    {
        DivisionProblem divProbObj = new DivisionProblem();
        divProbObj.divide();        //notice class.method 
    }
}
/**
 * Generate an exception 
 * 
 */
class DivisionProblem
{
    private int num1i = 10;
    private int num2i = 0;
/**
 * handle Arithmetic Exception
 * 
 */
    public void divide()
    {
        try
        {
            System.out.println("10 / 0 = " + (num1i / num2i));
        }
        catch (ArithmeticException ae)
        {
            System.out.println("Dealt with " + ae);
            System.out.println("Carrying on...");
        }

        System.out.println("Finished");
    }
}

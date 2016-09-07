import java.io.*;
/**
 * Leeds University coursework example Unit 4 (year 2000)
 * @author Mike Hewitt 
 * @version 06 September 2016
 */
public class Squares1
{
    /**
     * Main method 
     * @param args command line input parameters 
     * @throws Exception some description here
     */
    public static void main(String[] args) throws Exception 
    {
        ReadNumberWriteSqu rnws = new ReadNumberWriteSqu();
        rnws.readNumber();
        rnws.writeSquare();
    }
}
/**
 * 
 */
class ReadNumberWriteSqu
{
    private int numi;
    public ReadNumberWriteSqu()     //constructor
    {
    }

    /**
     * Handle Exception
     */
    public void readNumber() throws Exception
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader( isr );
        try
        {
            String s = br.readLine();
            numi = Integer.parseInt(s);
        }
        catch (Exception e)
        {
            System.out.println("Invalid input");
        }
    }

    /**
     * 
     */
    public void writeSquare()
    {
        System.out.println(numi * numi);
    }

}

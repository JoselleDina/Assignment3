package ac.za.cput.adp3;

import ac.za.cput.adp3.domaine.Employee;
import ac.za.cput.adp3.domaine.MyInterface;
import ac.za.cput.adp3.domaine.Programmer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MyInterface myInterface= new Employee();
        System.out.println(myInterface.Salary());


    }
}

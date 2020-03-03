package ac.za.cput.adp3.domaine;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerTesta {

    private Employee employee;
    private Programmer programmer;
    @Before
    public void setUp() throws Exception {
        employee=new Employee(32434,"Joselle","Dinana");
        programmer=new Programmer(employee,"java");
    }

    @Test
    public void testObject() {
        Assert.assertEquals(programmer.getEmp(),employee);
    }

    @Test
    public void TestSalary() {
        double sal=100000;
//        System.out.print(programmer.toString());
        Assert.assertEquals(programmer.ProgrammerSalary(), sal, 1);
    }

    @Test
    public void testOjects() {
        Assert.assertNotEquals(programmer.getEmp(),programmer.toString());
    }

}
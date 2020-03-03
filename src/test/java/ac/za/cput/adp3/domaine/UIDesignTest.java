package ac.za.cput.adp3.domaine;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UIDesignTest {
    Employee employee;
    UIDesign designer;

    @Before
    public void setUp() throws Exception {
        employee= new Employee(22155, "Nelcia", "Niangui");
        designer= new UIDesign(employee, "Adobe Illustrator");
    }
    @Test
    public void testObject() {
        Assert.assertEquals(designer.getEmp(),employee);
    }
    @Test
    public void TestSalary() {
        double sal=150000;
//        System.out.print(programmer.toString());
        Assert.assertEquals(designer.UIDesignSalary(), sal, 1);
    }

    @Test
    public void testOjects() {
        Assert.assertNotEquals(designer.getEmp(),designer.toString());
    }
}
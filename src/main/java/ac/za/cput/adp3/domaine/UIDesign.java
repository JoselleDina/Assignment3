package ac.za.cput.adp3.domaine;

public class UIDesign {
    private Employee emp;
    private String tool;

    public UIDesign(Employee emp, String tool) {
        this.emp = emp;
        this.tool = tool;
    }

    public Employee getEmp() {
        return emp;
    }

    public String getTool() {
        return tool;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    @Override
    public String toString() {
        return "UIDesign{" +
                "emp=" + emp +
                ", tool='" + tool + '\'' +
                '}';
    }
    public double UIDesignSalary(){
        double uiDesignSalary;
        return uiDesignSalary = emp.Salary() * 3;
    }
}

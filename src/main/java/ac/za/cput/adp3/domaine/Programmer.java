package ac.za.cput.adp3.domaine;

public class Programmer {
   private Employee emp;
   private String laguage;

    public Programmer(Employee emp, String laguage) {
        this.emp = emp;
        this.laguage = laguage;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public String getLaguage() {
        return laguage;
    }

    public void setLaguage(String laguage) {
        this.laguage = laguage;
    }
    public double ProgrammerSalary(){
         double programmerSalary;
       return programmerSalary = emp.Salary() * 2;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "emp=" + emp.toString() +
                ", laguage='" + laguage + '\'' +"Salary:"+ ProgrammerSalary()+
                '}';
    }

}
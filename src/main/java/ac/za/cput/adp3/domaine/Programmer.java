package ac.za.cput.adp3.domaine;

public class Programmer {
   private Employee emp;
   private String language;

    public Programmer(Employee emp, String laguage) {
        this.emp = emp;
        this.language = laguage;
    }

    public Employee getEmp() {
        return emp;
    }

    public void setEmp(Employee emp) {
        this.emp = emp;
    }

    public String getLaguage() {
        return language;
    }

    public void setLaguage(String laguage) {
        this.language = laguage;
    }
    public double ProgrammerSalary(){
         double programmerSalary;
       return programmerSalary = emp.Salary() * 2;
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "emp=" + emp.toString() +
                ", laguage='" + language + '\'' +"Salary:"+ ProgrammerSalary()+
                '}';
    }

}
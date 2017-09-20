public class Company {
    private String compName;
    private int numEmployees;

   public Company(String compName, int numEmployees)
   {
       this.compName = compName;
       this.numEmployees = numEmployees;
   }

   public void setCompName(String compName)
   {
       this.compName = compName;
   }
   public void setNumEmployees(int numEmployees)
   {
       this.numEmployees = numEmployees;
   }

    public String getCompName() {
        return compName;
    }

    public int getNumEmployees() {
        return numEmployees;
    }
}

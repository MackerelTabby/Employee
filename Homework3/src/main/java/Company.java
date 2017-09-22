public class Company {
    private String compName;
    private int numEmployees;

    public Company(final String compName, final int numEmployees) {
        this.compName = compName;
        this.numEmployees = numEmployees;
    }

    public void setCompName(String compName) {
        this.compName = compName;
    }

    public void setNumEmployees(int numEmployees) {
        this.numEmployees = numEmployees;
    }

    public String getCompName() {
        return compName;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    @Override
    public boolean equals(final Object obj) {
        boolean result = false;
        if (obj != null && obj instanceof Company) {
            final Company c = (Company) obj;
            result = (compName.equals(c.getCompName()) && numEmployees == c.getNumEmployees());
        }
        return result;
    }
}

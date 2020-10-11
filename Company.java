public class Company {
    private String name;
    private Employee employee;
    private Location location;
    private int numEmployees;
    private String companyType;
    private int totalTurnOver;
    private String[] founders;

    public Company(String name, Employee employee, Location location, int numEmployees, String companyType, int totalTurnOver, String[] founders) {
        this.name = name;
        this.employee = employee;
        this.location = location;
        this.numEmployees = numEmployees;
        this.companyType = companyType;
        this.totalTurnOver = totalTurnOver;
        this.founders = founders;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Location getLocation() {
        return location;
    }

    public int getNumEmployees() {
        return numEmployees;
    }

    public String getCompanyType() {
        return companyType;
    }

    public int getTotalTurnOver() {
        return totalTurnOver;
    }

    public String[] getFounders() {
        return founders;
    }
}

public class Employee {
    private int empId;
    private String empName;
    private String role;
    private int yearsOfExperience;
    //private Document document;
    private Location contactAddress;
    //private Phone callDetails;

    public Employee(int empId, String empName, String role, int yearsOfExperience,Location contactAddress) {
        this.empId = empId;
        this.empName = empName;
        this.role = role;
        this.yearsOfExperience = yearsOfExperience;
       // this.document = document;
        this.contactAddress = contactAddress;
        //this.callDetails = callDetails;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getRole() {
        return role;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

//    public Document getDocument() {
//        return document;
//    }

    public Location getContactAddress() {
        return contactAddress;
    }

//    public Phone getCallDetails() {
//        return callDetails;
//    }
}

package baiCuoi;


public interface EmployeeManager {
	void addEmployee(Employee e);
    void editEmployee(Employee e);
    void searchEmployee(String fullname);
    void setTotalSalary();
}

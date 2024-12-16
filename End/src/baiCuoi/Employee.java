package baiCuoi;

public class Employee extends User{
	private int employee_basic_salary;
	private String employee_department;
	public Employee(int user_id, String user_name, String user_fullname, double user_cosalary,
			int employee_basic_salary, String employee_department) {
		super(user_id, user_name, user_fullname, user_cosalary);
		this.employee_basic_salary = employee_basic_salary;
		this.employee_department = employee_department;
	}
	public int getEmployee_basic_salary() {
		return employee_basic_salary;
	}
	public String getEmployee_department() {
		return employee_department;
	}
	public void setEmployee_basic_salary(int employee_basic_salary) {
		this.employee_basic_salary = employee_basic_salary;
	}
	public void setEmployee_department(String employee_department) {
		this.employee_department = employee_department;
	}
	
	public double getSalary() {
		double heSoLuong = 1.0;
		if (employee_department.equals("Nhân sự")) {
			heSoLuong = 1.0;
		}else if (employee_department.equals("Kinh doanh")) {
			heSoLuong = 1.1;
		}else if (employee_department.equals("Công nghệ")) {
			heSoLuong = 1.15;
		}else if (employee_department.equals("Quản trị")) {
			heSoLuong = 1.2;
		}
		return employee_basic_salary * heSoLuong;
	}
	@Override
	public String toString() {
		return super.toString() + ",Basic Salary; " + employee_basic_salary +
                ", Department: " + employee_department + ", Total Salary: " + getSalary();
	}
}

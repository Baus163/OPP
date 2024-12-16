package baiCuoi;

public class Test {
	public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(1, "user01", "Nguyen Van A", 2.0, 5000, "Nhân sự");
            Employee emp2 = new Employee(2, "user02", "Tran Thi B", 2.5, 6000, "Công nghệ");

            System.out.println(emp1);
            System.out.println(emp2);
        }
        catch (Exception e) {
            System.out.println("Lỗi xảy ra: " + e.getMessage());
        }
    }
}
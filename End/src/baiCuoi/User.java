package baiCuoi;

public abstract class User {
	private int user_id;
	private String user_name;
	private String user_fullname;
	private double user_cosalary;
	
	public User(int user_id, String user_name, String user_fullname, double user_cosalary) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_fullname = user_fullname;
		this.user_cosalary = user_cosalary;
	}

	public int getUser_id() {
		return user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public String getUser_fullname() {
		return user_fullname;
	}

	public double getUser_cosalary() {
		return user_cosalary;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public void setUser_fullname(String user_fullname) {
		this.user_fullname = user_fullname;
	}

	public void setUser_cosalary(double user_cosalary) {
		this.user_cosalary = user_cosalary;
	}
	
	public abstract double getSalary();

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", user_fullname=" + user_fullname
				+ ", user_cosalary=" + user_cosalary + "]";
	}

	
}

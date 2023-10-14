package oop;

class Employee {
	
	 private int eid;
	 private String name;
	 private int age ;
	 private String department;
	 private String address;
	
	 
	public int getEid() {
		return eid;
	}



	public void setEid(int eid) {
		this.eid = eid;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEid(123);
		
		e.setName("Divya");
		
		System.out.println(e.getEid());
		System.out.println(e.getName());
		
	}
	

}

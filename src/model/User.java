package model;

public class User {

	private String name;
	private String age;
	private String number;
	private String blood;
	private String sex;
	
	
	
	public User(String name, String age, String number, String blood, String sex) {
		
		this.name = name;
		this.age = age;
		this.number = number;
		this.blood = blood;
		this.sex = sex;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	
	
	
	
	
}

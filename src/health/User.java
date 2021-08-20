package health;
import java.util.ArrayList;

public class User {
	String userid;
	String userpw;
	String name;
	int height;
	int weight;
	int BMI;
	int fat;
	int muscle;
	
	public User() {
		
	}
	public User(String id, String pw) {
		userid = id;
		userpw = pw;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	void setHeight(int height) {
		this.height = height;
	}
	
	void setWeight(int weight) {
		this.weight = weight;
	}
	
	void setBMI(int bmi) {
		this.BMI = bmi;
	}
	
	void setFat(int fat) {
		this.fat = fat;
	}
	
	void setMuscle(int muscle) {
		this.muscle = muscle;
	}
	String getId() {
		return userid;
	}
	
	String getPw() {
		return userpw;
	}
	String getName() {
		return name;
	}
	int getHeight() {
		return height;
	}
	int getWeight() {
		return weight;
	}
	int getBMI() {
		return BMI;
	}
	int getFat() {
		return fat;
	}
	int getMuscle() {
		return muscle;
	}
	void showUser() {
		System.out.println("id : " + userid);
		System.out.println("pw : " + userpw);
	}
	
}

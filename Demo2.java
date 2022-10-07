package cyj5;

import java.util.Scanner;

class Student{
	int code,phone;
	String name,sex,major;
	private Scanner in;
	Student() {
		code=202110088;
		phone=1234567;
		name="小红";
		sex="女";
		major="计科";
	}
	 Student(int code1,int phone1,String name1,String sex1,String major1){
		code=code1;
		phone=phone1;
		name=name1;
		sex=sex1;
		major=major1;
	}
	void showStudent(){
		System.out.println("学号："+code);
		System.out.println("姓名："+name);		
		System.out.println("性别："+sex);
		System.out.println("所在专业："+major);
		System.out.println("联系电话："+phone);
	}
	int setPhone() {
		System.out.println("请输入你所要修改的电话");
	    in = new Scanner(System.in);
			int phone2= in.nextInt();
			System.out.println("修改的电话为："+phone2);
			return phone2;
			}
}
public class Demo2 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(202110086,19203853,"小明","男","计科");
		s1.showStudent();
		s1.setPhone();
		System.out.println();
		s2.showStudent();
		s2.setPhone();
	}

}

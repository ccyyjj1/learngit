package cyj5;

import java.util.Scanner;

class Student{
	int code,phone;
	String name,sex,major;
	private Scanner in;
	Student() {
		code=202110088;
		phone=1234567;
		name="С��";
		sex="Ů";
		major="�ƿ�";
	}
	 Student(int code1,int phone1,String name1,String sex1,String major1){
		code=code1;
		phone=phone1;
		name=name1;
		sex=sex1;
		major=major1;
	}
	void showStudent(){
		System.out.println("ѧ�ţ�"+code);
		System.out.println("������"+name);		
		System.out.println("�Ա�"+sex);
		System.out.println("����רҵ��"+major);
		System.out.println("��ϵ�绰��"+phone);
	}
	int setPhone() {
		System.out.println("����������Ҫ�޸ĵĵ绰");
	    in = new Scanner(System.in);
			int phone2= in.nextInt();
			System.out.println("�޸ĵĵ绰Ϊ��"+phone2);
			return phone2;
			}
}
public class Demo2 {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(202110086,19203853,"С��","��","�ƿ�");
		s1.showStudent();
		s1.setPhone();
		System.out.println();
		s2.showStudent();
		s2.setPhone();
	}

}

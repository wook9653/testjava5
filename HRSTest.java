package com.tech2.poly;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}
public void calcBonus() {
	System.out.println("Salesman 보너스 = 기본급 *12*4");
}
}
class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}
	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급*12*2");
	}
}
abstract class Manager extends Employee{
	
	public void calcSalary() {
		System.out.println("Manger 급여= 기본급+ 팀 성과 수당");
	
	}
}
class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director 보너스 =기본급*12*6");
	}
}
public class HRSTest {
	
	public static void calTax(Employee s) {
		
		System.out.println("Saleman 비교 : "+(s instanceof Salesman));
		if (s instanceof Salesman) {
			System.out.println("Salesman입니다");
		}else if (s instanceof Manager) {
			System.out.println("Salesman입니다");
			
		}else if (s instanceof Consultant) {
			System.out.println("Salesman입니다");
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Salesman s = new Salesman();
		Consultant c= new Consultant();
		Director d = new Director();
		
		Object arr[]=new Object[3];
		
		arr[0]=s;
		arr[1]=c;
		arr[2]=d;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

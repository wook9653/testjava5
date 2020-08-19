package com.tech2.poly;

abstract class Employee{
	String name;
	int salary;
	
	public abstract void calcSalary();
	public abstract void calcBonus();
}

class Salesman extends Employee{
	public void calcSalary() {
		
		System.out.println("Salesman �޿� = �⺻�� + �Ǹ� ����");
	}
public void calcBonus() {
	System.out.println("Salesman ���ʽ� = �⺻�� *12*4");
}
}
class Consultant extends Employee{
	public void calcSalary() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}
	public void calcBonus() {
		System.out.println("Consultant ���ʽ� = �⺻��*12*2");
	}
}
abstract class Manager extends Employee{
	
	public void calcSalary() {
		System.out.println("Manger �޿�= �⺻��+ �� ���� ����");
	
	}
}
class Director extends Manager {
	public void calcBonus() {
		System.out.println("Director ���ʽ� =�⺻��*12*6");
	}
}
public class HRSTest {
	
	public static void calTax(Employee s) {
		
		System.out.println("Saleman �� : "+(s instanceof Salesman));
		if (s instanceof Salesman) {
			System.out.println("Salesman�Դϴ�");
		}else if (s instanceof Manager) {
			System.out.println("Salesman�Դϴ�");
			
		}else if (s instanceof Consultant) {
			System.out.println("Salesman�Դϴ�");
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

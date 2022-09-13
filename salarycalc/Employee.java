package salarycalc;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}
	
	public double tax(double salary) {
		if(salary < 1000) return 0;
		else return salary*0.03;
	}
	
	public int bonus(int hour) {
		if(hour > 40) return (hour - 40)*30;
		else return 0;
	}
	
	public double raiseSalary(int hireYear) {
		int workingtime = 2021 - hireYear;
		if(workingtime < 10 ) return this.salary*0.05;
		else if(workingtime > 9 && workingtime < 20) return this.salary*0.1;
		else return this.salary*0.15;
	}

	@Override
	public String toString() {
		return "Adı : "+this.name+"\nMaaşı : "+this.salary+"\nÇalışma Saati : "+this.workHours+"\nBaşlangıç Yılı : "+this.hireYear+"\nVergi : "+tax(salary)+
				"\nBonus : "+bonus(this.workHours)+"\nMaaş Artışı : "+raiseSalary(this.hireYear)+
				"\nVergi ve Bonuslar ile birlikte maaş : "+(salary+bonus(this.workHours)-tax(salary))+
				"\nToplam Maaş : "+(salary+raiseSalary(this.hireYear));
	}
	
	
	
	
	

}

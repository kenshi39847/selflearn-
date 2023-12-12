package to.msn.wings.selflearn.chap07.constructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Person {
	/*
	public String name;
	public int age;

	public Person(String name, int age) {
	    this.name = name;
	    this.age = age;
	}

	public Person() {
	    this("名無権兵衛", 20);
	}

	public void show() {
	    System.out.printf("%s（%d歳）です。\n", this.name, this.age);
	}
	*/
	
	public String name;
	  public int age;
	  public LocalDateTime updated;

	{
	    this.updated = LocalDateTime.now();
	}

	public Person(String firstName, String lastName, LocalDate birth) {
	    this.name = lastName + " " + firstName;
	    this.age = Period.between(birth, LocalDate.now()).getYears();
	}

	public Person(String name, int age) {
	    this.name = name;
	    this.age = age;
	}
}

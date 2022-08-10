package com.company;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (salary < 1000) {
            return 0;
        } else {

            return this.salary * 0.3;
        }

    }


    int bonus() {
        if (workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {

            return 0;
        }
    }

    int thisYear = 2021;

    double raiseSalary() {
        if (thisYear - hireYear < 10) {
            return this.salary * 0.5;
        } else if (thisYear - hireYear > 9 && thisYear - hireYear < 20) {

            return this.salary * 0.10;
        } else if (thisYear - hireYear > 19) {
            return this.salary * 0.15;
        }


        return 0;
    }

    public void print() {

        System.out.println(" adi = " + this.name);
        System.out.println(" maasý = " + this.salary);
        System.out.println(" ise Baslama Yili = " + this.hireYear);
        System.out.println(" Calisma Saati = " + this.workHours);
        System.out.println(" bonusu = " + this.bonus());
        System.out.println(" Toplam Maas =  " + (this.salary-this.tax()+this.bonus()));


    }
}





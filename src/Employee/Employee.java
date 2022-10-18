package Employee;

import java.util.Scanner;

public class Employee {
    public static String name ;


    public static float salary;

    public static  int workhours;

    public static int hireYear;


    public Employee(String name, float salary, int workhours, int hireYear) {
        super();
        this.name = name;
        this.salary = salary;
        this.workhours = workhours;
        this.hireYear = hireYear;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        name=scan.nextLine();

        Scanner scan2 = new Scanner(System.in);
        hireYear =scan2.nextInt();

        Scanner scan3 = new Scanner(System.in);
        salary=scan.nextFloat();

        Scanner scan4 = new Scanner(System.in);
        workhours=scan.nextInt();



        System.out.println("Vergi tutari : ");
        float salaryvergi=tax(salary);
        System.out.println(salaryvergi);
        System.out.println("\n");

        System.out.println("Bonus : ");

        float bonus = bonus(workhours);
        System.out.println(bonus);
        System.out.println("\n");

       float  salary2=salary-salaryvergi+bonus;
        System.out.println("Maaş artışı : ");

        float raiseSalary=raiseSalary(hireYear,salary);

        System.out.println(raiseSalary);
        System.out.println("\n");

        System.out.println("Vergi ve Bonuslar ile birlikte maaş : ");
        System.out.println(salary2);

        float toplamMaas=raiseSalary+salary2;
        System.out.println("Toplam maaş : ");
        System.out.println(toplamMaas);
    }


    public static  float  tax(float salary) {
        float vergiTutar=0;


        if(salary<1000) {
            return vergiTutar;
        }
        else if(salary>1000) {
            vergiTutar=salary*3/100;
            return vergiTutar;

        }

        return vergiTutar;
    }

    public static float bonus(int workHours) {
        float bonus=0;
        if(workHours>40) {
            workHours=workHours-40;
            bonus=workHours*30;
        }
        else {
            bonus=0;

        }
        return bonus;

    }
    public static float raiseSalary(int hireYear,float salary){
        float salary2=0;
        if (2021-hireYear<10){
            salary2=salary*105/100;

        }
        else if(2021-hireYear>10 &&2021-hireYear<20){
            salary2=salary*110/100;
        }
        else if(2021-hireYear>19){
            salary2=salary*115/100;
        }
        float toplam=salary2-salary;
        return toplam;
    }


}

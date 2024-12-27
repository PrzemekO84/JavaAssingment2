import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Employee extends Person {

    //LocalDate date = LocalDate.of(2024, 3, 1);

    LocalDate date = LocalDate.now();

    int currentYear = date.getYear();
    int currentMonth = date.getMonthValue();

    //String EmployeeName;
    int EmployeeSalary;
    String EmployeeHireDate;
    String EmployeeLevel;

    public Employee(String name, String hireDate, String level){
        super(name);
        //EmployeeName = name;
        EmployeeHireDate = hireDate;
        EmployeeLevel = level;
        salaryCalculator();
    }

    @Override
    public String toString(){
        return "Employee name: " + getName() + ", employee salary: " + EmployeeSalary + ", employee hire date: " + EmployeeHireDate + ", employee level: " + EmployeeLevel;
    }

    public void salaryCalculator(){

        int employeeWorkingYears = workingYears();
        int employeeWorkingYearsBonus = 0;

        String emploToLowerCase = EmployeeLevel.toLowerCase();

        int baseSalary = 0;
        int workingYears = 0; //Dla working years przyjalem wlasne ramy czasowe podane na samym dole

        switch(emploToLowerCase){
            case "junior":
                baseSalary = 5000;
                break;
            case "mid":
                baseSalary = 10000;
                break;
            case "senior":
                baseSalary = 15000;
                break;
            default:
                System.out.println("Invalid employee level.");
        }

        if(employeeWorkingYears < 1){
        }
        else if(employeeWorkingYears < 3){
            employeeWorkingYearsBonus = 500;
        }
        else if(employeeWorkingYears < 5){
            employeeWorkingYearsBonus = 1200;
        }
        else if(employeeWorkingYears  < 10){
            employeeWorkingYearsBonus = 2000;
        }
        else{
            employeeWorkingYearsBonus = 4000;
        }
        
        EmployeeSalary = baseSalary + employeeWorkingYearsBonus;
    }

    public int workingYears(){
        int workingTime = 0;
        int monthsOfWork = 0;
        int yearsOfWork = 0;

        String yearOfHireString = EmployeeHireDate.substring(0, 4);
        String monthOfHireString = EmployeeHireDate.substring(8, 10);

        int yearOfHire = Integer.parseInt(yearOfHireString);
        int monthOfHire = Integer.parseInt(monthOfHireString);

        yearsOfWork = currentYear - yearOfHire;
        monthsOfWork = yearsOfWork * 12;

        if(yearsOfWork < 0){
            return workingTime;
        } else if(monthOfHire == 12){
            workingTime = (monthsOfWork - (monthOfHire - 1)) + currentMonth;
            return workingTime/12;
        }
        else{
            workingTime = (monthsOfWork - monthOfHire) + currentMonth;
            return workingTime/12;
        }
    }

    public String getDescription(){
        return "This is an Employee.";
    }

}

// "Zadanie 3
//Proszę rozszerzyć program z zadania drugiego o statyczne metody wytwórcze tworzące odpowiednio pracowników z podziałem na ich doświadczenie i bazowe wynagrodzenie (junior - 5000, mid - 10000, senior - 15000)"
//Przyjalem liczenie od miesiaca nie od dnia zatrudnienia.
// Mniej niz rok pracy = Brak dodatku
// Rok pracy = 500zl dodatku
// Trzy lata pracy = 1200zl dodatku
// Piec lat pracy = 2000zl dodatku
// Dziesiec lat pracy = 4000zl dodatku

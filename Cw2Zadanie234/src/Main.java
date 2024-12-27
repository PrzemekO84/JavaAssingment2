import java.sql.SQLOutput;
import java.time.LocalDate;

public class Main{
    public static void main(String[] args){

        LocalDate date = LocalDate.now();
        String elo = "XDD";
        int month = date.getMonthValue();

        Manager mainManager = new Manager("Przemek",  "2024-01-12", 15, "Manager");
        Employee employeeNumberOne = new Employee("Przemek", "2010-12-12 ", "Senior");
        Employee employeeNumberTwo = new Employee("Marcin", "2019-12-12 ", "Mid");
        Employee employeeNumberThree = new Employee("Tomek", "2021-12-12 ", "Mid");
        Employee employeeNumberFour = new Employee("Patryk", "2022-12-12 ", "Junior");
        Employee employeeNumberFive = new Employee("Marek", "2024-12-12 ", "Junior");

        Employee[] Employees = {employeeNumberOne, employeeNumberTwo, employeeNumberThree, employeeNumberFour,
                employeeNumberFive, mainManager};

        for(Employee emp : Employees){
            System.out.println("------------------------------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println(emp);
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        System.out.println(employeeNumberFive.getDescription());
        System.out.println();
        System.out.println(mainManager.getDescription());
    }
}
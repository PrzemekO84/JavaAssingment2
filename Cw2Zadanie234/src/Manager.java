public class Manager extends Employee {

    int bonus;
    int ManagerSalary;

    public Manager(String name, String hireDate, int bonus, String level) {
        super(name, hireDate, level);
        this.bonus = bonus;
        salaryCalculator();
    }

    @Override
    public void salaryCalculator(){
        int managerWorkingYears = workingYears();

        int managerBaseSalary = 20000;

        ManagerSalary = (managerBaseSalary + managerWorkingYears);

        int managerBonus = ManagerSalary * bonus/100;

        EmployeeSalary = ManagerSalary + managerBonus;
    }

    @Override
    public String toString(){
        return "Manager name: " + getName() + ", manager salary: " + EmployeeSalary + ", manager hire date: " + EmployeeHireDate + ", manager level: " + EmployeeLevel + ", manager bonus: " + bonus;
    }

    @Override
    public String getDescription(){
        return "This is a Manager.";
    }
}

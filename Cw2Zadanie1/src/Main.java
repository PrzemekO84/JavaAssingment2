import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //LocalDate date = LocalDate.of(2024, 5, 3);

        LocalDate date = LocalDate.now();

        //Myslalem ze ma od uzytkownika pobierac hehe
        //int userMonth;
//        do{
//            try{
//                System.out.println("Please enter the month, use number from 1-12: ");
//                userMonth = scanner.nextInt();
//                break;
//            }
//            catch(Exception e){
//                System.out.println("Invalid value.");
//                scanner.nextLine();
//            }
//        } while(true);



        int year = date.getYear();
        int month = date.getMonthValue();

        int lengthOfMonth = date.lengthOfMonth();
        int currentDayOfMonth = date.getDayOfMonth();
        int firstDayOfMonthInt = 0;
        int daysCounter = 1;

        LocalDate firstWeek = LocalDate.of(year, month, 1);

        String firstDayOfMonth = String.valueOf(firstWeek.getDayOfWeek());

        switch(firstDayOfMonth){
            case "MONDAY":
                firstDayOfMonthInt = 1;
                break;
            case "TUESDAY":
                firstDayOfMonthInt = 2;
                break;
            case "WEDNESDAY":
                firstDayOfMonthInt = 3;
                break;
            case "THURSDAY":
                firstDayOfMonthInt = 4;
                break;
            case "FRIDAY":
                firstDayOfMonthInt = 5;
                break;
            case "SATURDAY":
                firstDayOfMonthInt = 6;
                break;
            case "SUNDAY":
                firstDayOfMonthInt = 7;
                break;
        }

        //System.out.println(firstDayOfMonthInt);

        System.out.println("Printing current month calendar for " + date);

        System.out.println("");

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        for(int i = 1; i <= lengthOfMonth; i++){

            if(firstDayOfMonthInt != 0){
                for(int x = 1; x <= firstDayOfMonthInt - 1; x++){
                    System.out.printf("    ");
                    daysCounter++;
                }
                firstDayOfMonthInt = 0;
            }

            if(i == currentDayOfMonth){
                if(i >= 10){
                    System.out.printf(i +"* ");
                    daysCounter++;
                }
                else{
                    System.out.printf(i +"*  ");
                    daysCounter++;
                }
            }
            else{
                if(i >= 10){
                    if(daysCounter % 7 == 0){
                        System.out.println(i + "  ");
                        daysCounter = 1;
                    }
                    else{
                        System.out.printf(i + "  ");
                        daysCounter++;
                    }
                }
                else{
                    if(daysCounter % 7 == 0){
                        System.out.println(i + "   ");
                        daysCounter = 1;
                    }
                    else{
                        System.out.printf(i + "   ");
                        daysCounter++;
                    }
                }
            }
        }
    }
}

//Wiem, że troche chaotycznie i pewnie mozna by to napisac bardziej "clean" ale staralem sie samemu to zrobic :D

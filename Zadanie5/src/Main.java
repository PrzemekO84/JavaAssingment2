//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Point blankPoint = new Point();
        Point pointNumberOne = new Point(4, 8);
        Point pointNumberTwo = new Point(2, 6);

        System.out.println(blankPoint.x);
        System.out.println(blankPoint.y);

        System.out.println(pointNumberOne.calculateDistance(pointNumberTwo, pointNumberOne));

        System.out.println(blankPoint.calculateDistance(blankPoint, pointNumberOne));



    }
}


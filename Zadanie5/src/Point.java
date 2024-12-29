import java.util.Scanner;

public class Point{

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public String calculateDistance(Point pointNumberOne, Point pointNumberTwo){

        double distance;

        distance = Math.sqrt(
                Math.pow((pointNumberTwo.x - pointNumberOne.x), 2) +
                        Math.pow((pointNumberTwo.y - pointNumberOne.y), 2));

        return "The distance between two points is equal: " + distance;
    }

}

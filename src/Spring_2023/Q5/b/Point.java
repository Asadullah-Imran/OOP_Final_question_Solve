package Spring_2023.Q5.b;

import java.util.ArrayList;
import java.util.Collections;

public class Point implements Comparable<Point> {

    int x,y;
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int compareTo(Point p){
        int thisSum=this.x+this.y;
        int pointSum=p.x+p.y;
        if(thisSum>pointSum){
            return -1;
        }
        else if(thisSum<pointSum){
            return 1;
        }
        else if(thisSum==pointSum){
            return 0;
        }
        return 0;
    }


    //for trying that our code is working or not
    public static void main(String[] args) {
        Point p1 = new Point(2, 9);
        Point p2 = new Point(1, 6);
        Point p3 = new Point(2, 9);
        Point p4 = new Point(5, 4);
        Point p5 = new Point(6, 1);
        ArrayList<Point> points = new ArrayList<>();
        points.add(p1);
        points.add(p2);
        points.add(p3);
        points.add(p4);
        points.add(p5);

        System.out.println("before sort");
        printList(points);
        Collections.sort(points);
        System.out.println("After sort");
        printList(points);

    }

    public static void printList(ArrayList<Point> points){
        for(int i=0;i<points.size();i++){
            System.out.println(points.get(i).x +", "+points.get(i).y);
        }
    }
}

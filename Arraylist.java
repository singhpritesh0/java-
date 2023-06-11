import java.util.ArrayList;
import java.util.Date;

class circle{
    int radius = 5;
    public String toString(){
        return "Circle with radius = " + this.radius;
    }
}

class loan{
    int l = 200000;
    public String toString(){
        return "loan amount =" + this.l;
    }
}

public class Arraylist {
    public static void main(String[] args){
        ArrayList arr = new ArrayList();
        circle c = new circle();
        loan l = new loan();
        Date d = new Date(0, 0, 0, 0, 0, 0);
        arr.add(c);
        arr.add(l);
        arr.add(d);
        arr.add("pritesh");
        for(int i = 0;i<arr.size();i++){
            System.out.println("" + (arr.get(i)));
        }
    }
    
}

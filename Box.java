
package ProblemSolve96;

public class Box {
    Double height, width, depth;
    Box(double h, double w, double d){
     height =h;
     width =h;
     depth =d;
    }
    
    void display(){
     double mm= height*width*depth;
        System.out.println(" "+mm);
    }
}

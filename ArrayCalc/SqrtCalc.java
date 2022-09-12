import java.lang.Math;
public class SqrtCalc {
    
     double[] QuadraticOp(double a,double b){

        double roots[] = new double[2];
        roots[0] = Math.sqrt(a);
        roots[1] = Math.sqrt(b);

        return roots;
    }
}

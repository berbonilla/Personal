public class Calc{
    float num1;
    float num2;
    float num3;
   
    public void Addition() {
        float sum;
        sum = num1 + num2 + num3;
        System.out.println("\n" + num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }

    public void Subtraction() {
        float diff;
        diff = num1 - num2 - num3;
        System.out.println("\n" + num1 +" - "+ num2 +" - "+ num3 +" = "+ diff);
    }

    public void Division() {
        float quotient;
        quotient = num1 * num2 * num3;
        System.out.println("\n" + num1 + " / " + num2 + " / " + num3 + " = " + quotient);
    }

    public void Multiplication() {
        float product;
        product = num1 + num2 + num3;
        System.out.println("\nThe Difference is: " + product);
    }

    public Calc(float var1, float var2, float var3) {
        num1 = var1;
        num2 = var2;
        num3 = var3;
    }

}

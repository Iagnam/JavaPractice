public class pb6 {
    public static void main(String[] args) {
    Calculator c=new Calculator();
    System.out.println(c.add(7,6));
    System.out.println(c.add(2,8,10));
    System.out.println(c.add(2,7,88,10));
    System.out.println(c.mult(7,6));
    System.out.println(c.mult(2,8,10));
    System.out.println(c.mult(2,7,8,10));
    System.out.println(c.sub(7,6));
    System.out.println(c.sub(2,8,10));
    
    }
}
class Calculator{
    
    public int add(int a,int b){
        return a+b;
    }
    
    public int add(int a,int b, int c){
        return a+b+c;
    }
   
    public int add(int a,int b,int c,int d){
        return a+b+c+d;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int sub(int a,int b, int c){
        return a-b-c;
    }

    public int mult(int a,int b){
        return a*b;
    }
    public int mult(int a,int b, int c){
        return a*b*c;
    }
    public int mult(int a,int b,int c,int d){
        return a*b*c*d;
    }
}
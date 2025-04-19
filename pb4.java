public class pb4 {
    public static void main(String[] args) {
        Circle c=new Circle();
        Square sq=new Square();
        Triangle t=new Triangle();
        c.draw();
        sq.draw();
        t.draw();
    }
}
interface shape{
    void draw();
}
class Circle implements shape{
    void draw(){
        System.out.println("circle");
    }
}
class Triangle implements shape{
    void draw(){
        System.out.println("Triangle");
    }
}
class Square implements shape{
    void draw(){
        System.out.println("Square");
    }
}

public class pb3 {
    public static void main(String[] args) {
        Square r=new Square();
        System.out.println(r.AreaRectangle(5,4));
        System.out.println(r.PerimeterOfRectangle(5,4));
       // Square s=(Square) r;
        System.out.println(r.AreaSquare(4));
    }
   
}
class Rectangle{
    int width;
    int height;
    int AreaRectangle(int width,int height){
        return width*height;
    }
    int PerimeterOfRectangle(int width,int height){
        return 2*(width+height);
    }

}
class Square extends Rectangle{
    int side;
    int AreaSquare(int side){
        return side*side;
    }
}

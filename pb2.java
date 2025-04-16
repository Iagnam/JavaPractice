public class pb2 {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println(r.AreaRectangle(5,10));
        System.out.println(r.PerimeterOfRectangle(7,7));

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
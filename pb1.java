class Person {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String newName){
        this.name=newName;
    }
    public void setAge(int newAge){
        this.age=newAge;
    }
    
}

public class pb1{
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("kamali");
        p.setAge(18);
        p.getName();
        p.getAge();
        System.out.println( p.getName()+
        p.getAge());

}
}

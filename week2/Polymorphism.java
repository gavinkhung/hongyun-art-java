public class Polymorphism {

    public static void main(String [] args){
        Parent parent = new Parent("gavin", 16, 1.6);

        Son son = new Son("car", "boy", 16, 1.6);

        System.out.println(person.getHeight());
        System.out.println(father.getHeight());

        Parent ps = new Son("car", "boy", 16, 1.6);

        //System.out.println(ps.getToy());
        System.out.println(ps.getFirstName());
    }

}
class Parent {

    private String firstName;
   
    private int age;
    private double height;

    public Parent(String firstName, int age, double height){
        this.firstName = firstName;
        this.age = age;
        this.height = height;
    }

    public void doSomething(){
        System.out.println("doSomething 0 attributes");
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

}
class Child extends Parent {

    private String toy;

    public Child(String toy, String firstName, int age, double height){
        super(firstName, age, height);
        this.toy = toy;
    }

    public String getToy(){
        return toy;
    }

    public void setToy(String toy){
        this.toy = toy;
    }

}
public class Inheritance {

    public static void main(String [] args){
        Person person = new Person("gavin", 16, 1.6);
        Father father = new Father("dad", 44, 1.7);

        System.out.println(person.getFirstName());
        System.out.println(father.getFirstName());

        //System.out.println(person.getPartner());
        System.out.println(father.getPartner());
    }

}
class Person {

    private String firstName;
   
    private int age;
    private double height;

    public Person(String firstName, int age, double height){
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
class Father extends Person {

    private String partner;

    public Father(String partner, String firstName, int age, double height){
        super(firstName, age, height);
        this.partner = partner;
    }

    public String getPartner(){
        return partner;
    }

    public void setPartner(String partner){
        this.partner = partner;
    }

}
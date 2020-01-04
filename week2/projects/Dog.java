public class Dog
{
  private String name;
  private int age;
  private String favoriteFood;
  
  public Dog(String name, int age, String favoriteFood)
  {
    this.name = name;
    this.age = age;
    this.favoriteFood = favoriteFood;
  }
  
  public String getName()
  {
   return name; 
  }
  
  public int getAge()
  {
   return age; 
  }
  
  public String getFood()
  {
   return favoriteFood; 
  }

  public void bark(){
    System.out.println("woof");
  }
}

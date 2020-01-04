public class Corgi extends Dog
{
  private String name;
  private int age;
  private String favoriteFood;
  
  public Corgi(String name, int age, String favoriteFood)
  {
    super(name, age, favoriteFood);
  }
  
  public void bark(){
      System.out.println("pet me");
  }
}

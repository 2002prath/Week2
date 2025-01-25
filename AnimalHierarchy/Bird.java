package AssistedProblems.AnimalHierarchy;

class Bird extends Animal{

  public Bird(String name,int age)
  {
     super(name,age);
  }
  public void makeSound()
  {
      System.out.println("bird sound");
  }
}

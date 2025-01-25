package AssistedProblems.AnimalHierarchy;


class Animal
{
    protected String name;
    protected int age;

    public Animal(String animal_name,int animal_age)
    {
        this.name = animal_name;
        this.age = animal_age;
    }

    public void makesound()
    {
        System.out.println("Animal sound");
    }
    public void display_info()
    {
        System.out.println("Name of Animal"+name);
        System.out.println("Age of Animal"+age);
    }
}

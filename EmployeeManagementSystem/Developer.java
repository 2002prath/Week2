package AssistedProblems.EmployeeManagementSystem;

class Developer extends Employee {
    protected String programming_language;

    public Developer(String name,String id ,double salary,String prog_language)
    {
        super(name,id,salary);
        this.programming_language =prog_language;
    }

    public void lang()
    {
        System.out.println("Programming language is "+programming_language);
    }
}

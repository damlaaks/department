package department;
public class Department {
    private String name;
    private String personelName;
    public Department(String name, String personelName){
        this.name = name;
        this.personelName = personelName;
    }
    public void printPersonelName(){
        System.out.println(personelName);
    }
    public void printName(){
        System.out.println(name);
    }
}

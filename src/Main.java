import department.Department;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department ikDepartment = new Department("IK", "Damla");
        ikDepartment.printPersonelName();
        ikDepartment.printName();

        Department testDepartment = new Department("Test", "Guney");
        testDepartment.printPersonelName();
        testDepartment.printName();
    }
}
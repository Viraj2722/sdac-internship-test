package Main2;
//overloading and overriding
class Person {
    public void showDetails(String name) {
        System.out.println(" Person: Name = " + name );
    }

    public void showDetails(String name, int age) {
        System.out.println(" Person: Name = " + name + ", Age = " + age);
    }
}

class Employee extends Person {
    @Override
    public void showDetails(String name,int age) {
        System.out.println("Employee: Name = " + name + ", Age = " + age);
    }
}

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        person.showDetails("viraj");
        person.showDetails("viraj", 20);

        Employee employee = new Employee();
        employee.showDetails("viraj",20);
    }
}


public class Patient {
    String name;
    int id;
    int severity;
    int age;
    public Patient( String name, int ID, int severity, int age){
        this.name=name;
        this.id= ID;
        this.severity= severity;
        this.age = age;
    }
    public String toString() {
        return "ID: " + id + " | Name: " + name + " | Severity: " + severity + " | Age: " + age;
    }
}

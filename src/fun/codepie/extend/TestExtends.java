package fun.codepie.extend;

public class TestExtends {
  public static void main(String[] args) {
    var student = new Student();
    student.hello();

    System.out.println(student instanceof Student);
    System.out.println(student instanceof Person);
    System.out.println(student instanceof Object);
  }
}

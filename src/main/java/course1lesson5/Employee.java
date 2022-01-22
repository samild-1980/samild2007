package course1lesson5;

public class Employee {
   private String fullNane;
   private String post;
   private String email;
   private String phoneNumber;
   private int salary;
   private int age;

   public Employee(String fullNane, String post, String email, String phoneNumber, int salary, int age) {
       this.fullNane = fullNane;
       this.post = post;
       this.email = email;
       this.phoneNumber = phoneNumber;
       this.salary = salary;
       this.age = age;
   }
   public void printEmloyeeInfo() {
       System.out.println("Имя сотрудника: " + fullNane + ", Должность: " + post + ", email: " + email + ", номер телефона: " + phoneNumber + ", зарплата: " + salary + ", возраст: " + age);
   }



}

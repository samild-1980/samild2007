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

    @Override
    public String toString() {
        return fullNane + " " + post + " " + email + " " + phoneNumber + " " + salary + " " + age;
    }
    public static void printArr(Employee x) {
        System.out.println(x.fullNane + " " + x.post + " " + x.email + " " + x.phoneNumber + " " + x.salary + " " + x.age);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

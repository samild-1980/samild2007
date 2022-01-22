package course1lesson5;

public class EmployeeDemoApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivanov Ivan Ivanovich", "java-devoloper", "samild-1980@yandex.ru", "89630068143", 50000, 41);
        employee1.printEmloyeeInfo();
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Сидоров Михаил Степанович", "инженер", "dovg124@mail.ru", "89124857493", 45000, 35);
        employeesArray[1] = new Employee("Полукаров Дмитрий Алексеевич", "тестировщик", "polukar189@mail.ru", "89225689345", 60000, 23);
        employeesArray[2] = new Employee("Логашев Артём Витальевич", "аналитик", "log1998@mail.ru", "89614872635", 45000, 29);
        employeesArray[3] = new Employee("Ivanov Ivan Ivanovich", "java-devoloper", "samild-1980@yandex.ru", "89630068143", 50000, 40);
        employeesArray[4] = new Employee("Викулов Максим Егорович", "банкир", "vikul2001@mail.ru", "89227893672", 70000, 35);


    }
}

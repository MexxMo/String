public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");

        String firstName = "Ivan ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;

        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задача 2");

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("Задача 3");

        fullName = "Иванов Семён Семёнович";

        String zamena = fullName.replace('ё', 'е');

        System.out.println("Данные ФИО  — " + zamena);
    }
}
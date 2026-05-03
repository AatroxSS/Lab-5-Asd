import java.util.function.Predicate;

public class Main {
    private static int sequentialSearchIndex(Student[] arr, int size, Predicate<Student> condition) {
        for (int i = 0; i < size; i++) {
            if (condition.test(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static Student sequentialSearch(Student[] arr, int size, Predicate<Student> condition) {
        int index = sequentialSearchIndex(arr, size, condition);
        return (index != -1) ? arr[index] : null;
    }

    public static void main(String[] args) {
        final int CAPACITY = 25;
        Student[] students = new Student[CAPACITY];
        int n = 0;

        students[n++] = new Student("Шевченко", "Тарас", 5, 6, 2000, "туризм");
        students[n++] = new Student("Коваленко", "Олена", 12, 3, 1999, "читання");
        students[n++] = new Student("Бондар", "Максим", 22, 7, 2001, "футбол");
        students[n++] = new Student("Мельник", "Анна", 8, 8, 2002, "туризм");
        students[n++] = new Student("Гончар", "Іван", 14, 1, 1998, "риболовля");
        students[n++] = new Student("Кравчук", "Марія", 30, 6, 2003, "музика");
        students[n++] = new Student("Лисенко", "Петро", 9, 9, 2000, "туризм");
        students[n++] = new Student("Ткачук", "Софія", 18, 7, 2004, "танці");
        students[n++] = new Student("Пономаренко", "Олег", 3, 4, 1997, "плавання");
        students[n++] = new Student("Коваль", "Ірина", 27, 8, 2001, "туризм");
        students[n++] = new Student("Савченко", "Віктор", 11, 11, 2005, "комп'ютери");
        students[n++] = new Student("Білоус", "Юлія", 15, 6, 1996, "садівництво");
        students[n++] = new Student("Тимчук", "Андрій", 7, 5, 2002, "гітара");
        students[n++] = new Student("Яремчук", "Катерина", 19, 12, 2000, "туризм");
        students[n++] = new Student("Костенко", "Сергій", 2, 1, 2003, "бокс");
        students[n++] = new Student("Захаренко", "Наталя", 25, 7, 1999, "туризм");
        students[n++] = new Student("Василенко", "Дмитро", 17, 3, 2001, "авто");
        students[n++] = new Student("Федорчук", "Оксана", 29, 8, 2005, "фотографія");
        students[n++] = new Student("Руденко", "Богдан", 10, 10, 2004, "туризм");
        students[n++] = new Student("Грищук", "Лариса", 6, 6, 2002, "шиття");
        students[n++] = new Student("Данилюк", "Артем", 21, 2, 1998, "риболовля");
        students[n++] = new Student("Сидоренко", "Зіна", 14, 7, 2001, "туризм");

        System.out.println("Початковий масив студентів:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        System.out.println("Кількість студентів: " + n);

        Predicate<Student> removalCondition = s ->
                (s.getMonth() >= 6 && s.getMonth() <= 8) && "туризм".equals(s.getHobby());

        System.out.println("\nВидаляємо студентів, народжених улітку, які захоплюються туризмом...");
        while (true) {
            int index = sequentialSearchIndex(students, n, removalCondition);
            if (index == -1) break;
            for (int i = index; i < n - 1; i++) {
                students[i] = students[i + 1];
            }
            students[--n] = null;
        }

        System.out.println("\nМасив після видалення:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + students[i]);
        }
        System.out.println("Кількість студентів: " + n);
    }
}

package courses;


import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CollectionHomeTaskTest {


    /**
     * В этом методе необходимо реализовать:
     * 1. На вход получаем коллекцию пользователей
     * 2. Удаляем все дубли (одинаковое имя и возраст)
     * 3. Сортируем по имени и возрасту
     */
    @Test
    public void task1() {
        List<CollectionHomeTask.User> users = Arrays.asList(new CollectionHomeTask.User("Ivan", 15),
                new CollectionHomeTask.User("Masha", 17),
                new CollectionHomeTask.User("Kolya", 23),
                new CollectionHomeTask.User("Denis", 7),
                new CollectionHomeTask.User("Vova", 45),
                new CollectionHomeTask.User("Marina", 15),
                new CollectionHomeTask.User("Kolya", 15), new CollectionHomeTask.User("Vova", 25),
                new CollectionHomeTask.User("Vlad", 26), new CollectionHomeTask.User("Ivan", 17));

        CollectionHomeTask.User result = CollectionHomeTask.task1(users);
        assertEquals("Vova", result.getName());
        assertEquals(45, result.getAge());
    }

    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем коллекцию пользователей
     * 2. Преобразовываем его в справочник [номер телефона -> пользователь]
     * 3. Один номер телефона на одного пользователя
     * 4. Вернуть количество записей в справочнике
     */
    @Test
    public void task2() {
        List<CollectionHomeTask.User> users = Arrays.asList(new CollectionHomeTask.User("1234"),
                new CollectionHomeTask.User("36736"), new CollectionHomeTask.User("1244"),
                new CollectionHomeTask.User("234324"), new CollectionHomeTask.User("234"),
                new CollectionHomeTask.User("234"), new CollectionHomeTask.User("234346"),
                new CollectionHomeTask.User("1234"), new CollectionHomeTask.User("23523"),
                new CollectionHomeTask.User("2342342"));

        int result = CollectionHomeTask.task2(users);
        assertEquals(8, result);
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем список названий книг
     * 2. Распределяем книги по полкам так, чтобы на каждой полке было примерно одинаковое количество книг
     * 3. Все книги должны быть отсортированы по алфавиту с первой до последней полки
     * 4. Количество полок константное - 5 штук
     * 5. Вернуть книги распределенные по полкам
     */
    @Test
    public void task3() {
        List<String> books = Arrays.asList("Тихий дон", "Вишневый сад", "Война и мир", "Мертвые души", "Преступление и наказание", "Аэлита",
                "Идиот", "Каменный цветок", "Мстители: Финал", "Игра престолов", "Тень воина", "Путь героя", "Ангелы и демоны",
                "Код да Винчи", "Гуси-лебеди", "Колобок", "Маша и медведь", "Снегурочка");

        Map<Integer, List<String>> result = CollectionHomeTask.task3(books);
        assertEquals("Гуси-лебеди", result.get(2).get(0));
        assertEquals("Код да Винчи", result.get(3).get(0));
        assertEquals("Аэлита", result.get(1).get(1));
    }


    /**
     * В этом методе необходимо реализовать следующий алгоритм:
     * 1. На вход получаем книги, распределенные по полкам
     * 5. Вернуть справочник [название книги -> номер полки]
     */
    @Test
    public void task4() {
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(4, Arrays.asList("Ангелы и демоны"));
        map.put(2, Arrays.asList("Вишневый сад"));
        map.put(3, Arrays.asList("Тень воина"));
        map.put(5, Arrays.asList("Преступление и наказание"));
        map.put(1, Arrays.asList("Маша и медведь"));

        Map result = CollectionHomeTask.task4(map);

        assertEquals(1, result.get("Маша и медведь"));
        assertEquals(2, result.get("Вишневый сад"));
        assertEquals(3, result.get("Тень воина"));
        assertEquals(4, result.get("Ангелы и демоны"));
        assertEquals(5, result.get("Преступление и наказание"));
    }
}

// Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.


import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class task2 {
    public static void main(String[] args) {
        String str = new String("Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов");
        String[] array = str.split(" ");
        Queue<String> queue = new LinkedList<String>();
        Queue<String> newQueue = new LinkedList<String>();
        HashMap<String, Integer> directory= new HashMap<>();

        for (int i = 0; i < array.length; i+=2) {
            queue.add(array[i]);
        }
        //System.out.println(queue);
        for (String string : queue) {
            String key = string;
            if (directory.containsKey(key)) {
                directory.put(key, (directory.get(key)+1)); 

            } else {
                int value=1;
                directory.put(key, value);
            }
        }
        //System.out.println(directory);
        int max = 0;
        for (String string : queue) {
            String key = string;
            if (directory.get(key)>max) {
                max = directory.get(key);
            }
        }

        for (String string : queue) {
            if (!newQueue.contains(string)) {
                newQueue.add(string);
            }
        }

        for (int i = max; i > 0; i--) {
            for (String string : newQueue) {
                String key = string;
                if (directory.get(key)==i) {
                    System.out.printf(key + "-" + directory.get(key)+ "\n");
                }
            }
        }
    }
}


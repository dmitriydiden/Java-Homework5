// Задача №1. Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.


import java.util.*;
public class task1 {
    public static Map<String, List<String>> surnameMap = Map.of("Ivanov", List.of("88442123456", "89277778888", "88442345678"), 
                                                            "Petrov", List.of("89052345611", "88442654321"), 
                                                            "Sidorov", List.of("89377070001"));
    public static void main(String[] args) {
        for (Map.Entry<String, List<String>> map : surnameMap.entrySet()) {
             System.out.println(map);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите фамилию абонента=");
        String name=sc.next();
        System.out.println(name);
  
        if(surnameMap.containsKey(name)) {
        System.out.println(name +"= "+surnameMap.get(name));
        } else {
            System.out.println("Такого абонента в справочнике нет!");
        }

    }
}

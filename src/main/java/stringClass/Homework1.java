package stringClass;

public class Homework1 {
    public static void main(String[] args) {
        String paragraph = "Недавно";
        String paragraphTo = "###";
//        System.out.println(paragraph);
//
//        //Возвращает длину строки
//        System.out.println("length() - возвращает длину строки = " + paragraph.length());
//
//        //Проверка строки на пустату
//        System.out.println("isEmpty() - проверка строки на пустату = " + paragraph.isEmpty());
//
//        //Проверка отсутствия символов. Проверка строки на NULL
//        System.out.println(paragraph.isBlank());
//
//        //Вывод элементов по индексу с номера по номер
//        System.out.println(paragraph.substring(2,7));
//
//        Возвращает индекс первого вхождения указанного значения в строковый объект String , на котором он был вызван
  //     System.out.println(paragraph.indexOf("г"));

        //ищет указанную строку в нашей строке с конца! Он может искать
        // ее с самого конца строки или начиная с какого-то номера (второй метод).
        // Если строка найдена – метод возвращает номер ее первого символа, если не найдена — возвращает -1
      //  System.out.println(paragraph.lastIndexOf("во всех ветках"));

//        //Меняет все буквы на строчные
//        System.out.println(paragraph.toLowerCase());
//
//        //Меняет все буквы на верхний регистр,заглавные буквы
//        System.out.println(paragraph.toUpperCase());
//
//        //Замена одного символа на другой
//        System.out.println(paragraph.replace("е","о"));
//
//        //Позволяет определить, начинается ли строка с символов указанных в скобках метода, возвращая, соответственно, true или false .
//        System.out.println(paragraph.startsWith("Н"));
//
//        //Позволяет определить, заканчивается ли строка символами указанными в скобках, возвращая, соответственно, true или false
//        System.out.println(paragraph.endsWith("."));
//
//        //Повтор переменной
//        System.out.println(paragraph.repeat(7));
//
//        //Позволяющий проверить, содержит ли String другую подстроку или нет. Возвращает логическое значение
       System.out.println(paragraph.contains("u"));
//
//        //Возвращает строку со значением строки, переданной в метод и приложенной к концу строки,
//        // используемой для вызова этого метода. Проще говоря метод concat() в Java объединяет строки,
//        // путем добавления одной строки в конец к другой.
//        System.out.println(paragraph.concat(paragraphTo));
//
//        //Встроенная функция, которая удаляет начальные и конечные пробелы.
//        System.out.println(paragraph.trim());
//
//        //Применяют для сравнения объектов на равенство. Он возвращает true, если два объекта равны, и false, если они не равны.
//        System.out.println(paragraph.equals("Недавно пришлось вносить изменения для файлика .gitlab-ci.yml во всех ветках, а потом ещё в несколько файлов и таким образом накопилось большое количество коммитов. Сейчас появилась необходимость актуализировать master ветку из условной release-abel. При мёрдже из release-abel в master мёрджатся только последние коммиты."));
 }
}

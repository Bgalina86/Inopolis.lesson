package Lesson4;

public class User {

        String name;
        int age;
        String phone;
        String email;
        double rating; //4.98
        boolean isOnline;
        boolean status;

public User(String myName, int myAge, boolean myStatus, String myPhone){
        name = myName;
        age = myAge;
        phone = myPhone;
        status = myStatus;
        rating = 5.0;
        isOnline = status;

       // System.out.println("Я создался, меня зовут: " + myName);

}

        /*
        String paragraph = "Недавно пришлось вносить изменения для файлика .gitlab-ci.yml во всех ветках, а потом ещё в несколько файлов и таким образом накопилось большое количество коммитов. Сейчас появилась необходимость актуализировать master ветку из условной release-abel. При мёрдже из release-abel в master мёрджатся только последние коммиты.";
        String paragraphTo = "###";
        System.out.println(paragraph);

        //Возвращает длину строки
        System.out.println("length() - возвращает длину строки = " + paragraph.length());

        //Проверка строки на пустату
        System.out.println("isEmpty() - проверка строки на пустату = " + paragraph.isEmpty());

        //Проверка отсутствия символов. Проверка строки на NULL
        System.out.println(paragraph.isBlank());

        //Вывод элементов по индексу с номера по номер
        System.out.println(paragraph.substring(2,7));
    */
}

package Homework4;

//Перебор массива
//    используя цикл, напечатайте информацию о всех фильмах из задания "задача про массив объектов" в формате "год - название - жанр - рейтинг"

public class Task5ArrayClassFilms {

    public static void main(String[] args) {

        // Размерновть массива
        Movie films[] = new Movie[3];

        // Заполнение массива элементами из класса
        films[0] = new Movie("\"Лёд 3\"", 2, "спорт", "Россия", true);
        films[0].year = 2024;
        films[1] = new Movie("\"Министерство неджентльменских дел\"", 5, "боевик", "США", false);
        films[1].year = 2024;
        films[2] = new Movie("\"Онегин\"", 1, "мелодрама", "Россия", true);
        films[2].year = 2024;

        // Организация вывода элементов массива с помощью цикла for
        for (int i = 0; i< films.length; i=i+1){
            System.out.println("i = " + i);
            String  info = "Год: " + films[i].year + " Название фильма: " + films[i].name + " Жанр: " + films[i].genre + " Рейтиинг: " + films[i].rating ;
            System.out.println(info);
        }

    }

}

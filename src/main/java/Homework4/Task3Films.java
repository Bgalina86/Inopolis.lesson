package Homework4;
//Задача про массив объектов
//    создайте класс Movie
//    в классе создайте поля:
//    название
//    рейтинг (от 0 до 10)
//    жанр
//    страна
//    есть ли оскар (да/нет)
//    создайте в другом классе метод psvm.
//    в этом методе объявите массив films
//    положите в массив 3 любимых фильма

public class Task3Films {

    public static void main(String[] args) {

        // Размерновть массива
        Movie films[] = new Movie[3];

        // Заполнение массива элементами из класса
        films[0] = new Movie("\"Лёд 3\"", 2, "спорт", "Россия", true);
        films[1] = new Movie("\"Министерство неджентльменских дел\"", 5, "боевик", "США", false);
        films[2] = new Movie("\"Онегин\"", 1, "мелодрама", "Россия", true);

        // Организация вывода элементов массива в строку
        String Film1 =
            "1." + "Наименование: " + films[0].name + " Рейтинг: " + films[0].rating + " Жанр: "
                + films[0].genre + " Страна: " + films[0].country + " Оскар: " + films[0].oskar;
        String Film2 =
            "2." + "Наименование: " + films[1].name + " Рейтинг: " + films[1].rating + " Жанр: "
                + films[1].genre + " Страна: " + films[1].country + " Оскар: " + films[1].oskar;
        String Film3 =
            "3." + "Наименование: " + films[2].name + " Рейтинг: " + films[2].rating + " Жанр: "
                + films[2].genre + " Страна: " + films[2].country + " Оскар: " + films[2].oskar;

        // Вывод массивов на экран
        System.out.println(Film1 + "\n" + Film2 + "\n" + Film3);
    }
}

package Honeworl5;

/**
 * https://github.com/EreminD/course_23.05.git
 * ●	Создайте класс Car
 * ●	Поля могут быть любые.
 * ●	Обязательно должно быть поле currentSpeed (тип данных int). По умолчанию currentSpeed = 0;
 * ●	Создайте метод getCurrentSpeed. Метод должен возвращать (return) текущую скорость Done
 * ●	Создайте метод speedUp, который принимает на вход число. Метод должен увеличивать текущую скорость на заданное число. Done
 * ●	Создайте метод break(), который сокращает текущую скорость на 10 единиц.Done
 * ○	Если текущая скорость <= 10, то метод делает текущую скорость равной 0 Done
 * ●	Создайте класс MyProgram + метод psvm.
 * ●	В методе создайте новый экземпляр класса.
 * ●	Запросите текущую скорость и выведите ее на экран.
 * ●	Увеличьте скорость на 25 единиц.
 * ●	Запросите текущую скорость и выведите ее на экран. Должно быть 25
 * ●	Вызовите метод brake()
 * ●	Запросите текущую скорость и выведите ее на экран. Должно быть 15
 * ●	Вызовите метод brake()
 * ●	Запросите текущую скорость и выведите ее на экран. Должно быть 5
 * ●	Вызовите метод brake()
 * ●	Запросите текущую скорость и выведите ее на экран. Должно быть 0
 * Пример кода работы с классом Car:
 * Car car = new Car("Volvo", "S60");
 *
 * String speed = car.getCurrentSpeed();
 * System.out.println(speed); // тут 0
 *
 * car.speedUp(25);
 * speed = car.getCurrentSpeed();
 * System.out.println(speed); // тут 25
 *
 * car.brake()
 * speed = car.getCurrentSpeed();
 * System.out.println(speed); // тут 15
 *
 * car.brake()
 * speed = car.getCurrentSpeed();
 * System.out.println(speed); // тут 5
 *
 * car.brake()
 * speed = car.getCurrentSpeed();
 * System.out.println(speed); // тут 0
 * */

public class Task2MetodCar {
    public static void main(String[] args) {

    }
}

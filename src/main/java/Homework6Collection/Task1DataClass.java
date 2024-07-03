package Homework6Collection;

/**
 * Опишите класс PlayerProba(игрок) ●У игрока есть поля: ○id(int) ○nickname(String) ○isOnline(boolean)
 * ●Все поля должны быть приватными ●Переопределите для класса методы equals(),hashCode()иtoString()
 * ●В отдельном классе создайте двух игроков с одинаковыми значениями полей. ●Убедитесь,что
 * player1==player2==>false ●Убедитесь,что player1.equals(player2)==>true
 */
public class Task1DataClass {

    public static void main(String[] args) {
        Player player1 = new Player(1, "Alex", true);
        Player player2 = new Player(1, "Alex", true);

        System.out.println(player1 == player2);
        System.out.println(player1.equals(player2));
    }
}

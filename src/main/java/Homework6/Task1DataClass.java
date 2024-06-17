package Homework6;

/**
 * ОпишитеклассPlayer(игрок)
 * ●Уигрокаестьполя:○id(int)○nickname(String)○isOnline(boolean)
 * ●Всеполядолжныбытьприватными
 * ●Переопределитедляклассаметодыequals(),hashCode()иtoString()
 * ●Вотдельномклассесоздайтедвухигроковсодинаковымизначениямиполей.
 * ●Убедитесь,чтоplayer1==player2==>false
 * ●Убедитесь,чтоplayer1.equals(player2)==>true
 */
public class Task1DataClass {

    public static void main(String[] args) {
        Player player1 = new Player(1, "Alex", true);
        Player player2 = new Player(1, "Alex", true);

        System.out.println(player1==player2);
        System.out.println(player1.equals(player2));

    }

}

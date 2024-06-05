package Lesson4;

public class Looos {

    public static void main(String[] args) {
        Students[] group = new Students[4];

        group[0] = new Students("Алёна", "Швайка");
        group[1] = new Students("Анна", "");
        group[2] = new Students("Вася", "Тест");
        group[3] = new Students("Галина", "Смирнова");

        group[0].strfg = true;
        group[1].strfg = false;
        group[2].strfg = true;
        group[3].strfg = false;
/*
        String info;
        info = group[0].Firstname + " " + group[0].lastname + "---->" + group[0].strfg;
        System.out.println(info);
*/
        for (int i = 0; i< group.length; i=i+1){
            System.out.println("i = " + i);
            String  info = group[i].Firstname + " " + group[i].lastname + "---->" + group[i].strfg;
            System.out.println(info);
        }
System.out.println("////");
        for (Students students : group)
        {
            String  info = students.Firstname + " " + students.lastname + "---->" + students.strfg;
            System.out.println(info);
        }
    }

}

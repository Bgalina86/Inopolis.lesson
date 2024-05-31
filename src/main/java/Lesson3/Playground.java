package Lesson3;

public class Playground {
    public static void main(String[] args) {
        int count = 1;
        String city = "Москва";
        User user1 = new User("Alex ",27, true,"55455152545");
        user1.age = 27;
        user1.phone = "55455152545";
        user1.isOnline = true;
        user1.email = "bkdjg@kdgl.dgd";
        user1.rating = 5.0;
        user1.name = "Alex ";

        User user2 = new User("Smit ", 30,false,"55455152545");
        user2.name = "Smit ";
        user2.age = 30;
        System.out.println(user2.name + user2.age + " " + user2.rating);
        System.out.println(user1.name + user1.age + " " + user1.rating);

        Smartphone iphone = new Smartphone();
        System.out.println(iphone.hddGb);
        iphone.hddGb = 256;
        System.out.println(iphone.hddGb);


        Car car1 = new Car();
        car1.brand = "audi";
    }
}

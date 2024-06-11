package Lessons6;

public class User {
    String name;
    int age;
    String phone;
    String email;
    double rating; //4.98
    boolean isOnline;
    boolean status;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
public void notifyEmail(String email){
        System.out.println("Уведомление на почту" + email);
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


// выдает
    public double getRating() {
        return rating;
    }
//изменение
    public void setRating(double rating) {
        if (rating>10){ this.rating=10;}
        if (rating<0){this.rating=0;}
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

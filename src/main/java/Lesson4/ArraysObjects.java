package Lesson4;

public class ArraysObjects {

    public static void main(String[] args) {
        Track[] paylist = new Track[10];
        paylist[0]=new Track(272,"КАтюша","Катюша", 2013,new byte[200]);
        paylist[1]=new Track(272,"КАтюша","Катюша", 2013,new byte[200]);

        System.out.println(paylist[0].title);
    }

}

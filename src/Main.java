public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        New x = new New2();
    }
}

abstract class New {
    int s;
    New(){
        s = 10;
        System.out.println(s);
    }
}

class New2 extends New{

}
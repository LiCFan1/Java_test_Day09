package Demo03;

public class Keyboard implements USB {
    @Override
    public void turnOn() {

        System.out.println("键盘接入");
    }

    @Override
    public void turnOff() {
        System.out.println("键盘断开");

    }

    public void type(){
        System.out.println("键盘打字");
    }
}

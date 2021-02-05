package Demo03;

public class Mouse implements USB{
    @Override
    public void turnOn() {
        System.out.println("鼠标接入");
    }

    @Override
    public void turnOff() {
        System.out.println("鼠标断开");

    }

    public void click(){
        System.out.println("鼠标点击");
    }
}

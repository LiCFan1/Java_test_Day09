package Demo03;

public class test01 {
    public static void main(String[] args) {
        Desktop computer = new Desktop();
        computer.powerOn();
        computer.run(new Keyboard());
        USB usbMouse = new Mouse();
        computer.run(usbMouse);
        computer.powerOff();
    }
}

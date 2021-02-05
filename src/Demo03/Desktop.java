package Demo03;

public class Desktop {
    public void powerOn(){
        System.out.println("开机");
    }

    public void powerOff(){
        System.out.println("关机");
    }

    public void run(USB usb){
        usb.turnOff();
        usb.turnOn();
        if(usb instanceof Mouse){
            ((Mouse) usb).click();
        }else if(usb instanceof Keyboard){
            ((Keyboard) usb).type();
        }
    }
}

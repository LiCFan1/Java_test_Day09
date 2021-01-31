package Demo01;

public class MyInterfaceDefaultA implements MyInterfaceDefault {
    @Override
    public void methodAbs() {
        System.out.println("这是抽象的方法A");
    }

    @Override
    public void methodDefault() {
        System.out.println("实现类A修改了接口中的默认方法");
    }
}

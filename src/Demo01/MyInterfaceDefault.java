package Demo01;

public interface MyInterfaceDefault {
    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法调用");
    }
}

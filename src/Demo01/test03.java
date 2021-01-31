package Demo01;

public class test03 {
    public static void main(String[] args) {
        MyInterfaceStaticA impl = new MyInterfaceStaticA();
        // impl.methodStatic(); 错误写法
        MyInterfaceStatic.methodStatic();
    }
}

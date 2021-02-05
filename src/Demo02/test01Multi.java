package Demo02;

public class test01Multi {

    public static void main(String[] args) {
        Fu obj = new Zi();      // 左侧父类的引用指向右侧的子类的对象
        obj.method();
        System.out.println(obj.num);
    }
}

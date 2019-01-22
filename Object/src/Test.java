//public class Test {
//    public static void main(String[] args) {
//        StringBuffer sb=new StringBuffer("");
//        sb.append("haha");
//        System.out.println(sb);
//    }
//}

/**Object类
 * 是所有类的父类，换句话说Object类可以接收所有类的对象（向上转型），（所有引用数据类型都可以接收，java规定）
 * 方法： toString() 获取对象信息
 *        equals()  对象比较：  （由于Object类不知道子类有什么内容要比较，所以 Object类中equals方法是（return this=obj）,String
 *        的equals是重写后的方法，所以可以比较对象内容）
 */

//class Person{
//    private String name="果果";
//    private int age=20;
//    public String toString(){
//        return this.name+this.age;
//    }
//}
//
//public class Test{
//    public static void main(String[] args) {
//        Person per=new Person();
//        print(per);
//        print("haha");
//    }
//
//    public static void print(Object obj) {
//        System.out.println(obj);//obj.toString();
//
//    }
//}

/** 覆写equals方法
 */
//class Person{
//    private String name;
//    private Integer age;
//
//    public Person(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//    public boolean equals(Object obj){
//        if(obj==null){
//            return false;
//        }
//        if(this==obj){
//            return true;
//        }
//        if(!(obj instanceof Person)){
//            return false;
//        }
//        Person per=(Person)obj;
//        return this.name.equals(per.name)&&this.age==per.age;
//    }
//}
//public class Test{
//    public static void main(String[] args) {
//        Person per1=new Person("1",2)   ;
//
//        System.out.println(per1.equals(new Person("1",2)));
//    }
//}


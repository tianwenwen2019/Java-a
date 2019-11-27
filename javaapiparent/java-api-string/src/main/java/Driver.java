public class Driver {
    public static void main(String[] args) {
        Person p1=new Person("jack",18,'M');
        Person p2=new Person("jack",18,'M');
        System.out.println(p1.equals(p2));
        System.out.println(p1);
    }

}

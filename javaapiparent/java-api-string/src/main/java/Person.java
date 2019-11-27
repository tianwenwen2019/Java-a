public class Person {
    public Person(){}

    public Person(String name, int age, char gerden) {
        this.name = name;
        this.age = age;
        this.gerden = gerden;
    }

    private String name;
    private int age;
    private char gerden;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGerden() {
        return gerden;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
           Person p=(Person) obj ;
           return this.age==age?true:false;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.age+":"+this.name+":"+this.gerden;
    }
}

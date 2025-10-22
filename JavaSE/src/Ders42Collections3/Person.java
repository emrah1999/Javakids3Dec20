package Ders42Collections3;

public class Person implements Comparable<Person> {
    String name;

    int age;

    int countorder;

    public Person(String name, int age, int countorder) {
        this.name = name;
        this.age = age;
        this.countorder=countorder;
    }

    @Override
    public int compareTo(Person o) {
        return this.countorder-o.countorder;
    }
//    @Override
//    public int compareTo(Person o) {
//        return this.name.compareTo(o.name);
//    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + " ,countorder= " + countorder + "}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountorder() {
        return countorder;
    }

    public void setCountorder(int countorder) {
        this.countorder = countorder;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

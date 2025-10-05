package Elave10052025;

public class User {
    private String name;

    private Integer age;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(Integer age) {
        if(age<18){
            throw new RuntimeException("Yash 18den az ola bilmez");
        }
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

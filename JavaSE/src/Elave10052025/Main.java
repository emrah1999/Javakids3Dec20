package Elave10052025;

public class Main {
    public static void main(String[] args) {
        User user=new User();
        String name="ali";
        user.setName(name);
        try {
            user.setAge(15);
            System.out.println(user);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}

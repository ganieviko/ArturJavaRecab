package Day_40_Encapsulation;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
        user.setUserName("TechnoStudy");
        System.out.println(user.getUserName());
//        user.age = -10;
        user.setAge(10);
//        System.out.println(user.age);
        System.out.println(user.getAge());

        user.setUserPassword("Artur1389");
        System.out.println(user.getUserPassword());
    }
}

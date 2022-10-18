import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        User user = null;
        String name = "Nikita";
        User user2 = new User(1,"Nikita",new Salary(100.00));
        User user3 = new User(2,"Vanya",new Salary(100.00));
        User user4 = new User(3,"Stas",new Salary(100.00));
        User user5 = new User(3,"Stas",new Salary(100.00));

        Objects.hash(3,4,5);

        Set<User> userSet = new HashSet<>();
        userSet.add(user);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);


        for (User us : userSet) {
            System.out.println(us.toString());
        }
    }
}


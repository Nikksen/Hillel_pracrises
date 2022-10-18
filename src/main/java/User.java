import java.util.Objects;

public class User {
        private int id;
        private String name;
        private Salary salary;

        public User(int id, String name, Salary salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
        }

        @Override
        public boolean equals(Object o) {
                System.out.println("Equals called by User class");
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                User user = (User) o;
                return id == user.id &&
                         salary.equals(user.salary) &&
                        name.equals(user.name);
        }

        @Override
        public int hashCode() {
                System.out.println("hashCode called by User class");
                return Objects.hash(id, name, salary);
        }

        @Override
        public String toString() {
                return "User{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        ", salary=" + salary +
                        '}';
        }
}
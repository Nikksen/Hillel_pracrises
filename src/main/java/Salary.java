import java.util.Objects;

public class Salary {

    private double salary;

    public Salary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("equals  called by Salary");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary1 = (Salary) o;
        return Double.compare(salary1.salary, salary) == 0;
    }

    @Override
    public int hashCode() {
        System.out.println("hashCode called by Salary");
        return Objects.hash(salary);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "salary=" + salary +
                '}';
    }
}

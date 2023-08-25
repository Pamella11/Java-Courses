package InterfacesAndAbstraction.Exercise.MilitaryElite_06;

public class PrivateImpl extends SoldierImpl implements Private{
    private double salary;

    protected PrivateImpl(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }
}

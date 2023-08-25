package InterfacesAndAbstraction.Exercise.MilitaryElite_06;

import java.util.Set;

public class LieutenantGeneralImpl extends PrivateImpl implements LieutenantGeneral{
    private Set<Private> privates;

    protected LieutenantGeneralImpl(int id, String firstName, String lastName, double salary, Set<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = privates;
    }


    @Override
    public Set<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public void addPrivate(Private priv) {
        privates.add(priv);
    }
}

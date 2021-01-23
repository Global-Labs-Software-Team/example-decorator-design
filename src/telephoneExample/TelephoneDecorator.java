package telephoneExample;

public abstract class TelephoneDecorator implements TelephoneSpecification {
    public TelephoneSpecification telephone;

    public TelephoneDecorator(TelephoneSpecification telephone) {
        this.telephone = telephone;
    }

    @Override
    public String decorate() {
        return telephone.decorate();
    }
}

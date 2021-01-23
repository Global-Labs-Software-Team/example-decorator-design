package telephoneExample;

public class TelephoneWithCallerId extends TelephoneDecorator {
    
    public TelephoneWithCallerId(TelephoneSpecification telephone) {
        super(telephone);
    }

    @Override
    public String decorate() {
        return super.decorate() + callerIdFeature();
    }

    public String callerIdFeature() {
        return "My phone number is....";
    }
}

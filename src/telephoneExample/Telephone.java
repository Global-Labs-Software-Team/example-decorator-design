package telephoneExample;

public class Telephone implements TelephoneSpecification {
    
    @Override
    public String decorate() {
        return "Plain Telephone";
    }
}

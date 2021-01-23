package telephoneExample;

public class Testing {
    public static void main(String[] args) {
        Telephone plainPhone = new Telephone(); // I did not modify the code in the original phone
        System.out.println(plainPhone.decorate());
        TelephoneWithCallerId plainPhonePlusCallerId = new TelephoneWithCallerId(new Telephone());
        System.out.println(plainPhonePlusCallerId.callerIdFeature());
    }
}

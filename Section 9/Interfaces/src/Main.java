public class Main {

    public static void main(String[] args) {
        ITelephone batPhone;
        batPhone = new DeskPhone(1234567);
        batPhone.powerOn();
        batPhone.callPhone(1234567);
        batPhone.answer();

        System.out.println("===============================");

        batPhone = new MobilePhone(8675309);
        batPhone.powerOn();
        batPhone.callPhone(8675309);
        batPhone.answer();
    }
}

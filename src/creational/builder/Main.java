package creational.builder;

public class Main {
    public static void main(String[] args) {

        Phone.Builder builder = new Phone.Builder("16gb", "Android");
        builder.setBluetoothEnabled(true)
                .setTouchScreen(true);
        Phone phone = builder.build();

        System.out.println(phone.toString());
    }
}

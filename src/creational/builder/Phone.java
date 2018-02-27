package creational.builder;

public class Phone {
    private String ram;
    private String os;


    private boolean isTouchScreen;
    private boolean isWifiEnabled;
    private boolean isBluetoothEnabled;

    public Phone(Builder builder) {
        this.ram = builder.ram;
        this.os = builder.os;
        this.isTouchScreen = builder.isTouchScreen;
        this.isWifiEnabled = builder.isWifiEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "ram='" + ram + '\'' +
                ", os='" + os + '\'' +
                ", isTouchScreen=" + isTouchScreen +
                ", isWifiEnabled=" + isWifiEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class Builder {
        private String ram;
        private String os;
        private boolean isTouchScreen;
        private boolean isWifiEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String ram, String os) {
            this.ram = ram;
            this.os = os;
        }


        public Builder setTouchScreen(boolean touchScreen) {
            isTouchScreen = touchScreen;
            return this;
        }

        public Builder setWifiEnabled(boolean wifiEnabled) {
            isWifiEnabled = wifiEnabled;
            return this;
        }


        public Builder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Phone build() {
            return new Phone(this);
        }
    }
}

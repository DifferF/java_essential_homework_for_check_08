package homework_08.task_04;

/*
Задание 4+
Смотреть задание 2. Переопределить методы equals & hashCode в каждом классе.
Создать класс Main, в котором создать объекты классов и продемонстрировать переопределенные методы.
 */

public class Device {

   private String manufacturer;  // производитель
   private float price;  // цена
   private String serialNumber;  // серийный номер

    public Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }



    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    // переопределенный хэш-код(руками)
    @Override
    public int hashCode() {
        int i = 1;
        i = 681609170 + i;
        return i;
    }

    // перезаписываем метод equals
    @Override
    public boolean equals(Object obj) {
        // рефлективность
        if (this == obj) return true;
        //
        if (obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (this.manufacturer != device.manufacturer || this.price != device.price || this.serialNumber != device.serialNumber) return false;
        return true;
    }


}

class Monitor extends Device{

    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    // переопределенный хэш-код(руками)
    @Override
    public int hashCode() {
        int i = 2;
        i = 681609170 + i;
        return i;
    }



    // перезаписываем метод equals
    @Override
    public boolean equals(Object obj) {
        // рефлективность
        if (this == obj) return true;
        //
        if (obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (this.getManufacturer() != monitor.getManufacturer() || this.getPrice() != monitor.getPrice() || this.getSerialNumber() != monitor.getSerialNumber()|| this.resolutionX != monitor.resolutionX || this.resolutionY != monitor.resolutionY) return false;
        return true;
    }
}

class EthernetAdapter extends Device{

    private int speed;
    public String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    // переопределенный хэш-код(руками)
    @Override
    public int hashCode() {
        int i = 3;
        i = 681609170 + i;
        return i;
    }

    // перезаписываем метод equals
    @Override
    public boolean equals(Object obj) {
        // рефлективность
        if (this == obj) return true;
        //
        if (obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter eAdapter = (EthernetAdapter) obj;
        if (this.speed != eAdapter.speed || this.mac != eAdapter.mac) return false;
        return true;
    }


}

class Main{

    public static void main(String[] args) {

        EthernetAdapter eAdapter = new EthernetAdapter("LG",120,"sn_2435",200,"mac_0101");
        System.out.println(eAdapter.hashCode());
        EthernetAdapter eAdapter2 = new EthernetAdapter("LG",120,"sn_2435",200,"mac_0101");
        System.out.println(eAdapter2.hashCode());
        System.out.println( eAdapter.equals(eAdapter2));

        Monitor monitor1 =new Monitor("Samsung",120,"sn_8794",1280,920);
        System.out.println(monitor1.hashCode());
        Monitor monitor2 =new Monitor("Samsung",120,"sn_8794",1280,920);
        System.out.println(monitor2.hashCode());
        System.out.println( monitor1.equals(monitor2)  );

        Device device1 = new Device("Samsung",120,"sn_8794");
        System.out.println(device1.hashCode());
        Device device2 = new Device("Samsung",120,"sn_8794");
        System.out.println(device2.hashCode());
        System.out.println( device1.equals(device2)  );

    }
}

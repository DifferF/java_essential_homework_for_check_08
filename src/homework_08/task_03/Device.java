package homework_08.task_03;

/*
Задание 2+
Создать классы:
1) Основной класс Device (manufacturer(String), price(float), serialNumber(String));
2) Сабкалсс Monitor (resolutionX(int), resolutionY(int)) and EthernetAdapter (speed (int), mac (String));
Добавить методы доступа. Конструктор.
 */
/*
Задание 3+
Смотреть задание 2. В обоих классах переопределить метод toString,
что бы вывод был следующим: Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
 */

public class Device {

    protected String manufacturer;  // производитель
    protected float price;  // цена
    protected String serialNumber;  // серийный номер

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

    //Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    @Override
    public String toString() {
        return "Device : " +
                " manufacturer = " + manufacturer +
                " price = " + price +
                " serialNumber = " + serialNumber ;
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

    /*
    Смотреть задание 2. В обоих классах переопределить метод toString,
    что бы вывод был следующим: Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
     */
    @Override
    public String toString() {
        return "Monitor :" +
                " manufacturer = "+ manufacturer +
                " price = " + price +
                " serialNumber = " + serialNumber +
                " resolutionX = " + resolutionX +
                " resolutionY = " + resolutionY ;
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


}

class Main{

    /*
    Смотреть задание 2. В обоих классах переопределить метод toString,
    что бы вывод был следующим: Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
    Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280,Y=1024
     */

    public static void main(String[] args) {
        Device device = new Device("Samsung",120,"AB1234567CD");
        System.out.println(device.toString());
        Device monitor = new Monitor(device.getManufacturer(),device.getPrice(),device.getSerialNumber(),1280,1024);
        System.out.println( monitor.toString());

        System.out.println( monitor.getManufacturer());
    }
}

package HomeworksPro.homework1;

public class Phone {

    private int number;
    String model;
    double weight;

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    void receiveCall(){

        System.out.println( "Ivanov is calling. Phone number  " + getNumber());
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {

        Phone phone1 = new Phone(567583, "iPhone 8", 120);
        Phone phone2 = new Phone(987654, "iPhone 12", 110);
        Phone phone3 = new Phone(234567, "Pixel 5", 115);

        phone1.receiveCall();
        phone2.receiveCall();
        phone3.receiveCall();


    }
}

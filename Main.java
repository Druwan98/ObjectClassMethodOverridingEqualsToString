package Lessons.Exercise.ObjectClassMethodOverridingEqualsToString;

public class Main {
    public static void main(String[] args) {
        SmartphonePrice producer1 = new SmartphonePrice("Producer", 750.00);
        SmartphonePrice producer2 = new SmartphonePrice("Producer", 900.00);
        SmartphonePrice retail1 = new SmartphonePrice("Retail", 300.00);
        SmartphonePrice retail2 = new SmartphonePrice("Retail", 400.00);
        Smartphone samsung = new Smartphone("Samsung", "Galaxy S8", 2500, producer1, retail1);
        Smartphone iPhone = new Smartphone("Apple", "X", 2000, producer2, retail2);
        System.out.println(iPhone.toString()+"\n"+samsung.toString());

            try {
                Smartphone smartphoneClone = (Smartphone) iPhone.clone();
                System.out.println(smartphoneClone.toString());
                System.out.println(iPhone.equals(smartphoneClone));
            } catch (Exception exception) {
                System.out.println("Clone Error" + exception.getMessage());
                exception.printStackTrace();
            }




    }
}

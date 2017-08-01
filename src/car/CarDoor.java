package car;

/**
 * Created by stryzhs on 24.07.17.
 */
public class CarDoor {

    private static boolean doorIsOpen;
    private static boolean windowIsOpen;

    public CarDoor() {
        doorIsOpen = false;
        windowIsOpen = false;
    }

    public CarDoor(boolean doorIsOpen, boolean windowIsOpen) {
        this.doorIsOpen = doorIsOpen;
        this.windowIsOpen = windowIsOpen;
    }

    public static void openDoor(){
        doorIsOpen = true;
    }

    public static void closeDoor(){
        doorIsOpen = false;
    }

    public static void switchDoor(){
        if (doorIsOpen == true){
            closeDoor();
        }
        else {
            openDoor();
        }
    }

    public static void openWindow(){
        windowIsOpen = true;
    }

    public static void closeWindow(){
        windowIsOpen = false;
    }

    public static void switchWindow(){
        if (windowIsOpen == true){
            closeWindow();
        }
        else {
            openWindow();
        }
    }

    public static void objectInfo(){
        System.out.println("Объект - дверь");
        System.out.println("Дверь открыта: " + doorIsOpen);
        System.out.println("Окно открыто: " + windowIsOpen);
    }
}

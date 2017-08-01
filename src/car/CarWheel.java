package car;

/**
 * Created by stryzhs on 24.07.17.
 */
public class CarWheel {

    private static float wheelState;

    public CarWheel() {
        wheelState = 1;
    }

    public CarWheel(float wheelState) {
        if (wheelState > 1){
            wheelState = 1;
        }
        else if (wheelState < 0){
            wheelState = 0;
        }
        else {
            this.wheelState = wheelState;
        }
    }

    public static void putNewWheelOn(){
        wheelState = 1;
    }

    public static void eraseWheelForPercent(int percent){
        wheelState = wheelState * (1 - percent / 100);
    }

    public static float getWheelState() {
        return wheelState;
    }

    public static void objectInfo(){
        System.out.println("Объект - колесо");
        System.out.println("Состояние колеса (дробное число от 0-стерта до 1-новая): " + wheelState);
    }
}

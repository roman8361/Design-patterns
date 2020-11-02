package path02.homework02.entity;

public class Motor {

    String power;

    String typeMotor;

    public Motor(String power, String typeMotor) {
        this.power = power;
        this.typeMotor = typeMotor;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "power='" + power + '\'' +
                ", typeMotor='" + typeMotor + '\'' +
                '}';
    }

}

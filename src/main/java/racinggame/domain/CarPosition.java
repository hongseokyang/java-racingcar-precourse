package racinggame.domain;

public class CarPosition {
    private int position;

    public CarPosition() {
        this.position = 0;
    }

    public CarPosition(int position) {
        this.position = position;
    }

    public void moveForward() {
        position++;
    }

    public int compareTo(CarPosition position) {
        return toInteger(this.position).compareTo(toInteger(position.position));
    }

    public Integer toInteger(int number) {
        return (Integer) number;
    }

    public int getPosition() {
        return position;
    }
}

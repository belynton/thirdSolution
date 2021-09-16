import java.util.ArrayList;

public class Elevator {
    private ArrayList<Integer> elevators = new ArrayList();

    public Elevator(){
        elevators.add(1);
        elevators.add(2);
        elevators.add(3);
    }

    public void setElevatorsInfo(int elevatorNumber, int elevatorLevel){
        elevators.set(elevatorNumber-1, elevatorLevel);
    }

    public boolean isAnyElevatorOnFirstLevel(){
        return elevators.contains(1);
    }

    public int nearestElevator(int levelButton){
        int min = 9999;
        int fastestElevator = 0;
        for (int iter = 0; iter<3;iter++) {
            if (Math.abs(levelButton - elevators.get(iter))<min) {
                fastestElevator = iter;
                min = Math.abs(levelButton - elevators.get(iter));
            }
        }
        return fastestElevator+1;
    }

}

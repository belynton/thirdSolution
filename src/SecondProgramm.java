import java.util.Scanner;

public class SecondProgramm {

    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Задайте изначальное положение лифтов");
        System.out.print("Первый лифт: ");
        elevator.setElevatorsInfo(1, sc.nextInt());
        System.out.print("Второй лифт: ");
        elevator.setElevatorsInfo(2, sc.nextInt());
        System.out.print("Третий лифт: ");
        elevator.setElevatorsInfo(3, sc.nextInt());
        System.out.print("Задайте этаж, на который вызывают лифт: ");
        int calledLevel = sc.nextInt();

        if (!elevator.isAnyElevatorOnFirstLevel()) {
            elevator.setElevatorsInfo(1,1);
            System.out.println("Так как на 1 этаже нет лифтов, то первый отправляется туда");
        }

        System.out.println("Приедет лифт под номером " + elevator.nearestElevator(calledLevel));
    }

}

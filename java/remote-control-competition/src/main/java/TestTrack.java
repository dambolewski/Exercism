import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {

public static void race(RemoteControlCar car) {
    if(car != null)
        car.drive();
    }

    public static List<ProductionRemoteControlCar> getRankedCars(ProductionRemoteControlCar prc1,
                                                                 ProductionRemoteControlCar prc2) {
        List<ProductionRemoteControlCar> cars = new ArrayList<>();
        cars.add(prc1);
        cars.add(prc2);

        return cars.stream().sorted().collect(Collectors.toList());
    }

    public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> unsortedCars) {
        return unsortedCars.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}

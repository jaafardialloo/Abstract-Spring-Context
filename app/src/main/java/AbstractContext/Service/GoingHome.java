package AbstractContext.Service;

import AbstractContext.Interface.DriveTo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GoingHome {

    private final DriveTo driveToUsingCar;
    private final DriveTo driveToUsingPlan;

    public GoingHome(@Qualifier("DriverUsingCar") DriveTo driveToUsingCar,
                     @Qualifier("DriverUsingPlan") DriveTo driveToUsingPlan) {
        this.driveToUsingCar = driveToUsingCar;
        this.driveToUsingPlan = driveToUsingPlan;
    }

    public void getMsgUsingCar() {
       driveToUsingCar.driveToDestination();
    }

    public Double getSpeedUsingCar() {
        return driveToUsingCar.Speed();
    }
    public void getMsgUsingPlan() {
       driveToUsingPlan.driveToDestination();
    }

    public Double getSpeedUsingPlan() {
        return driveToUsingPlan.Speed();
    }


}

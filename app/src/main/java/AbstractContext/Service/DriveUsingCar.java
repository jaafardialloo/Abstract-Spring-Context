package AbstractContext.Service;

import AbstractContext.Interface.DriveTo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DriverUsingCar")
public class DriveUsingCar implements DriveTo {
    @Override
    public void driveToDestination() {
        System.out.println("I am driving home,using car");
    }

    @Override
    public Double Speed() {
        return 2341.9;
    }
}

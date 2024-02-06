package AbstractContext.Service;

import AbstractContext.Interface.DriveTo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("DriverUsingPlan")
public class DriveUsingPlan implements DriveTo {
    @Override
    public void driveToDestination() {
        System.out.println("I am driving home using Plan");
    }

    @Override
    public Double Speed() {
        return 123456.05;
    }
}

package guru.springframework.blog.openclosedprinciple;

/**
 * Created by developer on 2021-05-09.
 */
public class VehicleInsuranceSurveyor extends InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        /*Logic to validate vehicle insurance claims*/
        return true;
    }
}

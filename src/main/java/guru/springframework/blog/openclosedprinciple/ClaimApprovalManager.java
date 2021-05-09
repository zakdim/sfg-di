package guru.springframework.blog.openclosedprinciple;

/**
 * Created by developer on 2021-05-09.
 */
public class ClaimApprovalManager {
    public void processClaim(InsuranceSurveyor surveyor) {
        if(surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }
}

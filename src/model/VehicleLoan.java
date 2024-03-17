package model;

import enums.LoanType;
import enums.VehicleStatuType;

import java.math.BigDecimal;
import java.util.List;

public class VehicleLoan extends Loan {
    private LoanType vehicleLoan = LoanType.VEHICLE_LOAN;
    private List<Integer> instalmentOptions;
    private VehicleStatuType vehicleStatuType;
    private LoanType loanType;

    public VehicleLoan(BigDecimal amount, Integer installment, Double interestRate) {
        super(amount, installment, interestRate);
    }

    public List<Integer> getInstalmentOptions() {
        return instalmentOptions;
    }

    public void setInstalmentOptions(List<Integer> instalmentOptions) {
        this.instalmentOptions = instalmentOptions;
    }

    @Override
    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public VehicleStatuType getVehicleStatuType() {
        return vehicleStatuType;
    }

    public void setVehicleStatuType(VehicleStatuType vehicleStatuType) {
        this.vehicleStatuType = vehicleStatuType;
    }

    public LoanType getVehicleLoan() {
        return vehicleLoan;
    }

    public void setVehicleLoan(LoanType vehicleLoan) {
        this.vehicleLoan = vehicleLoan;
    }


}

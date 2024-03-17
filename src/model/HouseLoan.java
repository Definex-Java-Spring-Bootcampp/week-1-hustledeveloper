package model;

import enums.LoanType;

import java.math.BigDecimal;
import java.util.List;

public class HouseLoan extends Loan {
    private LoanType loanType;

    public HouseLoan(BigDecimal amount, Integer installment, Double interestRate, LoanType loanType) {
        super(amount, installment, interestRate);
        this.loanType = loanType;
    }

    private LoanType houseLoan = LoanType.HOUSE_LOAN;


    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

    public LoanType getHouseLoan() {
        return houseLoan;
    }

    public void setHouseLoan(LoanType houseLoan) {
        this.houseLoan = houseLoan;
    }

}

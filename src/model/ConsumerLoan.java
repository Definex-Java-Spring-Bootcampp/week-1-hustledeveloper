package model;

import enums.LoanType;

import java.math.BigDecimal;
import java.util.List;

public class ConsumerLoan extends Loan {
    private LoanType loanType;
    private List<Integer> instalmentOptions;

    public ConsumerLoan(BigDecimal amount, Integer installment, Double interestRate, LoanType loanType) {
        super(amount, installment, interestRate);
        this.loanType = loanType;
    }


    public List<Integer> getInstalmentOptions() {
        return instalmentOptions;
    }

    public void setInstalmentOptions(List<Integer> instalmentOptions) {
        this.instalmentOptions = instalmentOptions;
    }

    public LoanType getLoanType() {
        return loanType;
    }

    public void setLoanType(LoanType loanType) {
        this.loanType = loanType;
    }

}

package model;

import enums.LoanType;

import java.math.BigDecimal;
import java.util.List;

public class CreditCard implements Product {
    private String name;
    private BigDecimal fee;

    private BigDecimal limit;
    private LoanType loanType;

    private Bank bank;
    private List<Campaign> campaignList;

    public CreditCard(String name, BigDecimal fee, LoanType loanType) {
        this.name = name;
        this.fee = fee;
        this.loanType = loanType;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public BigDecimal getAmount() {
        return limit;
    }

    @Override
    public LoanType getLoanType() {
        return loanType;
    }

    @Override
    public void setBank(Bank bank) {
    }
    @Override
    public Bank getBank() {
        return bank;
    }

    public List<Campaign> getCampaignList() {
        return campaignList;
    }

    public void setCampaignList(List<Campaign> campaignList) {
        this.campaignList = campaignList;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "fee=" + fee +
                ", bank=" + bank +
                ", campaignList=" + campaignList +
                '}';
    }
}

import enums.ApplicationStatus;
import enums.LoanType;
import enums.SectorType;
import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

import static model.User.isEmailUnique;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();

        User user1 = new User("omer", "eren", "omer.eren.dev@gmail.com", "ppp1", "5397868333", true);
        if (isEmailUnique(user1.getEmail(), userList)) {
            userList.add(user1);
            System.out.println("The user record has been created successfully.");
        } else {
            System.out.println("This email address has been used before.");
        }
        User user2 = new User("omer", "faruk", "faruk@gmail.com", "ppp2", "5397868444", true);
        if (isEmailUnique(user2.getEmail(), userList)) {
            userList.add(user2);
            System.out.println("The user record has been created successfully.");
        } else {
            System.out.println("This email address has been used before.");
        }
        User user3 = new User("Cem", "Dırman", "cemdrman@gmail.com", "ppp3", "5397868624", true);
        if (isEmailUnique(user3.getEmail(), userList)) {
            userList.add(user3);
            System.out.println("The user record has been created successfully.");
        } else {
            System.out.println("This email address has been used before.");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------");
        Bank bank3 = Bank.getInstance();
        bank3.setName("AkBank");
        Bank bank1 = Bank.getInstance();
        bank1.setName("FinansBank");
        Bank bank2 = Bank.getInstance();
        bank2.setName("GarantiBank");


        Product consumerLoan1 = new ConsumerLoan(new BigDecimal("40000"), 10, 3.21, LoanType.CONSUMER_LOAN);
        consumerLoan1.setBank(bank1);
        Product consumerLoan2 = new ConsumerLoan(new BigDecimal("50000"), 16, 2.89, LoanType.CONSUMER_LOAN);
        consumerLoan2.setBank(bank1);
        Product consumerLoan3 = new ConsumerLoan(new BigDecimal("20000"), 8, 3.05, LoanType.CONSUMER_LOAN);
        consumerLoan3.setBank(bank2);
        Product consumerLoan4 = new ConsumerLoan(new BigDecimal("30000"), 18, 3.21, LoanType.CONSUMER_LOAN);
        consumerLoan4.setBank(bank2);
        Product consumerLoan5 = new ConsumerLoan(new BigDecimal("20000"), 12, 2.89, LoanType.CONSUMER_LOAN);
        consumerLoan5.setBank(bank3);
        Product consumerLoan6 = new ConsumerLoan(new BigDecimal("30000"), 24, 3.05, LoanType.CONSUMER_LOAN);
        consumerLoan6.setBank(bank3);

        Product houseLoan1 = new HouseLoan(new BigDecimal("600000"), 96, 2.04, LoanType.HOUSE_LOAN);
        houseLoan1.setBank(bank1);
        Product houseLoan2 = new HouseLoan(new BigDecimal("9000000"), 120, 1.99, LoanType.HOUSE_LOAN);
        houseLoan2.setBank(bank1);
        Product houseLoan3 = new HouseLoan(new BigDecimal("800000"), 120, 1.99, LoanType.HOUSE_LOAN);
        houseLoan3.setBank(bank2);
        Product houseLoan4 = new HouseLoan(new BigDecimal("1000000"), 180, 1.76, LoanType.HOUSE_LOAN);
        houseLoan4.setBank(bank2);
        Product houseLoan5 = new HouseLoan(new BigDecimal("800000"), 120, 2.01, LoanType.HOUSE_LOAN);
        houseLoan5.setBank(bank3);
        Product houseLoan6 = new HouseLoan(new BigDecimal("1000000"), 180, 1.98, LoanType.HOUSE_LOAN);
        houseLoan6.setBank(bank3);

        Product creditCard1 = new CreditCard("Bonus", new BigDecimal("150"), LoanType.CREDIT_CARD);
        creditCard1.setBank(bank2);
        Product creditCard2 = new CreditCard("Bonus Teen", new BigDecimal("0"), LoanType.CREDIT_CARD);
        creditCard2.setBank(bank2);
        Product creditCard3 = new CreditCard("CardFinans", new BigDecimal("100"), LoanType.CREDIT_CARD);
        creditCard3.setBank(bank1);
        Product creditCard5 = new CreditCard("Axess", new BigDecimal("0"), LoanType.CREDIT_CARD);
        creditCard5.setBank(bank3);
        Product creditCard6 = new CreditCard("Axess Retired", new BigDecimal("100"), LoanType.CREDIT_CARD);
        creditCard6.setBank(bank3);

        List<Product> bank1AllProducts = List.of(consumerLoan1, consumerLoan2, houseLoan1, houseLoan2, creditCard3);
        List<Product> bank2AllProducts = List.of(consumerLoan3, consumerLoan4, houseLoan3, houseLoan4, creditCard1, creditCard2);
        List<Product> bank3AllProducts = List.of(consumerLoan5, consumerLoan6, houseLoan5, houseLoan6, creditCard5, creditCard6);
        bank1.setBankProducts(bank1AllProducts);
        bank2.setBankProducts(bank2AllProducts);
        bank3.setBankProducts(bank3AllProducts);

        Campaign campaign1 = new Campaign("Bonus BigCampaign", "+5 installments possible", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        Campaign campaign2 = new Campaign("BonusTeen BigCampaign", "+5 installments possible and fee-free", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        Campaign campaign3 = new Campaign("CardFinans Campaign", "+3 installments possible for hotel reservations", LocalDate.of(2024, 6, 15), SectorType.TRAVELS);
        Campaign campaign4 = new Campaign("CardFinans BigCampaign for Trendyol ", "Up to +5 installments without interest", LocalDate.of(2024, 5, 30), SectorType.OTHERS);
        Campaign campaign5 = new Campaign("Axess Campaign", "Fee-free and cash advance opportunity", LocalDate.of(2024, 8, 30), SectorType.MARKET);
        Campaign campaign6 = new Campaign("Axess Campaign for Retirees", "Interest-free cash advance", LocalDate.of(2024, 12, 30), SectorType.MARKET);
        Campaign campaign7 = new Campaign("Bonus Card Campaign", "Fee-free cash advance", LocalDate.of(2024, 12, 30), SectorType.OTHERS);
        Campaign campaign8 = new Campaign("Bonus Card Campaign", "15% discount on cinema tickets", LocalDate.of(2024, 11, 30), SectorType.OTHERS);

        campaign1.setProduct(creditCard1);
        campaign2.setProduct(creditCard2);
        campaign3.setProduct(creditCard3);
        campaign4.setProduct(creditCard3);
        campaign5.setProduct(creditCard5);
        campaign6.setProduct(creditCard6);
        campaign7.setProduct(creditCard1);
        campaign8.setProduct(creditCard1);

        List<Campaign> allCampaigns = List.of(campaign1, campaign2, campaign3, campaign4, campaign5, campaign6, campaign7, campaign8);

        Application application1 = new Application(user1, LocalDateTime.of(2023, 12, 20, 13, 40), ApplicationStatus.INITIAL, consumerLoan1);
        Application application2 = new Application(user1, LocalDateTime.of(2024, 2, 25, 16, 45), ApplicationStatus.INITIAL, creditCard3);
        Application application3 = new Application(user2, LocalDateTime.of(2024, 2, 15, 17, 55), ApplicationStatus.INITIAL, consumerLoan4);
        Application application4 = new Application(user3, LocalDateTime.of(2024, 3, 1, 22, 34), ApplicationStatus.INITIAL, houseLoan3);
        Application application5 = new Application(user3, LocalDateTime.of(2024, 3, 9, 21, 21), ApplicationStatus.INITIAL, creditCard6);
        Application application6 = new Application(user2, LocalDateTime.of(2023, 12, 13, 13, 14), ApplicationStatus.INITIAL, creditCard1);
        Application application7 = new Application(user2, LocalDateTime.of(2024, 1, 3, 12, 30), ApplicationStatus.INITIAL, creditCard5);

        List<Application> userApplications = List.of(application1, application2, application3, application4, application5, application6, application7);
        User mostApplicantUser = getMostApplicationUser(userApplications);

        System.out.println("Name of the user who has most application count: " + mostApplicantUser.getName());
        System.out.println("------------------------------------------------------------------------------------------------------------");

        Map<User, BigDecimal> usersAndLoanApplicationsMap = getUsersAndLoanApplications(userApplications);
        Map<User, BigDecimal> maxLoanApplicationAndUserMap = getUserWithMaxLoanApplication(usersAndLoanApplicationsMap);
        maxLoanApplicationAndUserMap.forEach((key, value) -> {
            System.out.println("Name of the user has max amount loan application is : " + key.getName() + " , and loan application amount is: " + value);
        });

        List<Application> lastMonthApplications = getLastMonthApplications(userApplications);
        System.out.println("Applications within the last 1 month");

        for (Application application : lastMonthApplications) {
            System.out.println("User: " + application.getUser().getName() +
                    ", Date: " + application.getLocalDateTime() +
                    ", Status: " + application.getApplicationStatus() +
                    ", Product: " + application.getProduct().getLoanType());
        }

        List<String> sortedCreditCards = sortCreditCardsByCampaignCount(allCampaigns);
        System.out.println("Credit Cards and Campaign counts:");
        for (String creditCard : sortedCreditCards) {
            System.out.println(creditCard);
        }
        System.out.println("Applications of the user who has given email");

        List<Application> applicationOfGivenUser = getApplicationsOfUserByEmail("cemdrman@gmail.com", userApplications);
        for (Application application : applicationOfGivenUser) {
            if (!application.getProduct().getLoanType().equals(LoanType.CREDIT_CARD)) {
                System.out.println("Date: " + application.getLocalDateTime() +
                        ", Status: " + application.getApplicationStatus() +
                        ", Product: " + application.getProduct().getLoanType());
            } else {
                System.out.println("Date: " + application.getLocalDateTime() +
                        ", Status: " + application.getApplicationStatus() +
                        ", Product: " + application.getProduct().getName());
            }

        }
    }

    //  Question 3
    private static User getMostApplicationUser(List<Application> allApplications) {
        Map<User, Integer> applicationCountMap = new HashMap<>();

        for (Application application : allApplications) {
            User user = application.getUser();
            applicationCountMap.put(user, applicationCountMap.getOrDefault(user, 0) + 1);
        }

        User mostApplicationUser = null;
        int maxApplications = 0;

        for (Map.Entry<User, Integer> entry : applicationCountMap.entrySet()) {
            if (entry.getValue() > maxApplications) {
                maxApplications = entry.getValue();
                mostApplicationUser = entry.getKey();
            }
        }

        return mostApplicationUser;

    }

    //Question4
    private static Map<User, BigDecimal> getUsersAndLoanApplications(List<Application> allApplications) {
        Map<User, BigDecimal> loanAmountAndUserMap = new HashMap<>();
        List<Application> filteredList = allApplications.stream().filter(f -> !f.getProduct().getLoanType().equals(LoanType.CREDIT_CARD)).toList();
        for (Application application : filteredList) {
            User user = application.getUser();
            Product product = application.getProduct();
            loanAmountAndUserMap.put(user, product.getAmount());
        }
        return loanAmountAndUserMap;
    }

    private static Map<User, BigDecimal> getUserWithMaxLoanApplication(Map<User, BigDecimal> usersAndLoans) {
        User userWithMaxAmountLoanDemand = null;
        BigDecimal highestLoanAmount = BigDecimal.ZERO;
        Map<User, BigDecimal> userWithMaxAmountLoanDemandMap = new HashMap<>();
        for (Map.Entry<User, BigDecimal> entry : usersAndLoans.entrySet()) {
            if (entry.getValue().compareTo(highestLoanAmount) > 0) {
                highestLoanAmount = entry.getValue();
                userWithMaxAmountLoanDemand = entry.getKey();
            }
        }
        userWithMaxAmountLoanDemandMap.put(userWithMaxAmountLoanDemand, highestLoanAmount);
        return userWithMaxAmountLoanDemandMap;

    }

    //Question5
    private static List<Application> getLastMonthApplications(List<Application> allApplications) {
        LocalDateTime oneMonthAgo = LocalDateTime.now().minusMonths(1);
        List<Application> lastMonthApplications = new ArrayList<>();

        for (Application application : allApplications) {
            if (application.getLocalDateTime().isAfter(oneMonthAgo)) {
                lastMonthApplications.add(application);
            }
        }

        return lastMonthApplications;
    }

    //Question6
    private static List<String> sortCreditCardsByCampaignCount(List<Campaign> allCampaigns) {

        Map<String, Long> creditCardCampaignCount = allCampaigns.stream()
                .collect(Collectors.groupingBy(campaign -> campaign.getProduct().getName(),
                        Collectors.counting()));

        List<String> sortedCreditCards = creditCardCampaignCount.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue, Comparator.reverseOrder()))
                .map(entry -> entry.getKey() + " - Campaign count " + entry.getValue())
                .collect(Collectors.toList());

        return sortedCreditCards;
    }

    //Question7
    private static List<Application> getApplicationsOfUserByEmail(String email, List<Application> allApplications) {
        List<Application> applicationsOfUserList = new ArrayList<>();
        for (Application application : allApplications) {
            if (email.equals(application.getUser().getEmail())) {
                applicationsOfUserList.add(application);
            }
        }
        return applicationsOfUserList;
    }
}







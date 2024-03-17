package model;

import enums.ApplicationStatus;

import java.time.LocalDateTime;

public class Application {

    private User user;
    private LocalDateTime localDateTime;
    private ApplicationStatus applicationStatus;
    private Product product;


    public Application(User user, LocalDateTime localDateTime, ApplicationStatus applicationStatus, Product product) {
        this.user = user;
        this.localDateTime = localDateTime;
        this.applicationStatus = applicationStatus;
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Application{" +
                "user=" + user +
                ", localDateTime=" + localDateTime +
                ", applicationStatus=" + applicationStatus +
                '}';
    }
}

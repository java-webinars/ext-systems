package edu.javacourse.register.view;

import java.io.Serializable;
import java.time.LocalDate;

public class MarriageRequest implements Serializable
{
    private String husbandSurename;
    private String husbandGivenname;
    private String husbandPatronymic;
    private LocalDate husbandDateBirth;
    private String husbandPassportSeria;
    private String husbandPassportNumber;
    private LocalDate husbandPassportIssueDate;
    private String wifeSurename;
    private String wifeGivenname;
    private String wifePatronymic;
    private LocalDate wifeDateBirth;
    private String wifePassportSeria;
    private String wifePassportNumber;
    private LocalDate wifePassportIssueDate;

    private String marriageCertificateNumber;
    private LocalDate marriageCertificateDate;

    public String getHusbandSurename() {
        return husbandSurename;
    }

    public void setHusbandSurename(String husbandSurename) {
        this.husbandSurename = husbandSurename;
    }

    public String getHusbandGivenname() {
        return husbandGivenname;
    }

    public void setHusbandGivenname(String husbandGivenname) {
        this.husbandGivenname = husbandGivenname;
    }

    public String getHusbandPatronymic() {
        return husbandPatronymic;
    }

    public void setHusbandPatronymic(String husbandPatronymic) {
        this.husbandPatronymic = husbandPatronymic;
    }

    public LocalDate getHusbandDateBirth() {
        return husbandDateBirth;
    }

    public void setHusbandDateBirth(LocalDate husbandDateBirth) {
        this.husbandDateBirth = husbandDateBirth;
    }

    public String getHusbandPassportSeria() {
        return husbandPassportSeria;
    }

    public void setHusbandPassportSeria(String husbandPassportSeria) {
        this.husbandPassportSeria = husbandPassportSeria;
    }

    public String getHusbandPassportNumber() {
        return husbandPassportNumber;
    }

    public void setHusbandPassportNumber(String husbandPassportNumber) {
        this.husbandPassportNumber = husbandPassportNumber;
    }

    public LocalDate getHusbandPassportIssueDate() {
        return husbandPassportIssueDate;
    }

    public void setHusbandPassportIssueDate(LocalDate husbandPassportIssueDate) {
        this.husbandPassportIssueDate = husbandPassportIssueDate;
    }

    public String getWifeSurename() {
        return wifeSurename;
    }

    public void setWifeSurename(String wifeSurename) {
        this.wifeSurename = wifeSurename;
    }

    public String getWifeGivenname() {
        return wifeGivenname;
    }

    public void setWifeGivenname(String wifeGivenname) {
        this.wifeGivenname = wifeGivenname;
    }

    public String getWifePatronymic() {
        return wifePatronymic;
    }

    public void setWifePatronymic(String wifePatronymic) {
        this.wifePatronymic = wifePatronymic;
    }

    public LocalDate getWifeDateBirth() {
        return wifeDateBirth;
    }

    public void setWifeDateBirth(LocalDate wifeDateBirth) {
        this.wifeDateBirth = wifeDateBirth;
    }

    public String getWifePassportSeria() {
        return wifePassportSeria;
    }

    public void setWifePassportSeria(String wifePassportSeria) {
        this.wifePassportSeria = wifePassportSeria;
    }

    public String getWifePassportNumber() {
        return wifePassportNumber;
    }

    public void setWifePassportNumber(String wifePassportNumber) {
        this.wifePassportNumber = wifePassportNumber;
    }

    public LocalDate getWifePassportIssueDate() {
        return wifePassportIssueDate;
    }

    public void setWifePassportIssueDate(LocalDate wifePassportIssueDate) {
        this.wifePassportIssueDate = wifePassportIssueDate;
    }

    public String getMarriageCertificateNumber() {
        return marriageCertificateNumber;
    }

    public void setMarriageCertificateNumber(String marriageCertificateNumber) {
        this.marriageCertificateNumber = marriageCertificateNumber;
    }

    public LocalDate getMarriageCertificateDate() {
        return marriageCertificateDate;
    }

    public void setMarriageCertificateDate(LocalDate marriageCertificateDate) {
        this.marriageCertificateDate = marriageCertificateDate;
    }
}

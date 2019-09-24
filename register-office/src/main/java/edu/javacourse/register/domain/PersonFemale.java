package edu.javacourse.register.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.List;

@Entity
@DiscriminatorValue("1")
public class PersonFemale extends Person
{
//    private List<MarriageCertificate> marriageCertificates;
//    private List<BirthCertificate> birthCertificates;
//
//    public List<MarriageCertificate> getMarriageCertificates() {
//        return marriageCertificates;
//    }
//
//    public void setMarriageCertificates(List<MarriageCertificate> marriageCertificates) {
//        this.marriageCertificates = marriageCertificates;
//    }
//
//    public List<BirthCertificate> getBirthCertificates() {
//        return birthCertificates;
//    }
//
//    public void setBirthCertificates(List<BirthCertificate> birthCertificates) {
//        this.birthCertificates = birthCertificates;
//    }
}

package org.example.job;

import jakarta.persistence.*;

@Entity
@Table
public class Job {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Column
    private String company;

    @Column
    private String position;

    @Column
    private String status;

    @Column
    private String notes;

    @Column
    private String referral;

    @Column
    private int recruiterId;

    @Column
    private int hiringManagerId;

    public int getId() {
        return id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getReferral() {
        return referral;
    }

    public void setReferral(String referral) {
        this.referral = referral;
    }

    public int getRecruiterId() {
        return recruiterId;
    }

    public void setRecruiterId(int recruiterId) {
        this.recruiterId = recruiterId;
    }

    public int getHiringManagerId() {
        return hiringManagerId;
    }

    public void setHiringManagerId(int hiringManagerId) {
        this.hiringManagerId = hiringManagerId;
    }
}

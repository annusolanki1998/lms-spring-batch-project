package com.bridgelabz.lmsspringbatchproject.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table
@Entity
public class Candidates {
    @Id
    private Long id;
    private String cicId;
    private String fullName;
    private String email;
    private String mobileNumber;
    private String hiredDate;
    private String degree;
    private Double aggrPer;
    private String city;
    private String state;
    private String preferredJobLocation;
    private String status;
    private String passedOutYear;
    private String creatorUser;
    private String candidateStatus;
}

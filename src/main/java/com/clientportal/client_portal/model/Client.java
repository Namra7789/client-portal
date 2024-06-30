package com.clientportal.client_portal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "clients")
public class Client {

    @Id
    private String id;
    private String employeeName;
    private String poStatus;
    private double salary;
    private double performanceBonus;
    private double ctc;
    private double monthlyBilling;
    private double monthlyMargin;
    private String team;
    private String poNo;
    private LocalDate poDate;
    private double poValue;
    private LocalDate poStart;
    private LocalDate poEnd;

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getPoStatus() {
        return poStatus;
    }

    public void setPoStatus(String poStatus) {
        this.poStatus = poStatus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getPerformanceBonus() {
        return performanceBonus;
    }

    public void setPerformanceBonus(double performanceBonus) {
        this.performanceBonus = performanceBonus;
    }

    public double getCtc() {
        return ctc;
    }

    public void setCtc(double ctc) {
        this.ctc = ctc;
    }

    public double getMonthlyBilling() {
        return monthlyBilling;
    }

    public void setMonthlyBilling(double monthlyBilling) {
        this.monthlyBilling = monthlyBilling;
    }

    public double getMonthlyMargin() {
        return monthlyMargin;
    }

    public void setMonthlyMargin(double monthlyMargin) {
        this.monthlyMargin = monthlyMargin;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public LocalDate getPoDate() {
        return poDate;
    }

    public void setPoDate(LocalDate poDate) {
        this.poDate = poDate;
    }

    public double getPoValue() {
        return poValue;
    }

    public void setPoValue(double poValue) {
        this.poValue = poValue;
    }

    public LocalDate getPoStart() {
        return poStart;
    }

    public void setPoStart(LocalDate poStart) {
        this.poStart = poStart;
    }

    public LocalDate getPoEnd() {
        return poEnd;
    }

    public void setPoEnd(LocalDate poEnd) {
        this.poEnd = poEnd;
    }
}
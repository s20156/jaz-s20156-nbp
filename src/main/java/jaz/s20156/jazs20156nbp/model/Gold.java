package jaz.s20156.jazs20156nbp.model;

import jaz.s20156.jazs20156nbp.utils.MetalType;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="gold")
public class Gold {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String startDate;
    private String endDate;
    @Enumerated(EnumType.STRING)
    private MetalType metalType;
    private Float course;
    private Date requestDate;

    public Gold(Long id, String startDate, String endDate, MetalType metalType, Float course, Date requestDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.metalType = metalType;
        this.course = course;
        this.requestDate = requestDate;
    }

    public Gold(String startDate, String endDate, MetalType metalType, Float course, Date requestDate) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.metalType = metalType;
        this.course = course;
        this.requestDate = requestDate;
    }

    public Gold() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public MetalType getMetalType() {
        return metalType;
    }

    public void setMetalType(MetalType metalType) {
        this.metalType = metalType;
    }

    public Float getCourse() {
        return course;
    }

    public void setCourse(Float course) {
        this.course = course;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }
}

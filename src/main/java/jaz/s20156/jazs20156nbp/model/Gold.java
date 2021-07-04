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
    private Date startDate;
    private Date endDate;
    @Enumerated(EnumType.STRING)
    private MetalType metalType;
    private Float course;
    private Date requestDate;

    public Gold(Long id, Date startDate, Date endDate, MetalType metalType, Float course, Date requestDate) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.metalType = metalType;
        this.course = course;
        this.requestDate = requestDate;
    }

    public Gold(Date startDate, Date endDate, MetalType metalType, Float course, Date requestDate) {
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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

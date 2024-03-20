package br.com.surb.surbeventos.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Activity implements Serializable {

    @Serial
    private static final long serialVersionUID = -6540400649218654723L;

    private Long activityId;
    private String name;
    private String description;
    private Double price;

    public Activity() {
    }

    public Activity(Long activityId, String name, String description, Double price) {
        this.activityId = activityId;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Activity activity = (Activity) object;
        return Objects.equals(activityId, activity.activityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activityId);
    }
}

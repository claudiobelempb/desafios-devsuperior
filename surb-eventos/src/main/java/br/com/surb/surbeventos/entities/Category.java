package br.com.surb.surbeventos.entities;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable {

    @Serial
    private static final long serialVersionUID = -9001302800575276826L;

    private Long categoryId;
    private String description;

    public Category() {
    }

    public Category(Long categoryId, String description) {
        this.categoryId = categoryId;
        this.description = description;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Category category = (Category) object;
        return Objects.equals(categoryId, category.categoryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryId);
    }
}

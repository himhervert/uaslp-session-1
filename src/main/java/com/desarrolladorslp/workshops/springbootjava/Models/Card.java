package com.desarrolladorslp.workshops.springbootjava.Models;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @javax.persistence.Column(length = 500)
    private String description;

    @ManyToOne
    @JoinColumn(name = "column_id")
    private Column column;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Column getColumn() {
        return column;
    }

    public void setColumn(Column column) {
        this.column = column;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", column=" + column +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return id == card.id &&
                Objects.equals(description, card.description) &&
                Objects.equals(column, card.column);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, column);
    }
}

package com.desarrolladorslp.workshops.springbootjava.Models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "columns")
public class Column {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @javax.persistence.Column(length = 300)
    private String name;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Column{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", board=" + board +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Column column = (Column) o;
        return id == column.id &&
                Objects.equals(name, column.name) &&
                Objects.equals(board, column.board);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, board);
    }
}

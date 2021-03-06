package com.hometask.montyhall.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    private Game game;
    @NotNull
    private Boolean opened;
    @NotNull
    private Boolean winning;
    @NotNull
    private Boolean picked;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Boolean getOpened() {
        return opened;
    }

    public void setOpened(Boolean opened) {
        this.opened = opened;
    }

    public Boolean getWinning() {
        return winning;
    }

    public void setWinning(Boolean winning) {
        this.winning = winning;
    }

    public Boolean getPicked() {
        return picked;
    }

    public void setPicked(Boolean picked) {
        this.picked = picked;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", game=" + game +
                ", opened=" + opened +
                ", winning=" + winning +
                ", picked=" + picked +
                '}';
    }
}

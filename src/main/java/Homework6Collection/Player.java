package Homework6Collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Player {

    private int id;
    private String nickname;
    private boolean isOnline;
    private int points;

    public void addPoint(int id, int points) {
        this.points = points;
    }

    public Player(int id, String nickname, boolean isOnline) {
        this.id = id;
        this.nickname = nickname;
        this.isOnline = isOnline;
        this.points = points;
    }

    public int getId() {
        return id;
    }

    public String getNickname() {

        return nickname;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Player player = (Player) o;
        return id == player.id && isOnline == player.isOnline && Objects.equals(nickname,
            player.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nickname, isOnline);
    }

    @Override
    public String toString() {
        return "Player{" +
            "id=" + id +
            ", nicname='" + nickname + '\'' +
            ", isOnline=" + isOnline +
            '}';
    }

    public int score() {

        return 0;
    }

    public int getPoints() {
        return points;
    }
}

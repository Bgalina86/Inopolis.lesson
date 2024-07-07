package HomeworkTest8File;


import Homework8.Player;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;
import java.util.Objects;


@XmlRootElement(name="playerlist")
@XmlAccessorType(XmlAccessType.FIELD)
public class Players {


    @XmlElement(name="player")
        private List<Homework8.Player> playerList;

    public Players(List<Homework8.Player> playerList) {
        this.playerList = playerList;
    }

    public Players() {
    }

    public List<Homework8.Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Players players = (Players) o;
        return Objects.equals(playerList, players.playerList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerList);
    }

    @Override
    public String toString() {
        return "Players{" +
            "playerList=" + playerList +
            '}';
    }
}

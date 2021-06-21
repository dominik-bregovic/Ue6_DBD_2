

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
@Entity
public class Team {
    @Id
    @Column
    int teamId;
    @Column
    String name;
    List<Player> playerList;
    @Column
    Trainer trainer;


    public Team(){

    }

    public Team(String name){
        this.name = name;
    }


    public int getTeamId() {
        return teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Player> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<Player> playerList) {
        this.playerList = playerList;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void addPlayer(Player player){
        playerList.add(player);
    }

}

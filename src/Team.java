

import javax.persistence.*;
import java.util.List;
@Entity
public class Team implements ISaveAndDelete{
    @Id @GeneratedValue
    @Column(name = "team_id", length = 11, nullable = false, unique = true)
    private int teamId;
    @Column(length = 40)
    private String name;
    @OneToMany
    private List<Player> playerList;
    @OneToOne
    private Trainer trainer;


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

    @Override
    public boolean saveToDB() {
        return false;
    }

    @Override
    public void deleteFromDB() {

    }
}



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Player {
    @Id
    @Column
    int playerId;
    @Column
    String name;
    @Column
    int age;
    @Column
    Team team;

    public Player(){

    }
    public Player(String name, int age, Team team){
        this.name = name;
        this.age = age;
        this.team = team;
    }


    public int getPlayerId() {
        return playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}

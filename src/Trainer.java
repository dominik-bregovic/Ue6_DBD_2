
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Trainer {
    @Id
    @Column
    int trainerId;
    @Column
    String name;
    @Column
    Team team;

    public Trainer(){

    }
    public Trainer(String name, Team team){
        this.name = name;
        this.team = team;
    }

    public int getTrainerId() {
        return trainerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

}

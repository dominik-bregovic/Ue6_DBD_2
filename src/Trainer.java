
import javax.persistence.*;

@Entity
public class Trainer implements ISaveAndDelete{
    @Id @GeneratedValue
    @Column(name = "trainer_id", length = 11, nullable = false, unique = true)
    private int trainerId;
    @Column(length = 40)
    private String name;
    @OneToOne
    private Team team;

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

    @Override
    public boolean saveToDB() {
        return false;
    }

    @Override
    public void deleteFromDB() {

    }
}

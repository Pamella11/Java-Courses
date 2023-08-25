package Encapsulation.Exercise.FootballTeamGenerator_05;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    private void setName(String name) {
        //•	A name cannot be null, empty, or white space. If not, print: "A name should not be empty."
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public void removePlayer(String playerName){
        players.removeIf(player -> player.getName().equals(playerName));
    }

    public double getRating(){
        return players.stream().mapToDouble(Player::overallSkillLevel).sum();
    }
}

package Encapsulation.Exercise.FootballTeamGenerator_05;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Team> teams = new HashMap<>();
        Map<String, Player> players = new HashMap<>();

        while (!command.equals("END")) {

            String[] tokens = command.split(";");
            String teamName = tokens[1];

            switch (tokens[0]) {
                case "Team":
                    Team team = new Team(teamName);
                    teams.putIfAbsent(teamName, team);
                    break;
                case "Add":
                    String playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);

                    Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);

                    players.putIfAbsent(playerName, player);

                    if (!teams.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.%n", teamName);
                    } else {
                        Team team1 = teams.get(teamName);
                        team1.addPlayer(player);
                    }
                    break;
                case "Remove":
                    String playerName1 = tokens[2];

                    if (players.containsKey(playerName1)) {
                        Player player1 = players.get(playerName1);
                        Team team1 = teams.get(teamName);
                        if (team1.getPlayers().contains(player1)){
                            team1.removePlayer(playerName1);
                        } else {
                            System.out.printf("Player %s is not in %s team.%n", playerName1, teamName);
                        }
                    }
                    break;
                case "Rating":
                    if (!teams.containsKey(teamName)) {
                        System.out.printf("Team %s does not exist.", teamName);
                    } else {
                        Team team1 = teams.get(teamName);
                        System.out.println(teamName + " - " + Math.round(team1.getRating()));
                    }
                    break;
            }

            command = scanner.nextLine();
        }

    }
}

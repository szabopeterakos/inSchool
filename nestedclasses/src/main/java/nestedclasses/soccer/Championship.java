package nestedclasses.soccer;

import java.util.ArrayList;
import java.util.List;

public class Championship {

    private List<TeamStatistics> statistics = new ArrayList<>();

    public List<TeamStatistics> getLeagueTable() {
        return statistics;
    }

    //NOT YET//
    public void addGame(GameResult result) {
        createTeams(result);
        findTeam(result.teamHome).played(result.goalHome, result.goalGuest);
        findTeam(result.teamGuest).played(result.goalGuest, result.goalHome);

    }

    private TeamStatistics findTeam(String teamName) { // !!
        TeamStatistics teamStatistics = null;
        for (TeamStatistics stats : statistics) {
            if (stats.getTeamName().equalsIgnoreCase(teamName)) {
                teamStatistics = stats;
            }
        }
        return teamStatistics;
    }


    private void createTeams(GameResult result) {
        if (!itHas(result.teamHome)) {
            statistics.add(new TeamStatistics(result.teamHome));
        }
        if (!itHas(result.teamGuest)) {
            statistics.add(new TeamStatistics(result.teamGuest));
        }
    }

    private boolean itHas(String name) {
        for (TeamStatistics c : statistics) {
            if (c.getTeamName().equals(name)) {
                return true;
            }
        }
        return false;
    }


    public static class GameResult {
        private String teamHome;
        private String teamGuest;
        private int goalHome;
        private int goalGuest;

        public GameResult(String teamHome, String teamGuest, int goalHome, int goalGuest) {
            this.teamHome = teamHome;
            this.teamGuest = teamGuest;
            this.goalHome = goalHome;
            this.goalGuest = goalGuest;
        }
    }

}

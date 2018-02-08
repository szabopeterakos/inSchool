package nestedclasses.soccer;

public class TeamStatistics {

    private String teamName;
    private int played;             //lejátszott meccsek száma
    private int won;
    private int tied;               //győzelem, döntetlen, vereség
    private int lost;
    private int goalsFor;           //rúgott gólok
    private int goalsAgainst;       //kapott gólok
    private int points;

    public TeamStatistics(String teamName) {
        this.teamName = teamName;
    }

    public void played(int $GoalsFor, int $GoalsAgainst) {
        played++;

        if ($GoalsFor > $GoalsAgainst) {
            won++;
            points += 3;
        } else if ($GoalsFor < $GoalsAgainst) {
            lost++;
        } else {
            tied++;
            points += 1;
        }

        goalsFor += $GoalsFor;
        goalsAgainst += $GoalsAgainst;
    }


    public String getTeamName() {
        return teamName;
    }

    public int getPlayed() {
        return played;
    }

    public int getWon() {
        return won;
    }

    public int getTied() {
        return tied;
    }

    public int getLost() {
        return lost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeamStatistics that = (TeamStatistics) o;

        return teamName != null ? teamName.equals(that.teamName) : that.teamName == null;
    }

    @Override
    public int hashCode() {
        return teamName != null ? teamName.hashCode() : 0;
    }
}

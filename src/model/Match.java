package model;

public class Match {

    private String id;
    private String season;
    private String city;
    private String date;
    private String team1;
    private String team2;
    private String winner;


    public Match(String id, String season, String city,
                 String date, String team1, String team2, String winner ){

        this.id = id;
        this.season = season;
        this.city = city;
        this.date = date;
        this.team1 = team1;
        this.team2 = team2;
        this.winner= winner;
    }

    public String getId(){ return id; }
    public String getSeason(){
        return season;
    }

    public String getTeam1(){
        return team1;
    }

    public String getTeam2(){
        return team2;
    }

    public String getWinner(){
        return winner;
    }

}

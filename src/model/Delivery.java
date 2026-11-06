package model;

public class Delivery {

    private String matchId;
    private String bowlingTeam;
    private String extraRuns;
    private String bowler;
    private String totalRuns;
    private String wideRuns;
    private String noBallRuns;
    private String byeRuns;
    private String legByeRuns;
    private String penaltyRuns;
    private String batsman;
    private String batsmanRuns;

    public Delivery( String matchId,
                     String bowlingTeam, String extraRuns,
                     String bowler, String totalRuns, String wideRuns,
                     String noBallRuns, String byeRuns, String legByeRuns,
                     String penaltyRuns, String batsman, String batsmanRuns
                     ) {

        this.matchId = matchId;
        this.bowlingTeam = bowlingTeam;
        this.extraRuns = extraRuns;
        this.bowler = bowler;
        this.totalRuns = totalRuns;
        this.wideRuns = wideRuns;
        this.noBallRuns = noBallRuns;
        this.byeRuns = byeRuns;
        this.legByeRuns= legByeRuns;
        this.penaltyRuns = penaltyRuns;
        this.batsman = batsman;
        this.batsmanRuns = batsmanRuns;

    }

    public String getMatchId(){
        return matchId;
    }

    public String getBowlingTeam(){
        return bowlingTeam;
    }

    public String getExtraRuns(){
        return extraRuns;
    }


    public String getBowler() {
        return bowler;
    }

    public String getTotalRuns() {
        return totalRuns;
    }

    public String getWideRuns() {
        return wideRuns;
    }

    public String getNoBallRuns() {
        return noBallRuns;
    }

    public String getByeRuns() {
        return byeRuns;
    }

    public String getLegByeRuns() {
        return legByeRuns;
    }

    public String getPenaltyRuns() {
        return penaltyRuns;
    }
    public String getBatsman() {
        return batsman;
    }

    public String getBatsmanRuns() {
        return batsmanRuns;
    }


}

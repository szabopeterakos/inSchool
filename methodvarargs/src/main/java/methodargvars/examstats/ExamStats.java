package methodargvars.examstats;

import sun.applet.AppletIllegalArgumentException;

public class ExamStats {

    private int maxPoints;

    public ExamStats(int maxPoints) {
        this.maxPoints = maxPoints;
    }

    public int getNumberOfTopGrades(int limitInPercent, int... results){
        if(results == null|| results.length < 1){
            throw new AppletIllegalArgumentException("Number of results must not be empty!");
        }
        int res = 0;
        for(int current :results){
            if(current > limitInPercent){
                res++;
            }
        }

        return res;
    }

    public boolean hasAnyFailed(int limitInPercent, int... results){
        if(results == null|| results.length < 1){
            throw new AppletIllegalArgumentException("Number of results must not be empty!");
        }
        boolean res = false;
        for(int current :results){
            if(current < limitInPercent){
                res = true;
                break;
            }
        }

        return res;
    }
}

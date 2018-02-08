package activity;

import java.util.ArrayList;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getFullElevation() {

        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double actElevation = trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            if (actElevation > 0) {
                sum += actElevation;
            }
        }

        return sum;
    }

    public double getFullDecrease() {
        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double actElevation = trackPoints.get(i + 1).getElevation() - trackPoints.get(i).getElevation();
            if (actElevation < 0) {
                sum += actElevation;
            }
        }

        return Math.abs(sum);
    }

    public double getDistance() {
        double sum = 0;
        for (int i = 0; i < trackPoints.size() - 1; i++) {
            double actDistance = trackPoints.get(i + 1).getDistanceFrom(trackPoints.get(i));

            sum += actDistance;

        }

        return sum;
    }


    public Coordinate findMaximumCoordinate() {
        double max = trackPoints.get(0).getCoordinate().getLatitude();
        double max2 = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 1; i < trackPoints.size(); i++) {
            if(trackPoints.get(i).getCoordinate().getLatitude() > max){
                max = trackPoints.get(i).getCoordinate().getLatitude();
            }
            if(trackPoints.get(i).getCoordinate().getLongitude() > max2){
                max2 = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }

        return new Coordinate(max,max2);
    }

    public Coordinate findMinimumCoordinate() {
        double max = trackPoints.get(0).getCoordinate().getLatitude();
        double max2 = trackPoints.get(0).getCoordinate().getLongitude();
        for (int i = 0; i < trackPoints.size(); i++) {
            if(trackPoints.get(i).getCoordinate().getLatitude() < max){
                max = trackPoints.get(i).getCoordinate().getLatitude();
            }
            if(trackPoints.get(i).getCoordinate().getLongitude() < max2){
                max2 = trackPoints.get(i).getCoordinate().getLongitude();
            }
        }

        return new Coordinate(max,max2);
    }


    public double getRectangleArea() {
        double a = findMaximumCoordinate().getLatitude() - findMinimumCoordinate().getLatitude();
        double b = findMaximumCoordinate().getLongitude() -findMinimumCoordinate().getLongitude();
        return a*b;
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

}

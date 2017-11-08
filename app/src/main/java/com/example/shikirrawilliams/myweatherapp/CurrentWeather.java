package com.example.shikirrawilliams.myweatherapp;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by ShikirraWilliams on 11/7/17.
 */

public class CurrentWeather {
    private String Icon;
    private long Time;
    private double Temperature;
    private double Humidity;
    private double chanceOfPrecipiatation;
    private String Summary;
    private String Timezone;


    public String getIcon() {
        return Icon;
    }

    public void setIcon(String icon) {
        Icon = icon;
    }

    public int getIconId(){
        int iconId = R.drawable.clear_day;

        if(Icon.equals("clear-day")){
            iconId = R.drawable.clear_day;
        } else if (Icon.equals("clear-night")){
            iconId = R.drawable.clear_night;
        } else if (Icon.equals("rain")) {
            iconId = R.drawable.rain;
        }
        else if (Icon.equals("snow")) {
            iconId = R.drawable.snow;
        }
        else if (Icon.equals("sleet")) {
            iconId = R.drawable.sleet;
        }
        else if (Icon.equals("wind")) {
            iconId = R.drawable.wind;
        }
        else if (Icon.equals("fog")) {
            iconId = R.drawable.fog;
        }
        else if (Icon.equals("cloudy")) {
            iconId = R.drawable.cloudy;
        }
        else if (Icon.equals("partly-cloudy-day")) {
            iconId = R.drawable.partly_cloudy;
        }
        else if (Icon.equals("partly-cloudy-night")) {
            iconId = R.drawable.cloudy_night;
        }

        return iconId;
    }

    public long getTime() {
        return Time;
    }

    public String getTimezone() {
        return Timezone;
    }

    public void setTimezone(String timezone) {
        Timezone = timezone;
    }

    public void setTime(long time) {
        Time = time;
    }

    public String getFormattedTime (){
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimezone()));
        Date datetime = new Date(getTime() * 1000);
        String timeString = formatter.format(datetime);

        return timeString;
    }

    public double getHumidity() {
        return Humidity;
    }

    public void setHumidity(double humidity) {
        Humidity = humidity;
    }

    public int getTemperature() {
        return (int) Math.round(Temperature);
    }

    public void setTemperature(double temperature) {
        Temperature = temperature;
    }

    public int getChanceOfPrecipiatation() {
        double precipipationPercentage = chanceOfPrecipiatation * 100;
        return (int)Math.round(precipipationPercentage);
    }

    public void setChanceOfPrecipiatation(double chanceOfPrecipiatation) {
        this.chanceOfPrecipiatation = chanceOfPrecipiatation;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String summary) {
        Summary = summary;
    }
}



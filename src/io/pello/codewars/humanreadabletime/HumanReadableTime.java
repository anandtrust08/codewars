package io.pello.codewars.humanreadabletime;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds%3600) / 60;
        seconds = seconds - (minutes*60) - (hours * 3600);
        return String.format("%02d:%02d:%02d",hours,minutes,seconds);
      }
}

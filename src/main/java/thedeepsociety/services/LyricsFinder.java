package thedeepsociety.services;

public interface LyricsFinder {
    Lyrics find(String artist, String track);
    String getName();
}
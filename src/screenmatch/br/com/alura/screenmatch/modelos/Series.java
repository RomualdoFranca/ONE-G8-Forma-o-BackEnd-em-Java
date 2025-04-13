package screenmatch.br.com.alura.screenmatch.modelos;

public class Series extends Title{
    private int seasonCount;
    private boolean isAvailableOnStream;
    private int episodesPerSeason;
    private int episodeDurationMinutes;

    public int getSeasonCount() {
        return seasonCount;
    }

    public void setSeasonCount(int seasonCount) {

        this.seasonCount = seasonCount;
    }

    public boolean isAvailableOnStream() {

        return isAvailableOnStream;
    }

    public void setAvailableOnStream(boolean availableOnStream) {

        isAvailableOnStream = availableOnStream;
    }

    public int getEpisodesPerSeason() {

        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {

        this.episodesPerSeason = episodesPerSeason;
    }

    public int getEpisodeDurationMinutes() {

        return episodeDurationMinutes;
    }

    public void setEpisodeDurationMinutes(int episodeDurationMinutes) {
        this.episodeDurationMinutes = episodeDurationMinutes;
    }

    @Override
    public int getRunTimeMinutes() {

        return seasonCount * episodesPerSeason * episodeDurationMinutes;
    }
}

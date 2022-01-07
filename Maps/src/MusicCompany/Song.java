package MusicCompany;

public class Song {
    // Песните, от своя страна се описват с име и времетраене.
    private String name;
    private String timeDuration;

    public Song(String name, String timeDuration) {
        this.name = name;
        this.timeDuration = timeDuration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimeDuration() {
        return timeDuration;
    }

    public void setTimeDuration(String timeDuration) {
        this.timeDuration = timeDuration;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", timeDuration: " + timeDuration;
    }
}

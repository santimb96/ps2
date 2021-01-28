package org.ps2;

public class Ps2 {
    private String name;
    private Integer year;
    private String platform;

    public Ps2(String name, Integer year, String platform) {
        setName(name);
        setYear(year);
        setPlatform(platform);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
}

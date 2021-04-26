package com.han.CSV;

public class Country {
    private String startIp;
    private String endIp;
    private String startCode;
    private String endCode;
    private String countryCode;
    private String countryName;

    public Country() {
    }

    public Country(String startIp, String endIp, String startCode, String endCode, String countryCode, String countryName) {
        this.startIp = startIp;
        this.endIp = endIp;
        this.startCode = startCode;
        this.endCode = endCode;
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public String getStartIp() {
        return startIp;
    }

    public String getEndIp() {
        return endIp;
    }

    public String getStartCode() {
        return startCode;
    }

    public String getEndCode() {
        return endCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    @Override
    public String toString() {
        return "Country [" +
                "startIp ='" + startIp + '\'' +
                ", endIp ='" + endIp + '\'' +
                ", startCode ='" + startCode + '\'' +
                ", endCode ='" + endCode + '\'' +
                ", countryCode ='" + countryCode + '\'' +
                ", countryName ='" + countryName + '\'' +
                ']';
    }

}

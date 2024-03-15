package org.example;

public class Mathematical {
    public static int totalCount = 0;
    int instantCount = 0;

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstantCount() {
        this.instantCount++;
    }

    @Override
    public String toString() {
        return "Mathematical{" +
                "totalCount=" + totalCount +
                " " +
                "instantCount=" + instantCount +
                '}';
    }
}

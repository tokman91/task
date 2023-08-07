package home.interview.task.domain;

import lombok.Getter;

@Getter
public enum Month {

    JAN("JAN"),
    FEB("FEB"),
    MAR("MAR"),
    APR("APR"),
    MAY("MAY"),
    JUN("JUN"),
    JUL("JUL"),
    AUG("AUG"),
    SEP("SEP"),
    OCT("OCT"),
    NOV("NOV"),
    DEC("DEC");

    private String month;

    Month(String month) {
        this.month = month;
    }
}

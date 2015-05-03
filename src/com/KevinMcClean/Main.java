package com.KevinMcClean;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Main {
    private static final int YEAR = 0;
    private static final int MONTH = 1;
    private static final int DATE = 2;


    public static void main(String[] args) {
	//This turns a date from java into a date that can be used by SQL.
        java.util.Date date = new java.util.Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        String dateString = sdf.format(date).toString();
        String splitDate[] = dateString.split("-");
        Integer intYear = Integer.parseInt(splitDate[YEAR]);
        Integer intMonth = Integer.parseInt(splitDate[MONTH]);
        Integer intDate = Integer.parseInt(splitDate[DATE]);
        Date sqlDate = new Date(intYear, intMonth, intDate);
    }
}

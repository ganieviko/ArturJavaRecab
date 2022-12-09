package Day_32_nonAccessModifiers.enums._02_task;

public enum Month {
    Jan("January"),
    Feb("February"),
    Mar("March"),
    Apr("April"),
    May("May"),
    Jun("June"),
    Jul("July"),
    Aug("August"),
    Sep("September"),
    Oct("October"),
    Nov("November"),
    Dec("December");

    final String fullName;

    Month(String fullName){
        this.fullName = fullName;
    }

void printFirstLetter(){
    System.out.println(fullName.charAt(0));
}
}

/*
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
     */
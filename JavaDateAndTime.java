Calendar calendar = Calendar.getInstance();

    calendar.set(year,month-1,day);

    System.out.println(calendar.getTime());

    int res = calendar.get(calendar.DAY_OF_WEEK);

    switch (res) {
        case 1 -> {return "SUNDAY";}
        case 2 -> {return "MONDAY";}
        case 3 -> {return "TUESDAY";}
        case 4 -> {return "WEDNESDAY";}
        case 5 -> {return "THURSDAY";}
        case 6 -> {return "FRIDAY";}
        case 7 -> {return "SATURDAY";}
        default -> {return "nachobc";}
    }
    }

} //Only run in Java 15
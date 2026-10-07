package models;

public class Plain {
    private String name;
    private String country;
    private int year;
    private int hoursInAir;
    private boolean military;
    private double weight;
    private int wingspan;
    private int topSpeed;
    private int seats;
    private double coast;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHoursInAir() {
        return hoursInAir;
    }

    public void setHoursInAir(int hoursInAir) {
        this.hoursInAir = hoursInAir;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public double getCoast() {
        return coast;
    }

    public void setCoast(double coast) {
        this.coast = coast;
    }

    public Plain(String element) {
        String[] split = element.split(" ");
        this.name = split[0];
        this.country = split[1];
        if ( Integer.parseInt(split[2]) >= 1903 &&  Integer.parseInt(split[2]) <= 2021) {
            this.year = Integer.parseInt(split[2]);
        }
        if ( Integer.parseInt(split[3]) > 0 && Integer.parseInt(split[3]) <= 10000) {
            this.hoursInAir = Integer.parseInt(split[3]);
        }
        this.military = Boolean.parseBoolean(split[4]);
        if (Double.parseDouble(split[5]) > 10000 && Double.parseDouble(split[5]) <= 160000) {
            this.weight = Double.parseDouble(split[5]);
        }
        if (Integer.parseInt(split[6]) > 0 &&Integer.parseInt(split[6]) <= 45) {
            this.wingspan = Integer.parseInt(split[6]);
        }
        if (Integer.parseInt(split[7])> 0 && Integer.parseInt(split[7]) <= 1000) {
            this.topSpeed = Integer.parseInt(split[7]);
        }

        if (Integer.parseInt(split[8]) > 0) {
            this.seats = Integer.parseInt(split[8]);
        }
        if ( Double.parseDouble(split[9])> 0) {
            this.coast = Double.parseDouble(split[9]);
        }


    }

    @Override
    public String toString() {
        return "Plain{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", year=" + year +
                ", hoursInAir=" + hoursInAir +
                ", military=" + military +
                ", weight=" + weight +
                ", wingspan=" + wingspan +
                ", topSpeed=" + topSpeed +
                ", seats=" + seats +
                ", coast=" + coast +
                '}'+"\n";
    }
}

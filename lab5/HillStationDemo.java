class HillStations {
    public void location() {
        System.out.println("Generic hill station location.");
    }

    public void famousFor() {
        System.out.println("Famous for something.");
    }
}

class Manali extends HillStations {
    @Override
    public void location() {
        System.out.println("Manali is in Himachal Pradesh, India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for Rohtang Pass and adventure sports.");
    }
}

class Mussoorie extends HillStations {
    @Override
    public void location() {
        System.out.println("Mussoorie is in Uttarakhand, India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for scenic views and Mall Road.");
    }
}

class Gulmarg extends HillStations {
    @Override
    public void location() {
        System.out.println("Gulmarg is in Jammu & Kashmir, India.");
    }

    @Override
    public void famousFor() {
        System.out.println("Famous for skiing and Gondola rides.");
    }
}

public class HillStationDemo {
    public static void main(String[] args) {
        HillStations station;

        station = new Manali();
        station.location();
        station.famousFor(); 
        
        station = new Mussoorie();
        station.location(); 
        station.famousFor(); 
        station = new Gulmarg();
        station.location();     
        station.famousFor(); 
        System.out.println("\nUsing individual subclass objects:");

        Manali manali = new Manali();
        manali.location();
        manali.famousFor();

        Mussoorie mussoorie = new Mussoorie();
        mussoorie.location();
        mussoorie.famousFor();

        Gulmarg gulmarg = new Gulmarg();
        gulmarg.location();
        gulmarg.famousFor();
    }
}


package demohorses;


public class DemoHorses {//Using this class for my main Method

      public static void main(String[] args) {
        //First instance
        Horse horse1 = new Horse("Thunder", "Black", 2015);
       
        //Second instance
        RaceHorse raceHorse1 = new RaceHorse("Flash", "White", 2018, 10);

        System.out.println("Horse: " + horse1.getName() + ", Colour: " + horse1.getColour() + ", Birth Year: " + horse1.getBirthYear());
        System.out.println("Race Horse: " + raceHorse1.getName() + ", Colour: " + raceHorse1.getColour() + ", Birth Year: " + raceHorse1.getBirthYear() + ", Races Competed: " + raceHorse1.getRacesCompeted());

        //Get a new horse Name
        horse1.setName("Rainbow");
        raceHorse1.setRacesCompeted(15);

        System.out.println("\nAfter updating:");
        System.out.println("Horse: " + horse1.getName() + ", Colour: " + horse1.getColour() + ", Birth Year: " + horse1.getBirthYear());
        System.out.println("Race Horse: " + raceHorse1.getName() + ", Colour: " + raceHorse1.getColour() + ", Birth Year: " + raceHorse1.getBirthYear() + ", Races Competed: " + raceHorse1.getRacesCompeted());
    }
}







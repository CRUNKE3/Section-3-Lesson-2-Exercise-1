
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        //Put yout code here
        int chickenCount = 8;
        int eggsPerChicken = 4;
        int totalEggs = 0;
        totalEggs = totalEggs+(chickenCount*eggsPerChicken);
        System.out.println("Monday:" + totalEggs + " eggs");
        chickenCount = 9;
        totalEggs = totalEggs+(chickenCount*eggsPerChicken);
        System.out.println("Tuesday:" + totalEggs + " eggs");
        chickenCount = 4;
        totalEggs = totalEggs+(chickenCount*eggsPerChicken);
        System.out.println("Wednesday:" + totalEggs + " eggs");
        System.out.println("The Farmer collected " + totalEggs + " eggs from Monday to Wednesday.");
    }   
}

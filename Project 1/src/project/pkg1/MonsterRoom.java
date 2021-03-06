
package project.pkg1;

import java.util.Scanner;

/**
 * @author Brandon Edwards
 * @since 2/12/18
 *
 **/
/**
 * honorCode I pledge that this submission is solely my work, and that I have
 * neither given to nor received help from anyone other than the instructor or
 * TAs.
 *
 */
public class MonsterRoom extends Room {

    //a special constructor for a special room
    public MonsterRoom(String roomName, String objects, int roomNum, String listOfExits) {
        super(roomName, objects, roomNum, listOfExits);
    }

    @Override
    public int playRoom(Player player) {

        return super.playRoom(player);
    }

    /**
     * used to pull a hat out of a bunny
     *
     * @param player
     */
    @Override
    public void userDrops(Player player) {
        System.out.println("What would you like to drop?");
        Scanner keyboard = new Scanner(System.in);
        String itemToDrop = keyboard.nextLine();
        if (Utilities.isItemInContainer(itemToDrop, player.getInventory())) {
            player.removeFromInventory(itemToDrop);
            if (itemToDrop.equals("Dust Bunny")) {
                System.out.println("The dust bunny spins around in a circle"
                        + "\nquickly getting faster and faster"
                        + "\nthen in a blur of dusty speed, the bunny turns "
                        + "into a top hat"
                        + "\nand tumbles to a stop");
                super.addToObjects(Utilities.addToString("Top Hat", super.getRoomObjects()));
            } else {
                super.addToObjects(Utilities.addToString(itemToDrop, super.getRoomObjects()));
                System.out.println(itemToDrop + " got dusty");
            }
        } else {
            System.out.println("You cannot drop something that you don't have");
        }
    }
}

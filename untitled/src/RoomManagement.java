import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RoomManagement {
//    public ArrayList<Room> readData(String fileName){
//
//    }
    public void printRoomsInfor(ArrayList<Room> rooms){
        for (Room r:
             rooms) {
            System.out.println(r);
        }
    }
    public ArrayList<Room> sortByPrice(ArrayList<Room> rooms){
        ArrayList<Room> roomNonAvailables = new ArrayList<Room>(0);
        for (Room room:
             rooms) {
            if (room.isAvailable()){
                continue;
            }
            roomNonAvailables.add(room);
        }
        Collections.sort(roomNonAvailables);
        return roomNonAvailables;
    }
    public ArrayList<Room> getAvailableRooms(ArrayList <Room> rooms){
        ArrayList<Room> roomAvailables = new ArrayList<Room>(0);
        for (Room room:
                rooms) {
            if (room.isAvailable()){
                roomAvailables.add(room);
            }
        }
        return roomAvailables;
    }
    public ArrayList<Room> filterRoomByPrice(ArrayList<Room> rooms,double minPrice,double maxPrice){
        ArrayList<Room> copyRooms = new ArrayList<Room>(0);
        for (Room room:
                rooms) {
            if (room.getPrice() <= maxPrice && room.getPrice() >= minPrice){
                copyRooms.add(room);
            }
        }
        Collections.sort(copyRooms);
        return copyRooms;
    }
}

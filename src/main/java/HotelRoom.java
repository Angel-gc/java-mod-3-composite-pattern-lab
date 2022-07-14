import java.util.ArrayList;
import java.util.List;

class HotelRoom implements HotelRoomInterface {
    private List<RoomCheckinObserver> checkinObservers = new ArrayList<RoomCheckinObserver>();
    private int uniqueRoomNumber;

    public HotelRoom(int uniqueRoomNumber) {
        this.uniqueRoomNumber = uniqueRoomNumber;
    }

    public void book(String guestName) {
        Logger.getInstance().log("Booked a room for " + guestName);
    }

    public void clean() {
        Logger.getInstance().log("Cleaned room");
    }

    public void addCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.add(checkinObserver);
    }

    public void removeCheckinObserver(RoomCheckinObserver checkinObserver) {
        checkinObservers.remove(checkinObserver);
    }

    public void checkIn(String guestName) {
        Logger.getInstance().log(guestName + " checked in");
        checkinObservers.forEach((checkinObserver -> checkinObserver.update(guestName)));
    }

    @Override
    public String toString() {
        return "HotelRoom{" +
                "checkinObservers=" + checkinObservers +
                ", uniqueRoomNumber=" + uniqueRoomNumber +
                '}';
    }
}
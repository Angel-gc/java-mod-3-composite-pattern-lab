import java.util.ArrayList;
import java.util.List;

class HotelFloor implements HotelRoomInterface {
    private List<HotelRoomInterface> hotelRooms = new ArrayList<HotelRoomInterface>();
    private final int uniqueFloorNumber;

    public HotelFloor(int uniqueNumber) {
        this.uniqueFloorNumber = uniqueNumber;
    }

    public void book(String guestName) {
        hotelRooms.forEach(child -> {
            child.book(guestName);
        });
    }

    public void clean() {
        hotelRooms.forEach(child -> child.clean());
    }

    public void addHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.add(hotelRoom);
    }

    public void removeHotelRoom(HotelRoomInterface hotelRoom) {
        hotelRooms.remove(hotelRoom);
    }
}
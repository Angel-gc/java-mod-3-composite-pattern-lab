public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");

        // create hotel rooms
        HotelRoom newRoom = new HotelRoom();
        HotelRoom newRoom1 = new HotelRoom();
        newRoom.book("Angel");
        newRoom1.book("Larry");

        // create hotel floors
        HotelFloor newFloor = new HotelFloor();
        HotelFloor newFloor1 = new HotelFloor();
        newFloor.book("Jay");
        newFloor1.book("Thomas");

        // add hotel rooms to hotel floors
        newFloor.addHotelRoom(newRoom);
        newFloor.addHotelRoom(newRoom1);
        // take actions on rooms and floors and examine your output to ensure you implemented the desired
        // behaviors
        newRoom.clean();
        newRoom1.clean();
        newFloor.clean();
        newFloor1.clean();
    }
}

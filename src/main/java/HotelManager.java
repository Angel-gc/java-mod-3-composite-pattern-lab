import java.util.ArrayList;
import java.util.List;

public class HotelManager {
    public static void main(String[] args) {
        Logger.getInstance().log("Managing hotel...");

        List<HotelRoom> hotelRooms = new ArrayList<HotelRoom>();

        // create 3 hotel floors
        HotelFloor newFloor0 = new HotelFloor();
        HotelFloor newFloor1 = new HotelFloor();
        HotelFloor newFloor2 =  new HotelFloor();

        // add 5 rooms to each floor
        HotelRoom newRoom0 = new HotelRoom(1);
        HotelRoom newRoom1 = new HotelRoom(2);
        HotelRoom newRoom2 = new HotelRoom(3);
        HotelRoom newRoom3 = new HotelRoom(4);
        HotelRoom newRoom4 = new HotelRoom(5);

        hotelRooms.add(newRoom0);
        hotelRooms.add(newRoom1);
        hotelRooms.add(newRoom2);
        hotelRooms.add(newRoom3);
        hotelRooms.add(newRoom4);

        for (HotelRoom room : hotelRooms) {
            newFloor0.addHotelRoom(room);
            newFloor1.addHotelRoom(room);
            newFloor2.addHotelRoom(room);
        }

        // check 4 different guests in
        newRoom0.book("Angel");
        newRoom0.checkIn("Angel");
        newRoom1.book("Larry");
        newRoom1.checkIn("Larry");
        newRoom2.book("Bill");
        newRoom2.checkIn("Bill");
        newRoom3.book("Jill");
        newRoom3.checkIn("Jill");


        // take actions on rooms and floors and examine your output to ensure you implemented the desired
        // behaviors
        newRoom0.clean();
        newRoom1.clean();
        newFloor0.clean();
        newFloor1.clean();

        // create hotel email and notification services
        HotelEmailService emailService = new HotelEmailService();
        HotelPushNotificationService notificationService = new HotelPushNotificationService();
        // initialize hotel email and notification services
        emailService.update(hotelRooms);
        notificationService.update(hotelRooms);
        // ...
        hotelRooms.forEach((hotelRoom) -> {
            hotelRoom.addCheckinObserver(emailService);
            hotelRoom.addCheckinObserver(notificationService);
        });
    }
}

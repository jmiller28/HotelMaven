package edu.wctc.models;

import edu.wctc.entities.Hotel;
import java.util.List;

/**
 *
 * @author John
 */
public class HotelService {

    private IHotelDAO hotelDAO;

    public HotelService() {

        hotelDAO = new HotelDAO();
    }

    public final List<Hotel> getAllHotels() throws Exception {

        return hotelDAO.getAllHotels();
    }

    public final Hotel getHotelById(Long hotelId) throws Exception {

        return hotelDAO.getHotelById(hotelId);
    }

    public final int deleteHotel(Hotel hotel) throws Exception {

        return hotelDAO.deleteHotel(hotel);
    }

    public final int addNewHotel(Hotel hotel) throws Exception {

        return hotelDAO.addNewHotel(hotel);
    }

    public final int updateHotel(Hotel hotel) throws Exception {

        return hotelDAO.updateHotel(hotel);
    }

}

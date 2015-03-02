package edu.wctc.models;

import edu.wctc.entities.Hotel;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author John
 */
public class HotelService {

    private IHotelDAO hotelDAO;

    public HotelService(String driverClassName, String url, String username,
            String password, String hotelDao, String hotelDb) 
            throws ClassNotFoundException, InstantiationException, 
            IllegalAccessException {

        try {
            Class clazz = Class.forName(hotelDao);
            Constructor c = clazz.getConstructor(new Class[]{String.class,
                String.class, String.class, String.class, String.class});

            hotelDAO = (HotelDAO) c.newInstance(hotelDb, driverClassName, url, username, password);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(HotelService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(HotelService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(HotelService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(HotelService.class.getName()).log(Level.SEVERE, null, ex);
        }
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

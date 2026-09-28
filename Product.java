
import java.util.*;

/**
 *
 */
public abstract class Product {

    /**
     * Default constructor
     */
    public Product() {
    }

    /**
     *
     */
    private String id;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private double price;

    /**
     *
     */
    public void Product() {
        // TODO implement here
    }

    /**
     * @return
     */
    public abstract double calculateFinalPrice();


    public String getId() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String getName() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public double getPrice() {
        // TODO implement here
        return 0.0d;
    }

    /**
     * @param id
     * @return
     */
    public void setId(String id) {
        // TODO implement here
        return null;
    }

    /**
     * @param name
     * @return
     */
    public void setName(String name) {
        // TODO implement here
        return null;
    }

    /**
     * @param price
     * @return
     */
    public void setPrice(double price) {
        // TODO implement here
        return null;
    }

}
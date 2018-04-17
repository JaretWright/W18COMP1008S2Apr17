package w18comp1008s2apr17;

/**
 *
 * @author JWright
 */
public class Tool
{
    private String name, brand;
    private double price;

    public Tool(String name, String brand, double price)
    {
        setName(name);
        setBrand(brand);
        setPrice(price);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price >= 0 && price <= 200)
            this.price = price;
        else
            throw new IllegalArgumentException("Price must be in the range 0-200");
    }
    
    
    
}

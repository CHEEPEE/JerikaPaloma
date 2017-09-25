package jerika.com.sacbookstore;

/**
 * Created by Keji's Lab on 30/07/2017.
 */

public class ItemListModels {
    private  String des;
    private String unit;
    private String price;
    private Boolean availability;
    private Integer icons;

    public String getDes(){
        return des;
    }
    public String getUnit(){
        return unit;
    }
    public String getPrice(){
        return price;
    }
    public Boolean getAvail(){
        return  availability;
    }
    public Integer getIcons(){
        return icons;
    }

    public void setDes(String getDes){
        des = getDes;
    }

    public void setUnit(String getUnit){
        unit = getUnit;
    }
    public void setPrice(String getPrice){
        price = getPrice;
    }
    public void setAvailability(Boolean getAvailability){
        availability = getAvailability;
    }

    public void setIcons(Integer Icons){
     icons =Icons;
    }



}

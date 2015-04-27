package eramy.proje;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import eramy.proje.Urun;

@ManagedBean(name = "urunService")
@ApplicationScoped
public class UrunService {
	  private final static String[] colors;
	     
	    private final static String[] brands;
	     
	    static {
	        colors = new String[10];
	        colors[0] = "Özellik1";
	        colors[1] = "Özellik2";
	        colors[2] = "Özellik2";
	        colors[3] = "Özellik2";
	        colors[4] = "Özellik3";
	        colors[5] = "Özellik4";
	        colors[6] = "Özellik4";
	        colors[7] = "Özellik3";
	        colors[8] = "Özellik5";
	        colors[9] = "Özellik5";
	         
	        brands = new String[10];
	        brands[0] = "Kinect V1.0";
	        brands[1] = "Kinect V2.0";
	        brands[2] = "PC";
	        brands[3] = "Monitör";
	        brands[4] = "Primesense";
	        brands[5] = "Spor Paketi Hareketleri";
	        brands[6] = "Tedavi Paketi";
	        brands[7] = "Full Paket";
	        brands[8] = "Bildirim Paketi";
	        brands[9] = "Geliþmiþ Ürün Paketi";
	    }
	     
	    public List<Urun> createCars(int size) {
	        List<Urun> list = new ArrayList<Urun>();
	        for(int i = 0 ; i < size ; i++) {
	            list.add(new Urun(getRandomId(), getRandomBrand(), getRandomYear(), getRandomColor(), getRandomPrice(), getRandomSoldState()));
	        }
	         
	        return list;
	    }
	     
	    private String getRandomId() {
	        return UUID.randomUUID().toString().substring(0, 8);
	    }
	     
	    private int getRandomYear() {
	        return (int) (100);
	    }
	     
	    private String getRandomColor() {
	        return colors[(int) (Math.random() * 10)];
	    }
	     
	    private String getRandomBrand() {
	        return brands[(int) (Math.random() * 10)];
	    }
	     
	    public int getRandomPrice() {
	        return (int) (Math.random() * 100000);
	    }
	     
	    public boolean getRandomSoldState() {
	        return (Math.random() > 0.5) ? true: false;
	    }
	 
	    public List<String> getColors() {
	        return Arrays.asList(colors);
	    }
	     
	    public List<String> getBrands() {
	        return Arrays.asList(brands);
	    }
}

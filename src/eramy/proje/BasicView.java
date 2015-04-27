package eramy.proje;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import eramy.proje.Urun;
import eramy.proje.UrunService;

@ManagedBean(name="dtBasicView")
@ViewScoped
public class BasicView implements Serializable{
	 private List<Urun> urunler;
     
	    @ManagedProperty("#{urunService}")
	    private UrunService service;
	 
	    @PostConstruct
	    public void init() {
	        urunler = service.createCars(10);
	    }
	     
	    public List<Urun> getCars() {
	        return urunler;
	    }
	 
	    public void setService(UrunService service) {
	        this.service = service;
	    }
}

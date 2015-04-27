package eramy.proje;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/*
 * Fizik Tedavi ve Spor Hareketleri Satýþý
 * E Ticaret Dersi Projesi
 * Proje Grubu : Eramy - (Ahmet Murat YAÞAR - Eren ÇOLAK)
 * Class Ýþlevi : Arayüzdeki üst menü iþlevleri
 * Baðlantýlý Olduðu Class'lar : 
 * Kodlayan:Eren ÇOLAK
 * Revizyon Nedeni : Oluþturuldu.
 * Oluþturulma Tarihi:02.04.2015
 * Revizyon Tarihi:14.04.2015
 * */
@ManagedBean
public class MenuView {
	public void save() {
        addMessage("Success", "Data saved");
    }
     
    public void update() {
        addMessage("Success", "Data updated");
    }
     
    public void delete() {
        addMessage("Success", "Data deleted");
    }
     
    public void addMessage(String summary, String detail) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}

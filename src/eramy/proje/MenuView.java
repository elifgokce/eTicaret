package eramy.proje;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/*
 * Fizik Tedavi ve Spor Hareketleri Sat���
 * E Ticaret Dersi Projesi
 * Proje Grubu : Eramy - (Ahmet Murat YA�AR - Eren �OLAK)
 * Class ��levi : Aray�zdeki �st men� i�levleri
 * Ba�lant�l� Oldu�u Class'lar : 
 * Kodlayan:Eren �OLAK
 * Revizyon Nedeni : Olu�turuldu.
 * Olu�turulma Tarihi:02.04.2015
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

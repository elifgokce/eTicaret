package eramy.proje;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/*
 * Fizik Tedavi ve Spor Hareketleri Satýþý
 * E Ticaret Dersi Projesi
 * Proje Grubu : Eramy - (Ahmet Murat YAÞAR - Eren ÇOLAK)
 * Class Ýþlevi : Kullanýcý sisteme giriþ yaparken kullanýcý adý sifre bilgileri alýnýr.
 * Baðlantýlý Olduðu Class'lar : 
 * Kodlayan:Eren ÇOLAK
 * Revizyon Nedeni : Oluþturuldu.
 * Oluþturulma Tarihi:02.04.2015
 * Revizyon Tarihi:14.04.2015
 * */
@ManagedBean
public class UserView {
	 private String firstname;
	    private String lastname;
	 
	    public String getFirstname() {
	        return firstname;
	    }
	 
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	 
	    public String getLastname() {
	        return lastname;
	    }
	 
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	 
	    public void save() {
	        FacesContext.getCurrentInstance().addMessage(null,
	                new FacesMessage("Welcome " + firstname + " " + lastname));
	    }
}

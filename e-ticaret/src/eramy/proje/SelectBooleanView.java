package eramy.proje;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
/*
 * Fizik Tedavi ve Spor Hareketleri Satýþý
 * E Ticaret Dersi Projesi
 * Proje Grubu : Eramy - (Ahmet Murat YAÞAR - Eren ÇOLAK)
 * Class Ýþlevi : Arayüzdeki Checkbox 'ýn seçili olup olmama durumuna iliþkin veriler.
 * Baðlantýlý Olduðu Class'lar : Customer.java
 * Kodlayan:Eren ÇOLAK
 * Revizyon Nedeni : Oluþturuldu.
 * Oluþturulma Tarihi:02.04.2015
 * Revizyon Tarihi:14.04.2015
 * */
@ManagedBean
public class SelectBooleanView {
	 private boolean value1;  
	    private boolean value2;
	 
	    public boolean isValue1() {
	        return value1;
	    }
	 
	    public void setValue1(boolean value1) {
	        this.value1 = value1;
	    }
	 
	    public boolean isValue2() {
	        return value2;
	    }
	 
	    public void setValue2(boolean value2) {
	        this.value2 = value2;
	    }
	     
	    public void addMessage() {
	        String summary = value2 ? "Checked" : "Unchecked";
	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
	    	}
	 }

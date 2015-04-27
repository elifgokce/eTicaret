package eramy.proje;
import java.util.Date;

/*
 * Fizik Tedavi ve Spor Hareketleri Satýþý
 * E Ticaret Dersi Projesi
 * Proje Grubu : Eramy - (Ahmet Murat YAÞAR - Eren ÇOLAK)
 * Class Ýþlevi : Veritabanýndan Select Sorgusu ile Dönen Veriler Burada Java Deðiþkenlerine Aktarýlýr.
 * Baðlantýlý Olduðu Class'lar : 
 * Kodlayan:Eren ÇOLAK
 * Revizyon Nedeni : Oluþturuldu.
 * Oluþturulma Tarihi:02.04.2015
 * Revizyon Tarihi:14.04.2015
 * */ 
public class Customer {
	public long customerID;
	public String name;
	public String address;
	public Date created_date;
	public boolean girisonay=false;
	
	public void setCustomerID(long long1) {
		customerID=long1;
	}
	public long getCustomerID()
	{
		return customerID;
	}

	public void setName(String string) {
		name=string;
		
	}
	public String getName()
	{
		return name;
	}

	public void setAddress(String string) {
		address=string;
		
	}
	public String getAddress()
	{
		return address;
	}
	public void setCreated_date(java.sql.Date date) {
	created_date=date;
	}
	public java.sql.Date getCreated_date()
	{
		return (java.sql.Date) created_date;
	}
	
 
}

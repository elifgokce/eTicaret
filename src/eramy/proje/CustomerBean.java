package eramy.proje;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import eramy.proje.Customer;

/*
 * Fizik Tedavi ve Spor Hareketleri Satýþý
 * E Ticaret Dersi Projesi
 * Proje Grubu : Eramy - (Ahmet Murat YAÞAR - Eren ÇOLAK)
 * Class Ýþlevi : Veritabanýndan Select Sorgusu ile Veri Getirme.
 * Baðlantýlý Olduðu Class'lar : Customer.java
 * Kodlayan:Eren ÇOLAK
 * Revizyon Nedeni : Oluþturuldu.
 * Oluþturulma Tarihi:02.04.2015
 * Revizyon Tarihi:14.04.2015
 * deneme
 * */
@ManagedBean(name="customer")
@SessionScoped
public class CustomerBean implements Serializable{
	

		@Resource(name="jdbc/kinectdb")
		private DataSource ds;
		Connection con; 
		UserView nesne;
		String yetki="kullanici";
		public String getKad() {
			return kad;
		}

		public void setKad(String kad) {
			this.kad = kad;
		}

		public String getSifre() {
			return sifre;
		}

		public void setSifre(String sifre) {
			this.sifre = sifre;
		}
		public String kad;
		public String sifre;
		
		Customer cust=new Customer();
		
		public CustomerBean(){
			try {
				Context ctx = new InitialContext();
				ds = (DataSource)ctx.lookup("java:comp/env/jdbc/kinectdb");
			
			} catch (NamingException e) {
				e.printStackTrace();
			}
	 
		}
	 
		//Veritabanýndan kullanýcýlarýn listesini döndürür.
		public List<Customer> getCustomerList() throws SQLException{
	 
			if(ds==null)
				throw new SQLException("Veri kaynaðý bulunamadý");
	 
			con =(Connection) ds.getConnection();
	 
			if(con==null)
				throw new SQLException("Veritabaný baðlantýsý alýnamadý.");
	 
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select id,kadi,sifre, adisoyadi, adres1, kayittarihi from user");
			ResultSet result =  ps.executeQuery();
			List<Customer> list = new ArrayList<Customer>();
			while(result.next()){
				Customer cust=new Customer();
				
				cust.setCustomerID(result.getLong("id"));
				cust.setName(result.getString("adisoyadi"));
				cust.setAddress(result.getString("adres1"));
				cust.setCreated_date(result.getDate("kayittarihi"));
				list.add(cust);
			}
	 
			return list;
		}
		//Kullanýcý adý þifre ile sisteme giriþ yapmayý saðlayan fonksiyon
		public String GirisKontrol() throws SQLException
		{
			if(ds==null)
				throw new SQLException("Veri kaynaðý bulunamadý");
			con = (Connection) ds.getConnection();
			if(con==null)
				throw new SQLException("Veritabaný baðlantýsý alýnamadý.");
			PreparedStatement ps = (PreparedStatement) con.prepareStatement("select adisoyadi,kadi,sifre,yetki from user where kadi='"+kad+"' and sifre='"+sifre+"';");
			ResultSet result =  ps.executeQuery();
			System.out.println(kad+sifre);
			if(result.equals(null)){
			    return "failure";
			}
			else
			{
				//return "success";
				yetki=result.getString("adisoyadi");
				if(yetki.equals("kullanici"))
				{
					return "kullanici";
				}
				else if(yetki.equals("adm"))
				{
					return "adm";
				}
				else
				{
					return "failure";
				}
			}
	 
		}
}

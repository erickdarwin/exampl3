package pe.edu.upeu.servicerest.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="User")
public class User implements BaseEntity{

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue
	private Long id;

    @Column(length =100)
    private String userName;

    @Column(length =10)
    private String nember;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getNember() {
		return nember;
	}

	public void setNember(String nember) {
		this.nember = nember;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}

package in.mhs.MHS.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity 
@Data
@Table(name = "counsellor")
public class c_details {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false) //update
	private long id;

	@Column(name = "username")
	private String username;

	@Column(name = "email")
	private String email;

	@Column(name = "pass_word")
	private String password;

    // @Column(name = "docs")
	// private String docs;

    @Column(name = "description")
	private String description;

    public c_details(){

    }
    public c_details(String username, String email, String password, String description) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
        // this.docs = docs;
        this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getusername() {
		return username;
	}
	public void setusername(String username) {
		this.username = username;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email = email;
	}
	public String getpassword() {
		return password;
	}
	public void setpassword(String password) {
		this.password = password;
	}
    // public String docs() {
	// 	return docs;
	// }
	// public void docs(String docs) {
	// 	this.docs = docs;
	// }
    public String getdiscription() {
		return description;
	}
	public void setdiscription(String description) {
		this.description = description;
	}
    
}

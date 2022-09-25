package code.microsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emptb")
public class Employee {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
	    
	    private String fname;
	    private String email;
	    private String password;
	    
	    
		public Employee() {
			super();
		}


		public Employee(int id, String fname, String email, String password) {
			super();
			this.id = id;
			this.fname = fname;
			this.email = email;
			this.password = password;
		}


		public Employee(String fname, String email, String password) {
			super();
			this.fname = fname;
			this.email = email;
			this.password = password;
		}



		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getFname() {
			return fname;
		}


		public void setFname(String fname) {
			this.fname = fname;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		@Override
		public String toString() {
			return "Employee [id=" + id + ", fname=" + fname + ", email=" + email + ", password=" + password + "]";
		}
	  
		
	    
}

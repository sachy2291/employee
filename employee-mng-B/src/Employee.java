import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {

	private Long employeeId;
		
		private Integer age;
		
		private Long annualCtc;
		
		private Date joiningDate ;
		
		private Boolean status;
		
		private String userName;
		
		private String password;
		
	    private Long departmentId;
	    
	    private String departmentName;
	    
	    private String cityName;

		public Long getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Long employeeId) {
			this.employeeId = employeeId;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Long getAnnualCtc() {
			return annualCtc;
		}

		public void setAnnualCtc(Long annualCtc) {
			this.annualCtc = annualCtc;
		}

		public Date getJoiningDate() {
			return joiningDate;
		}

		public void setJoiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
		}

		public Boolean getStatus() {
			return status;
		}

		public void setStatus(Boolean status) {
			this.status = status;
		}

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
		public Long getDepartmentId() {
			return departmentId;
		}

		public void setDepartmentId(Long departmentId) {
			this.departmentId = departmentId;
		}

		public String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}

		public String getCityName() {
			return cityName;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", age=" + age + ", annualCtc=" + annualCtc + ", joiningDate="
					+ joiningDate + ", status=" + status + ", userName=" + userName + ", password=" + password
					+ ", departmentId=" + departmentId + ", departmentName=" + departmentName + ", cityName=" + cityName
					+ "]";
		}

		public Employee(Long employeeId, Integer age, Long annualCtc, Date joiningDate, Boolean status, String userName,
				String password, Long departmentId, String departmentName, String cityName) {
			super();
			this.employeeId = employeeId;
			this.age = age;
			this.annualCtc = annualCtc;
			this.joiningDate = joiningDate;
			this.status = status;
			this.userName = userName;
			this.password = password;
			this.departmentId = departmentId;
			this.departmentName = departmentName;
			this.cityName = cityName;
		}



		
	    
	   
	    

	}
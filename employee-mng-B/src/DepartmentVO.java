

import java.io.Serializable;


public class DepartmentVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long departmentId;
	private String depatmentName;
	private String departmentRegion;
	public Long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepatmentName() {
		return depatmentName;
	}
	public void setDepatmentName(String depatmentName) {
		this.depatmentName = depatmentName;
	}
	public String getDepartmentRegion() {
		return departmentRegion;
	}
	public void setDepartmentRegion(String departmentRegion) {
		this.departmentRegion = departmentRegion;
	}
	@Override
	public String toString() {
		return "DepartmentVO [departmentId=" + departmentId + ", depatmentName=" + depatmentName + ", departmentRegion="
				+ departmentRegion + "]";
	}
	public DepartmentVO(Long departmentId, String depatmentName, String departmentRegion) {
		super();
		this.departmentId = departmentId;
		this.depatmentName = depatmentName;
		this.departmentRegion = departmentRegion;
	}
	public DepartmentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}

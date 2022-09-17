package collection;

//DTO (Data Transfer Object) = VO (Value Object): MVC2

public class StudentVO {
	
    private String name;
    private int kor, eng, mat, total, rank;
    private double aver;
    
    public StudentVO(String name, int kor, int eng, int mat) {
    	
    	this.name = name;
    	this.kor = kor;
    	this.eng = eng;
    	this.mat = mat;
    	this.total = this.kor + this.eng + this.mat;
    	this.aver = this.total / 3.0;
    			
    }
    
    
    
    //getter&setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public double getAver() {
		return aver;
	}
	public void setAver(double aver) {
		this.aver = aver;
	}
    
    
}

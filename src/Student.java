import java.util.Date;

/**
 * Class that stores information about the concrete student
 * 
 * DO NOT REMOVE given methods, but you can add new methods/fields/constructor
 * and change the given methods implementation. For example you can change implementation for equals()
 * or hashCode() method
 * 
 */
public class Student implements Comparable {

	private int id;
	private String name;
	private Date bdate;
	private double AvgMark;
	public Student(int ids[i], String names[i], Date birthDate[i], double AvgMark[i])
        {
		this.ids = id.getId();
		this.names = fullName.getfullname();
		this.names = fullName.setfullname();
		this.birthdate = BirthDate.getBirthDate();
		this.birthdate = BirthDate.setBirthDate();
		this.AvgMark = avgMark.getAvgmark();
		this.AvgMark = BirthDate.getsetAvgmark();
	}

	public int getId(int id[i]) 
        {
		System.out.println("%d",&id[i]);
		return id;
	}

	public void setId(int id[i])
        {
		this.id = id;
	}

	public String getFullName(int names[i])
        {
		return fullName;
	}

	public void setFullName(String )
        {
		this.fullName = fullName;
		System.out.println("%s",);
	}

	public Date getBirthDate()
        {
		system.out.println("
		return birthDate;
	}

	public void setBirthDate(Date birthDate) 
        {
		this.birthDate = birthDate;
	}

	public double getAvgMark()
        {
		return avgMark;
	}

	public void setAvgMark(double avgMark) 
	{
		this.avgMark = avgMark;
	}

	@Override
	public int hashCode() 
        {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
        {
		return super.equals(obj);
	}
	
	
	public int compareTo(Object o)
        {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}

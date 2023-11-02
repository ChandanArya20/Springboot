package in.ineuron.comp;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "me.info")
public class Company2 {

	String name;
	Integer age;
	String address;
	String course;
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Company2 [name=" + name + ", age=" + age + ", address=" + address + ", course=" + course + "]";
	}
	
	
}

package spa.simone.api;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Person {

  @JsonIgnore
  private long id;
  private String firstName = "";
  private String lastName = "";

  public Person(long id, String firstName, String lastName) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public long getId() {
    return this.id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public int hashCode() {
    // TODO Auto-generated method stub
    return super.hashCode();
  }
}

package jsonSerialization;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Person {
    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonProperty("dob")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate dateOfBirth;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    private Sex gender;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Sex getGender() {
        return gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString(){
        return "person->{name: "+name+" , date_of_birth: "+dateOfBirth+", phone_number: "+phoneNumber+", gender: "+gender+"}";
    }
    public Person(){}

    public Person(String name, String dateOfBirth, String phoneNumber,Sex gender){
        this.name = name;
        this.dateOfBirth = LocalDate.parse(dateOfBirth);
        this.gender = gender;
        this.phoneNumber = phoneNumber;

    }
}

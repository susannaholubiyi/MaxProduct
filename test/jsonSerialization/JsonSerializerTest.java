package jsonSerialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static jsonSerialization.Sex.MALE;
import static org.junit.jupiter.api.Assertions.*;

public class JsonSerializerTest {
    @Test
    public void testSerializer(){
        Person person = new Person();
        person.setName("aramide");
        person.setDateOfBirth(LocalDate.parse("2024-03-03"));
        person.setPhoneNumber("08033339112");
        person.setGender(Sex.SHIM);

        String json = JsonSerializer.serialize(person);
        String expected = "{\"name\":\"aramide\", \"gender\":\"SHIM\", \"phoneNumber\":\"08033339112\", \"dob\":\"2024-03-03\", }";
        assertEquals(expected, json);
    }
    @Test
    public void testDeserializer() throws JsonProcessingException {
        Person person = new Person("John", "2024-02-10", "08106317491", MALE);
        String json = JsonSerializer.serialize(person);
        Person personFromJson = JsonSerializer.deserialize(json);
        System.out.println("person from json: "+ personFromJson);

        assertNotNull(personFromJson);
        assertEquals(person.getDateOfBirth(), personFromJson.getDateOfBirth());
        assertEquals(MALE, personFromJson.getGender());
        assertEquals("John", personFromJson.getName());
        assertEquals("08106317491", personFromJson.getPhoneNumber());
    }

}
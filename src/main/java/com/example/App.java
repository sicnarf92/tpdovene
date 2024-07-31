package com.example;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Person person = new Person("jean","bonbeur");
        convertToJson(person);
        
        String prenom = person.getFirstName();
        String nom = person.getLastName();

        capitalizeString(prenom);
        capitalizeString(nom);
    }
    
    public static String convertToJson(Object obj) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
        	System.out.println(objectMapper.writeValueAsString(obj));
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String capitalizeString(String str) {
    	System.out.println(StringUtils.capitalize(str));
        return StringUtils.capitalize(str);
    }
}

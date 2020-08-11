package com.adarsh.spring.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by Adarsh on 4/24/15.
 */
@Component(value = "jsonFileComparator")
public class JsonFileComparator {

    public boolean compareJson(String actualJsonString, String filePath) throws JsonProcessingException, IOException {
        final ObjectMapper mapper = new ObjectMapper();
        final JsonNode actualTree = mapper.readTree(actualJsonString);
        final Resource expectedJsonFileResource = new ClassPathResource(filePath);
        final JsonNode expectedTree = mapper.readTree(expectedJsonFileResource.getFile());
        return actualTree.equals(expectedTree);
    }

}

package llm;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.bind.annotation.PathVariable;


@SpringBootTest
@AutoConfigureMockMvc
public class CarControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getCars() throws Exception {
        String expected = "[{\"id\":\"0\",\"brand\":\"Toyota\",\"rego\":\"DMB-08Q\",\"model\":\"CAMRY\",\"createTime\":null,\"updateTime\":null},{\"id\":\"1\",\"brand\":\"Tesla\",\"rego\":\"MWQ-0A7\",\"model\":\"Model-Y\",\"createTime\":null,\"updateTime\":null}]";

        mvc.perform(MockMvcRequestBuilders.get("/api/cars").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expected)));
    }

    @Test
    public void getCar() throws Exception {
        String expected = "{\"id\":\"0\",\"brand\":\"Toyota\",\"rego\":\"DMB-08Q\",\"model\":\"CAMRY\",\"createTime\":null,\"updateTime\":null}";
        mvc.perform(MockMvcRequestBuilders.get("/api/car/{id}",0).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expected)));
    }

    @Test
    //create new object id:3, brand:Toyota_create
    //return the created object
    //if you want to check the updated database，please use "curl localhost:8080/api/cars" to check
    public void createCar() throws Exception {
        String expected = "{\"id\":\"3\",\"brand\":\"Toyota_create\",\"rego\":\"DMB-08Q\",\"model\":\"CAMRY\",\"createTime\":null,\"updateTime\":null}";
        String input = "{\"id\":\"3\",\"brand\":\"Toyota_create\",\"rego\":\"DMB-08Q\",\"model\":\"CAMRY\",\"createTime\":null,\"updateTime\":null}";
        mvc.perform(MockMvcRequestBuilders.post("/api/car").content(input).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expected)));
    }

    @Test
    //update  id:3, brand:Toyota_create ------> id:3, brand:Toyota_update
    //return the updated object
    //if you want to check the updated database，please use "curl localhost:8080/api/cars" to check
    public void updateCar() throws Exception {
        String expected = "{\"id\":\"3\",\"brand\":\"Toyota_update\",\"rego\":\"DMB-08Q\",\"model\":\"CAMRY\",\"createTime\":null,\"updateTime\":null}";
        String input = "{\"id\":\"3\",\"brand\":\"Toyota_update\",\"rego\":\"DMB-08Q\",\"model\":\"CAMRY\",\"createTime\":null,\"updateTime\":null}";
        mvc.perform(MockMvcRequestBuilders.put("/api/car").content(input).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expected)));
    }

    @Test
    public void deleteCar() throws Exception {
        String expected = "3";
        mvc.perform(MockMvcRequestBuilders.delete("/api/car/{id}",3).accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo(expected)));
    }

}
package llm;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


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
}
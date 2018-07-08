package test.contacts;

import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import contacts.ContactController;
import contacts.ContactRepository;

public class ContactControllerTest {

	  @Test
	  public void testHomePage() throws Exception {
		  ContactRepository contactRepo = Mockito.mock(ContactRepository.class);
		  ContactController controller = new ContactController(contactRepo);
	    MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	    mockMvc.perform(MockMvcRequestBuilders.get("/"))
	           .andExpect(MockMvcResultMatchers.view().name("home"));
	  }

}

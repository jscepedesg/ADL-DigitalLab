package com.adl.api.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.adl.api.controller.ComparisonController;

@WebMvcTest(ComparisonController.class)
public class ComparisonControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	
	@Test
	public void testGetUrlSameLetters() throws Exception {
		mockMvc.perform(get("/comparison/army/mary"))
			.andExpect(status().isOk())
			.andExpect(content().string("true"));
	}
	
	
	@Test
	public void testGetUrlUppercaseAndLowercase() throws Exception {
		mockMvc.perform(get("/comparison/Army/mary"))
			.andExpect(status().isOk())
			.andExpect(content().string("false"));
	}
	
	
	@Test
	public void testGetUrlWordsDifferentLetters() throws Exception {
		mockMvc.perform(get("/comparison/test/lary"))
			.andExpect(status().isOk())
			.andExpect(content().string("false"));
	}
	
	
	@Test
	public void testGetUrlDifferentLength() throws Exception {
		mockMvc.perform(get("/comparison/testtest/mary"))
			.andExpect(status().isOk())
			.andExpect(content().string("false"));
	}


}

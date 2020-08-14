package com.test.consumer1;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.test.consumer1.services.connector.Provider1Connector;
import com.test.consumer1.services1.ProductConsumerService;

import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit.PactProviderRule;
import au.com.dius.pact.consumer.junit.PactVerification;
import au.com.dius.pact.core.model.RequestResponsePact;
import au.com.dius.pact.core.model.annotations.Pact;
import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyTestConfig.class)
public class Consumer1Test {
	@Rule
	public PactProviderRule mockProvider = new PactProviderRule("EcommereceProvider", "localhost", 8066, this);

	@Autowired
	private ProductConsumerService consumerService;

	@Pact(consumer = "myconsumer") // will default to the provider name from
									// mockProvider in Rule
	public RequestResponsePact defineExpectation(PactDslWithProvider builder) {
		return builder.uponReceiving("get Product list by Apple").path("/app/manufacturers/name/Apple").method("GET")
				.willRespondWith().status(200)
				.body("{\n" + "    \"manufacturerVOs\": [\n" + "        {\n"
						+ "            \"manufacturerId\": \"5678\",\n"
						+ "            \"manufacturerName\": \"Apple\",\n"
						+ "            \"manufacturerAddress\": \"Bangalore\",\n" + "            \"productsList\": [\n"
						+ "                {\n" + "                    \"productId\": \"1007\",\n"
						+ "                    \"productName\": \"Apple Mack book Pro\",\n"
						+ "                    \"productType\": \"Laptop\",\n"
						+ "                    \"price\": 90000.0\n" + "                },\n" + "                {\n"
						+ "                    \"productId\": \"1008\",\n"
						+ "                    \"productName\": \"mack book Air\",\n"
						+ "                    \"productType\": \"Laptop\",\n"
						+ "                    \"price\": 75000.0\n" + "                }\n" + "            ]\n"
						+ "        }\n" + "    ]\n" + "}")
				.toPact();

	}

	@Pact(consumer = "myconsumer") // will default to the provider name from mockProvider in Rule

	public RequestResponsePact defineExpectationWithState(PactDslWithProvider builder) {

		return builder
				.given("HP")

				.uponReceiving("get product list by HP")

				.path("/app/manufacturers/name/Hp")

				.method("GET")

				.willRespondWith()

				.status(200)

				.body("{\n" + "  \"manufacturerVOs\": [\n" + "   {\n" + "            \"manufacturerId\": \"5679\",\n"
						+ "            \"manufacturerName\": \"Hp\",\n"
						+ "            \"manufacturerAddress\": \"Mumbai\",\n" + "            \"productsList\": [\n"
						+ "                {\n" + "                    \"productId\": \"1009\",\n"
						+ "                    \"productName\": \"pro book\",\n"
						+ "                    \"productType\": \"Laptop\",\n"
						+ "                    \"price\": 83000.0\n" + "                }\n" + "            ]\n"
						+ "        }\n" + "    ]\n" + "}")

				.toPact();

	}

	@Test

	@PactVerification(fragment = "defineExpectation")
	public void test() throws IOException {

		Assert.assertTrue(consumerService.getProductList("Apple").isPresent());
	}

	@Test

	@PactVerification(fragment = "defineExpectationWithState")

	public void runTestWithState() throws IOException {

		Assert.assertTrue(consumerService.getProductList("Hp").isPresent());

	}

}

@TestConfiguration
class MyTestConfig {

	@Bean
	public ProductConsumerService getProductConsumerService() {
		return new ProductConsumerService();
	}

	@Bean
	public Provider1Connector getProviderConnector(ObjectMapper objectMapper, RestTemplateBuilder restTemplateBuilder) {
		return new Provider1Connector("http://localhost:8066/app", restTemplateBuilder, objectMapper);
	}

	@Bean
	public ObjectMapper getObjectMapper() {
		return new ObjectMapper();
	}

	@Bean
	public RestTemplateBuilder getRestTemplateBuilder() {
		return new RestTemplateBuilder();
	}

}

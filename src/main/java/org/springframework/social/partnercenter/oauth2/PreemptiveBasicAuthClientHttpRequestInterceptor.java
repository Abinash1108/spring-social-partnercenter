package org.springframework.social.partnercenter.oauth2;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.security.crypto.codec.Base64;

class PreemptiveBasicAuthClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {

	private final String username;

	private final String password;

	private final Charset charset;

	public PreemptiveBasicAuthClientHttpRequestInterceptor(String username, String password) {
		this(username, password, Charset.forName("UTF-8"));
	}

	public PreemptiveBasicAuthClientHttpRequestInterceptor(String username, String password, Charset charset) {
		this.username = username;
		this.password = password;
		this.charset = charset;
	}

	public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
		request.getHeaders().set("Authorization", "Basic " + new String(Base64.encode((username + ":" + password).getBytes(charset)), charset));
		return execution.execute(request, body);
	}

}

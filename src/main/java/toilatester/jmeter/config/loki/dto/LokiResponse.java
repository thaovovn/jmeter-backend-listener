package toilatester.jmeter.config.loki.dto;

public class LokiResponse {
	public int status;
	public String body;

	public LokiResponse(int status, String body) {
		this.status = status;
		this.body = body;
	}
}

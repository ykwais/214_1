package lab3.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Http {

  private String url;
  private String method;
  private String token;
  private Map<String, String> headers;

  public Http(builder builder){
    this.url = builder.url;
    this.method = builder.method;
    this.token = builder.token;
    this.headers = Map.copyOf(builder.headers);
  }


  public static final class builder{
    private String url;
    private String method = "GET";
    private String token;
    private Map<String, String> headers = new HashMap<>();

    public builder url(String url){
      this.url = url;
      return this;
    }

    public builder method(String method){
      this.method = method;
      return this;
    }

    public builder token(String token){
      this.token = token;
      return this;
    }

    public builder header(String key, String value){
      this.headers.put(key, value);
      return this;
    }

    public Http build(){
      return new Http(this);
    }


  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Map<String, String> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, String> headers) {
    this.headers = headers;
  }

  @Override
  public String toString() {
    return "Http{" +
           "url='" + url + '\'' +
           ", method='" + method + '\'' +
           ", token='" + token + '\'' +
           ", headers=" + headers +
           '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Http http = (Http) o;
    return Objects.equals(url, http.url) && Objects.equals(method, http.method)
           && Objects.equals(token, http.token) && Objects.equals(headers,
        http.headers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, method, token, headers);
  }
}

package lab3.builder;

public class LocalMain {

  public static void main(String[] args){
    Http http = new Http.builder()
        .token("fsdklfhjdkhjksdhfjksd")
        .url("/api/v1/getInsatnse")
        .header("X-system-key", "zdfsdsdfsad")
        .header("key2", "value2")
        .build();

    System.out.println(http);
  }

}

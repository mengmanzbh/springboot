package spring;

import java.io.IOException;

import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainController {
	
	  static OkHttpClient client = new OkHttpClient();
	  static String run(String url) throws IOException {
	    Request request = new Request.Builder()
	        .url(url)
	        .build();

	    try (Response response = client.newCall(request).execute()) {
	      return response.body().string();
	    }
	  }

  public static void main(String[] args) throws IOException {
	  String response = run("http://zwmn.ex-starch.com:8003/api/infos/goods/getlist");
	  System.out.println(response);

	  }
  }

package mk.mkkabi.clients;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class WebClient1 {

    public static String getAllTransactions(String url) throws IOException {
        HttpClient httpclient = HttpClients.createDefault();
		  
        HttpPost httppost = new HttpPost(url);

//Execute and get the response.
        HttpResponse response = httpclient.execute(httppost);
        HttpEntity entity = response.getEntity();

        BufferedReader reader = new BufferedReader(new InputStreamReader(entity.getContent()), 2048);
        StringBuilder sb = new StringBuilder();
        
        if (entity != null) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }

        }
        
        return sb.toString();
    }

}

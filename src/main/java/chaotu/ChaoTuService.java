package chaotu;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.http.HttpConnection;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

@Service
public class ChaoTuService {
    public static void uploadCad2ChaoTu(String applyinstId) throws Exception {
        String filePath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator
                + "测试.dwg";
        CloseableHttpClient httpClient = HttpClients.createDefault();

        //get 测试
        /*HttpGet uploadFile = new HttpGet("http://localhost:8084/cp-rest/chaotu/upload/cad");
        CloseableHttpResponse response = httpClient.execute(uploadFile);
        HttpEntity responseEntity = response.getEntity();
        String sResponse = EntityUtils.toString(responseEntity, "UTF-8");
        System.out.println("Post 返回结果" + sResponse);*/


        HttpPost uploadFile = new HttpPost("http://localhost:7050/cp-rest/chaotu/upload/cad");
        Map<String, String> map = new HashMap<>();
        map.put("projectCode", "123456789");
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setContentType(ContentType.MULTIPART_FORM_DATA);
        builder.setCharset(Charset.forName("utf-8"));
        builder.addTextBody("attrs", JSON.toJSONString(map));

        // 把文件加到HTTP的post请求中
        File f = new File(filePath);
        System.out.println(f.getName());
        builder.addBinaryBody(
                "file",
                new FileInputStream(f),
                ContentType.APPLICATION_OCTET_STREAM,
                f.getName().getBytes("utf-8").toString()
        );

        HttpEntity multipart = builder.build();
        uploadFile.setEntity(multipart);
        CloseableHttpResponse response = httpClient.execute(uploadFile);
        HttpEntity responseEntity = response.getEntity();
        String sResponse = EntityUtils.toString(responseEntity, "UTF-8");
        Map<String, Object> parse = (Map<String, Object>) JSON.parse(sResponse);
        Boolean success = (Boolean) parse.get("success");
        Object message = parse.get("message");

        System.out.println(success);
        System.out.println(message.toString());
        System.out.println("Post 返回结果" + sResponse);

    }

    public static void main(String[] args) throws Exception {
        System.out.println(System.getProperty("user.dir"));
        uploadCad2ChaoTu("");
    }
}

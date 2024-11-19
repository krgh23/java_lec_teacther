package pkg05_openapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class OpenapiEx {

  public static void a() throws Exception {
    
    String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1%2BwT%2B5jqamBef%2FErC%2F5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ%3D%3D";
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append(serviceKey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    
    URL url = new URL(builder.toString());
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    BufferedReader in = null;
    if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
      in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    } else {
      in = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
    }
    
    StringBuilder responseBody = new StringBuilder();
    String line = null;
    while ((line = in.readLine()) != null)
      responseBody.append(line);
    
    System.out.println(responseBody.toString());
    
    in.close();
    conn.disconnect();
    
  }
  
  public static void b() throws Exception {
    
    String serviceKey = "bEQBRPHjt0tZrc7EsL0T8usfsZ1%2BwT%2B5jqamBef%2FErC%2F5ZO6N7nYdRmrwR91bh5d3I1AQeY5qdbJOF6Kv0U1CQ%3D%3D";
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getVilageFcst");
    builder.append("?serviceKey=").append(serviceKey);
    builder.append("&pageNo=").append(1);
    builder.append("&numOfRows=").append(1000);
    builder.append("&base_date=").append(20241118);
    builder.append("&base_time=").append(0600);
    builder.append("&nx=").append(61);
    builder.append("&ny=").append(125);
    
    DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder docBuilder = builderFactory.newDocumentBuilder();
    Document doc = docBuilder.parse(builder.toString());
    
    doc.getDocumentElement().normalize();
    System.out.println("Root tag : " + doc.getDocumentElement().getNodeName());  // <response> 태그
    
    NodeList nodeList = doc.getElementsByTagName("item");  // <item> 태그 모두 가져오기
    System.out.println("노드 갯수 : " + nodeList.getLength());  // 700 (<item> 태그가 700개)
    
    for(int i = 0, length = nodeList.getLength(); i < length; i++) {
      
      Node node = nodeList.item(i);  // 각 <item> 태그
      System.out.println(((Element) node).getElementsByTagName("baseDate").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("baseTime").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("category").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstDate").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstTime").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("fcstValue").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("nx").item(0).getTextContent());
      System.out.println(((Element) node).getElementsByTagName("ny").item(0).getTextContent());
      System.out.println("----------");
      
    }
    
  }
  
  public static void main(String[] args) throws Exception {
    b();   
  }

}

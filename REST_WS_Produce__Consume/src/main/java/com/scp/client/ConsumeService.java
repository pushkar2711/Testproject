package com.scp.client;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import com.scp.bean.Product;
import com.scp.entities.ProductEntity;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ConsumeService {

	public static void main(String[] args) throws JSONException, org.codehaus.jettison.json.JSONException {
	Response response=RestAssured.get("http://localhost:8090/REST_WS_Produce__Consume/rest/products");
	String responseString=response.asString();
	JSONArray jsonArray=new JSONArray(responseString);
	JSONObject json=null;
	List<ProductEntity> products=new ArrayList<>();
	for(int i=0;i<jsonArray.length();i++){
		json=new JSONObject(jsonArray.get(i).toString());
		products.add(new ProductEntity(json.getInt("productId"),json.getString("productName"),json.getInt("productPrice"),json.getString("productCategory")));
		}
	System.out.println("Webservices json to object"+products);
		// TODO Auto-generated method stub
	}

}

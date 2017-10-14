package com.gocchan.testgithub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

//import com.fasterxml.jackson.databind.JsonNode;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class TestGoogleAPI {

	private static final String API_URL = "http://www.google.com/transliterate?langpair=ja-Hira|ja&text=";


    public String convert(String str) {

    	String test = "";
		long start;
		long end;



		/*

    	// map速度計測 772ms
		test = "";
		start = System.currentTimeMillis();
    	for(int i=1; i<=30000; i++) {
			if(TestConst.ZENKAKU.containsKey('[')) {
				test += TestConst.ZENKAKU.get('[');
			}
    	}
		end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");

    	// 配列速度計測
		test = "";
		start = System.currentTimeMillis();
    	for(int i=1; i<=30000; i++) {
    		for(int idx=0; idx < TestConst.hairetuZENKAKU[0].length; idx++) {
				if(TestConst.hairetuZENKAKU[0][idx] == '[') {
					test += TestConst.hairetuZENKAKU[1][idx];
				}
    		}
    	}
		end = System.currentTimeMillis();
		System.out.println((end - start)  + "ms");




		System.out.println("=========================================");

		*/

    	// 送信するかな文字が53字を超えるとエラー
    	if(str.length() > 53) {

    		//この場合、句読点や空白で２つに分けれないかやってみる


    		//watashinoienihaittaratoumeininngenndakaraanatahananndemoshitemokizukarenaidemohenntainokimochidyatteitte
    		System.out.println("WIRNING !!! 文字数：" + str.length());


			//out += buf.substring(0, cutting); // 1文字目からはみ出た分まで
			//buf = buf.substring(cutting); // 残す分（3文字）

    		int cnt = 0;
    		int p = 0;
    		String now = "";
    		String buf = "";
    		String key = "";
    		while(p < str.length()) {
    			cnt++;

    			if(p+50 > str.length()) {
    				//System.out.println(cnt + "回目：" + (str.length() - 50) + "～" + (str.length()) + "まで");


    				now = getGoogleKana(str.substring(str.length() - 50));
    				int len = 0;
    				len = buf.length();
    				key = buf.substring(len-8, len-4);

    				if(findString(buf.substring(len-8), key) == 1 && findString(now, key) == 1) {
    					buf = buf.substring(0, len-8) + now.substring(now.indexOf(key));
    					//System.out.println(">>" + buf);
    				} else {

    					//System.out.println("１１１１１１１１１１１１１");
    					/*
    					System.out.println("P:" + p);
    					System.out.println("KEY:" + key);
    					System.out.println("L:" + buf.substring(len-10));
    					System.out.println("R:" + now);
						*/


    					buf = str;
    					break;
    				}

    				p = str.length();
    			} else {
    				now = getGoogleKana(str.substring(p, p + 50));
    				if( cnt != 1) {

	    				int len = 0;
	    				len = buf.length();
	    				key = buf.substring(len-8, len-4);



	    				if(findString(buf.substring(len-8), key) == 1 && findString(now, key) == 1) {
	    					buf = buf.substring(0, len-8) + now.substring(now.indexOf(key));
	    					//System.out.println(">>" + buf);
	    				} else {
/*
	    					System.out.println("１１１１１１１１１１１１１");

	    					System.out.println("P:" + p);
	    					System.out.println("KEY:" + key);
	    					System.out.println("L:" + buf.substring(len-10));
	    					System.out.println("R:" + now);
*/

	    					buf = str;
	    					break;
	    				}


	    				//System.out.println(cnt + "回目：" + p + "～" + (p + 50) + "まで, キーワード：" + key);
    				} else {
    					buf = now;
    				}
        			p += 30; //30進める
        			//

    			}





    		}


			//System.out.println("どうだい？：" + buf);


    		return buf;
    	}
    	return getGoogleKana(str);
    }

    private String getGoogleKana(String str) {

    	String out = "";
		try {
    		String enc_hiragana = URLEncoder.encode(str,"UTF-8");

    		HttpURLConnection conn = null;

    		conn = (HttpURLConnection) new URL(API_URL + enc_hiragana + "&charset=UTF-8").openConnection();
    		conn.setRequestMethod("GET");
    		conn.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
    		conn.connect();

			if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){

    			//StringBuffer responseJSON = new StringBuffer();
				String json = "";

    			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));

    			String inputLine;

    			while ((inputLine = reader.readLine()) != null) {
    				//responseJSON.append(inputLine.substring(0, inputLine.indexOf("\t")));
                    //responseJSON.append(inputLine);
    				json += inputLine;
                }

    			//String fromStr = responseJSON.toString();
    			//[["ここでは",["ここでは","個々では","ココでは","此 処では","ココデは"]],["きものを",["着物を","きものを","キモノを","被物を","木ものを"]],["ぬぐ",["脱ぐ","ぬぐ","ヌグ","拭","揩"]]]
    			//kokodehakimonowonugimasu.

    			//long start;
    			//long end;
     			//System.out.println(fromStr);

     			/*
     			start = System.currentTimeMillis();
    			System.out.println("Json Test 02:" + edtJson2(fromStr));
    			end = System.currentTimeMillis();
    			System.out.println((end - start)  + "ms");
				*/
     			//start = System.currentTimeMillis();
     			out = edtJson(json);
    			//out = edtJson2(fromStr);

    			//end = System.currentTimeMillis();
    			//System.out.println((end - start)  + "ms");
    			/*
     			start = System.currentTimeMillis();
    			System.out.println("Json Test 01:" + edtJson(fromStr));
    			end = System.currentTimeMillis();
    			System.out.println((end - start)  + "ms");
				*/


    			if(out.length() > 0){
    				// 空じゃなければ（エラー時＆文字数オーバー時は空となる）
    				return out.toString();

    			}
    		}

		} catch (IOException e) {
			// TODO 自動生成された catch ブロック

			//System.out.println("***");
			e.printStackTrace();
		}
		return out;
    }

    /*
    private String edtJson(String json) {
    	String str = "";
    	try {
	    	ObjectMapper mapper = new ObjectMapper();
	    	JsonNode root = mapper.readTree(json);
	    	for(JsonNode n : root) {
	    		str += n.get(1).get(0).asText();
	    	}

    	}catch (IOException ioe) {
	    	ioe.printStackTrace();
	    }
    	return str;
	}
	*/
    private String edtJson(String json) {

    	int p;
    	String str = "";
		while ((p = json.indexOf("\",[\"")) != -1){	// ",[" が見つからなくなるまで（漢字候補の先頭を表す文字列）

			json = json.substring(p + 4);
        	String wrk = json.substring(0, json.indexOf("\""));
        	wrk = wrk.replaceAll("（", " (");
        	wrk = wrk.replaceAll("）", ") ");

        	//str.append(wrk);
        	str += wrk;
        }
    	return str;
	}

    private int findString(String str, String key) {

    	int cnt = 0;
    	int p = 0;
    	while((p = str.indexOf(key)) != -1) {
    		cnt++;
    		str = str.substring(p + key.length());
    	}
    	return cnt;
    }
}

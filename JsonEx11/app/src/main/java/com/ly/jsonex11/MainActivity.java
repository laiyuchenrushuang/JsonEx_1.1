package com.ly.jsonex11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.ly.jsonex11.enity.DataGroup;
import com.ly.jsonex11.enity.JsonRootBean;

import org.json.JSONArray;

/**
 *data1:
 * {
 *     "data": {
 *         "uid": "213",
 *         "user_name": "萌小八",
 *         "user_image": null,
 *         "user_address": "中国北京朝阳",
 *         "id": "63",
 *         "path1": "20151117/564aa3d635f74.png",
 *         "path2": "20151117/564aa3d637268.png",
 *         "path3": null,
 *         "path4": null,
 *         "path5": null,
 *         "path6": null,
 *         "path7": null,
 *         "path8": null,
 *         "path9": null,
 *         "content": "太好吃了",
 *         "type": "2",
 *         "imgnum": "2",
 *         "count": "1",
 *         "c_time": "1447732182",
 *         "special": null,
 *         "cnum": "0",
 *         "gz": 3,
 *         "dz": 3,
 *         "sc": 3,
 *         "sid": null,
 *         "labels": [
 *             {
 *                 "lname": "粉丝",
 *                 "lid": "57"
 *             },
 *             {
 *                 "lname": "酸菜",
 *                 "lid": "58"
 *             }
 *         ]
 *     },
 *     "info": [
 *         [
 *             {
 *                 "lid": "56",
 *                 "lname": "好好吃",
 *                 "xaxis": "0.5989583134651184",
 *                 "yaxis": "0.3119140565395355",
 *                 "direct": "left",
 *                 "lclass": "zl"
 *             }
 *         ],
 *         [
 *             {
 *                 "lid": null,
 *                 "lname": null,
 *                 "xaxis": null,
 *                 "yaxis": null,
 *                 "direct": null,
 *                 "lclass": null
 *             }
 *         ]
 *     ],
 *     "status": 1
 * }
 *-------------------------------------------------------------------------------------------------
 * data2:
 * {"code":-1,"message":"成功","data":[
 * {"checkTime":1542766408199,"currVin":"LVSHCAME4BF810787","oldVin":"","systemName":"动力系统"},
 * {"checkTime":1542766408199,"currVin":"LVSHCAME4BF810787","oldVin":"","systemName":"PCM （动力控制模块）"},
 * {"checkTime":1542766408199,"currVin":"LVSHCAME4BF810787","oldVin":"","systemName":"EPS （电动助力转向模块）"},
 * {"checkTime":1542766408199,"currVin":"LVSHCAME4BF810787","oldVin":"","systemName":"IC （仪表）"}],
 * "mile":"90"}
 *
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Gson gss = JsonExUtils.getInstanse().getGsonObject();
        DataGroup dataGroup = gss.fromJson(DataUtils.data1, DataGroup.class);
        JsonRootBean jsonRootBean = gss.fromJson(DataUtils.data2, JsonRootBean.class);

        //data1获得第一个数组结构  粉丝好不好吃属性

        String eatNice = dataGroup.getInfo().get(0).get(0).getLname();
        Log.d("lylog"," label 0  name ="+eatNice);

        //data2获得 第三数组的
        String vin = jsonRootBean.getData().get(2).getCurrVin();
        Log.d("lylog","vin = "+vin);

        //data1获得第一个数组结构  粉丝好不好吃属性
        JsonParser parser = JsonExUtils.getInstanse().getJsonParser();
        JsonObject jsonObject = (JsonObject) parser.parse(DataUtils.data1);
        JsonArray infoarray = jsonObject.get("info").getAsJsonArray();
        JsonArray infoarray1 = infoarray.get(0).getAsJsonArray();
        JsonObject jsonObject1 = infoarray1.get(0).getAsJsonObject();
        String eatNice1 = jsonObject1.get("lname").getAsString();
        Log.d("lylog"," label 0  name ="+eatNice1);

        //data2获得 第三数组的
        JsonObject jsonObject2 = (JsonObject) parser.parse(DataUtils.data2);
        JsonArray datarray = jsonObject2.get("data").getAsJsonArray();
        JsonObject jsonObject3 = datarray.get(2).getAsJsonObject();
        String vin1 = jsonObject3.get("currVin").getAsString();
        Log.d("lylog","vin = "+vin1);
    }
}

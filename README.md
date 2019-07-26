# JsonEx_1.1

* 现实的输出结果是：
* 2019-07-26 15:34:45.865 15885-15885/? D/lylog:  label 0  name =好好吃
* 2019-07-26 15:34:45.865 15885-15885/? D/lylog: vin = LVSHCAME4BF810787
* 2019-07-26 15:34:45.876 15885-15885/? D/lylog:  label 0  name =好好吃
* 2019-07-26 15:34:45.878 15885-15885/? D/lylog: vin = LVSHCAME4BF810787

* 注意步骤：
1. 首先导入包 implementation 'com.google.code.gson:gson:2.8.0'（因为老是忘记）
2. JsonParse.parse  Gson.fromJson  JsonArray JsonObject,注意获取元素时加getAsJsonObject  getAsJsonAraay  getAsString  int  float...
3. 关于Bean的生成 用网站：http://www.bejson.com/json2javapojo/new/
4. 实体类的扩展并不影响Gson去解析，有则加 无为null

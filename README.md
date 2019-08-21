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


# FastJson 

1. 先添加依赖 implementation 'com.alibaba:fastjson:1.1.71.android'
2. 解析的方式
3. 数据源一部分

{
  "status": true,
  "code": 0,
  "message": "成功",
  "data": [
    {
      "xtlb": "00",
      "dmlb": "1008",
      "dmz": "A",
      "dmsm1": "白",
      "dmsm2": null,
      "dmsm3": null,
      "dmsm4": null,
      "zt": "1",
      "ywdx": null
    },
----------
 
        //对象生成json字符串
        var cb = ColorBean()
        var data = cb.Data()
        var data2 = cb.Data()
        data.dmlb = "阿拉斯加"
        data.dmsm1 = "0101"

        data2.dmlb = "新西兰"
        data2.dmsm1 = "0102"
        var listData = ArrayList<ColorBean.Data>()
        listData.add(data)
        listData.add(data2)
        cb.setData(listData)
        cb.setCode(0)
        cb.setMessage("success")

        var strJson = JSON.toJSONString(cb)
        Log.d("lylog"," result = "+strJson)  //对象 生成json字符串

        var colorEnity= JSON.parseObject(StringData.data,ColorBean::class.java)
        Log.d("lylog"," result = "+ colorEnity.getData()!![0].dmsm1)  //生成json字符串对象

        var list1 = JSON.toJSONString(colorEnity.getData()!![0])
        var map = JSON.parse(list1) as Map<String,String>
        Log.d("lylog"," result = "+ map["dmlb"])  //string 生成map

        var array= JSON.parseObject(map.toString())
        Log.d("lylog"," result = "+ array.toString())  //map 生成Json
===================

  结果显示：
  
  2019-08-21 14:05:09.403 18592-18592/? D/lylog:  result = {"code":0,"data":[{"dmlb":"阿拉斯加","dmsm1":"0101"},{"dmlb":"新西兰","dmsm1":"0102"}],"message":"success","status":false,"total":0}
 
  2019-08-21 14:05:09.439 18592-18592/? D/lylog:  result = 白

  2019-08-21 14:05:09.440 18592-18592/? D/lylog:  result = 1008

  2019-08-21 14:05:09.443 18592-18592/? D/lylog:  result = {"dmlb":"1008","dmsm1":"白","dmz":"A","xtlb":"00","zt":"1"}

===================
 
 

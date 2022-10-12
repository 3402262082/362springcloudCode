package com.bdqn.util;

import com.alibaba.fastjson.JSON;
import com.bdqn.Espojo.JsonRootBean;
import com.bdqn.Espojo.ListObject;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.cluster.Health;
import io.searchbox.core.Delete;
import io.searchbox.core.DeleteByQuery;
import io.searchbox.core.Index;
import io.searchbox.core.Search;

import java.io.IOException;

public class TextES {

    public static void main(String[] args) throws IOException {
        //insert();
        // delete();
        //Heath();
        search();
    }

    public static void search() throws IOException {
        Search search = new Search.Builder("").addIndex("userdb").addType("utbale").build();

        JestClient client = Client.getInstance().getJestClient();

        JestResult result = client.execute(search);

        System.out.println(result.getJsonString());

        JsonRootBean resultNew = JSON.parseObject(result.getJsonString(), JsonRootBean.class);


        for (ListObject obj :resultNew.getHits().getHits()) {
            System.out.println(obj._source.getName());

        }
    }



    public static void insert() throws IOException {

        for (int i=1;i<=100;i++){
            Userpojo pojo = new Userpojo();
            pojo.setId(i);
            pojo.setName("测试名字"+i);
            pojo.setMark("备注"+i);


            Index index = new Index.Builder(pojo).index("userdb").type("utbale").id(i+"").build();

            JestClient client = Client.getInstance().getJestClient();

            JestResult result = client.execute(index);
            System.out.println(result.getJsonString());


        }



    }



    public static void Heath() throws IOException {
        Health health = new Health.Builder().build();

        JestClient client = Client.getInstance().getJestClient();

        JestResult result = client.execute(health);

        System.out.println(result.getJsonString());
    }


    public static void delete() throws IOException {

        for (int i=1;i<=100;i++){
            Delete delete = new Delete.Builder(i+"").index("userdb").type("utbale").build();

            JestClient client = Client.getInstance().getJestClient();

            JestResult result = client.execute(delete);
            System.out.println(result.getJsonString());
        }



    }

    public static void deleteByparam() throws IOException {
        String str = "{doc:{name:\"测试名字1\"}}";
        DeleteByQuery D = new DeleteByQuery.Builder(str).addIndex("userdb").addType("utbale").build();
        JestClient client = Client.getInstance().getJestClient();

        JestResult result = client.execute(D);
        System.out.println(result.getJsonString());
    }







}

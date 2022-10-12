/**
  * Copyright 2021 json.cn 
  */
package com.bdqn.Espojo;
import java.util.List;

/**
 * Auto-generated: 2021-08-12 17:58:3
 *
 * @author json.cn (i@json.cn)
 * @website http://www.json.cn/java2pojo/
 */
public class Hits {

    private int total;
    private int max_score;
    public void setTotal(int total) {
         this.total = total;
     }
     public int getTotal() {
         return total;
     }

    public void setMax_score(int max_score) {
         this.max_score = max_score;
     }
     public int getMax_score() {
         return max_score;
     }

    public List<ListObject> getHits() {
        return hits;
    }

    public void setHits(List<ListObject> hits) {
        this.hits = hits;
    }

    private List<ListObject> hits;


}
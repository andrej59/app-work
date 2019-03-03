package ru.ajana.work.common.elastic;

import java.io.StringWriter;
import org.apache.http.HttpHost;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.builder.SearchSourceBuilder;

public class ElasticQuery {

  public static void main(String[] args) {
    RestHighLevelClient client = new RestHighLevelClient(
        RestClient.builder(
            new HttpHost("localhost", 9200, "http"),
            new HttpHost("localhost", 9201, "http")));



//    SearchResponse response = client.prepareSearch("index1", "index2")
//        .setSearchType(SearchType.DFS_QUERY_THEN_FETCH)
//        .setQuery(QueryBuilders.termQuery("multi", "test"))                 // Query
//        .setPostFilter(QueryBuilders.rangeQuery("age").from(12).to(18))     // Filter
//        .setFrom(0).setSize(60).setExplain(true)
//        .get();
    SearchRequest searchRequest = new SearchRequest();
    SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
    StringWriter stringWriter  = new StringWriter();
    //XContentBuilder builder = XContentFactory.jsonBuilder(null);
    //SearchSourceBuilder searchSourceBuilder = SearchSourceBuilder.highlight().innerXContent(builder);
    searchSourceBuilder.query(QueryBuilders.matchAllQuery());
    searchRequest.source(searchSourceBuilder);
    //XContentParser parser = new JsonXContentParser();
  }
}

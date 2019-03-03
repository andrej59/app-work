package ru.ajana.work.common.elastic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.ebean.EbeanServer;
import io.ebean.EbeanServerFactory;
import io.ebean.ExpressionList;
import io.ebean.config.DocStoreConfig;
import io.ebean.config.ServerConfig;
import io.ebean.config.properties.PropertiesLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ajana.work.common.elastic.model.IndexPerson;

/**
 * Работа с Elasticsearch и Ebean.
 */
public class EbeanMapping {

  private static final Logger LOG = LoggerFactory.getLogger(EbeanMapping.class);

  public static void main(String[] args) throws JsonProcessingException {
    Map<String, Object> filter = new HashMap<>();
    filter.put("lastName", "потапов");
    //filter.put("firstName", "матвей");
    List<IndexPerson> personList = search(filter);
    ObjectMapper mapper = new ObjectMapper();
    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    LOG.info("Json: {}", mapper.writeValueAsString(personList));
    LOG.info("count: {}", personList.size());
  }

  public static List<IndexPerson> search(Map<String, Object> queryFilter) {
    EbeanServer ebeanServer = getEbeanServer();

    //String sql = "SELECT p.id, p.lastname as lastname  FROM person p";
    //RawSqlBuilder rawSqlBuilder = RawSqlBuilder.parse(sql);
    //rawSqlBuilder.columnMapping("lastname", "lastName");
    final ExpressionList<IndexPerson> expressionList = ebeanServer.find(IndexPerson.class).where();
    //final ExpressionList<IndexPerson> expressionList = ebeanServer.find(IndexPerson.class).where();
    queryFilter.forEach((k, v) -> {
      expressionList.ilike(k, "%" + String.valueOf(v) + "%");
    });

    return expressionList.setFirstRow(0)
        .setMaxRows(10)
        .findPagedList().getList();
  }

  private static EbeanServer getEbeanServer() {
    final Properties properties = PropertiesLoader.load();
    List<String> packages = new ArrayList<>();
    packages.add("ru.ajana.work.common.elastic.model");
    ServerConfig ebeanConfig = new ServerConfig();
    ebeanConfig.setPackages(packages);
    ebeanConfig.setDefaultServer(false);
    ebeanConfig.setName("ELASTICSEARCH");

    // Конфигурация для Elasticsearch
    DocStoreConfig docStoreConfig = new DocStoreConfig();
    docStoreConfig.setUrl(properties.getProperty("ebean.docstore.url"));
    //docStoreConfig.setPathToResources(properties.getProperty("ebean.docstore.pathToResources"));
    //docStoreConfig.setMappingPath(properties.getProperty("ebean.docstore.mappingPath"));
    docStoreConfig.setGenerateMapping(false);
    docStoreConfig.setActive(true);
    docStoreConfig.setDropCreate(false);
    docStoreConfig.setCreate(false);

    ebeanConfig.setDocStoreOnly(true);
    ebeanConfig.setDocStoreConfig(docStoreConfig);
    return EbeanServerFactory.create(ebeanConfig);
  }
}

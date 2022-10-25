package com.pm.demo.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class CustomRoutingDS extends AbstractRoutingDataSource {

  @Override
  protected String determineCurrentLookupKey() {
    return TenantContext.getCurrentTenant();
  }
}

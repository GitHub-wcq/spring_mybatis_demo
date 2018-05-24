package com.wcq.datasourcewr.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		System.out.println("datasourcewraop001 : " + DBContextHolder.getDbType());
		return DBContextHolder.getDbType();
	}

}

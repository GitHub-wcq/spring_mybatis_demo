package com.wcq.datasourcewraop001.util;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class DynamicDataSource extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		System.out.println("datasourcewraop001 : " + DynamicDataSourceHolder.getDataSource());
		return DynamicDataSourceHolder.getDataSource();
	}

}

package com.keybank.enrollment.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class ConfigPropertiesHolder {
@Value("${o2serviceUrl}")
private String o2serviceUrl;

public String getO2serviceUrl() {
	return o2serviceUrl;
}

public void setO2serviceUrl(String o2serviceUrl) {
	this.o2serviceUrl = o2serviceUrl;
}


}

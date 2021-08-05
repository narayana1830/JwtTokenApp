/**
 * 
 */
/**
 * @author DELL
 *
 */
module TokenApp {
	exports com.java11practice.apps.config;
	requires java.base;
	requires java.validation;
	requires spring.security.config;
	requires spring.context;
	requires spring.beans;
	requires spring.security.core;
	requires tomcat.embed.core;
	requires spring.security.web;
	requires spring.web;
	requires jjwt;
	requires spring.boot;
	requires spring.boot.autoconfigure;
}
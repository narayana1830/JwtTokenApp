/**
 * 
 */
/**
 * @author DELL
 *
 */
open module JwtTokenAuthApp {
	requires java.base;
	//requires java.validation;
	requires spring.security.config;
	requires spring.core;
	requires spring.context;
	requires spring.beans;
	requires spring.security.core;
	requires tomcat.embed.core;
	requires spring.security.web;
	requires spring.web;
	requires jjwt;
	requires spring.boot;
	requires spring.boot.autoconfigure;
	requires java.sql;
	requires commons.logging;
	requires java.instrument;
	exports com.java11practice.apps.config;
	exports com.java11practice.apps.controller;
	exports com.java11practice.apps.service;
	exports com.java11practice.apps.model;
}
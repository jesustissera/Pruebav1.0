dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	username = "root"
	password = "" // your mysql password here
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
	cache.use_second_level_cache=true
	cache.use_query_cache=true
	cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
}
// environment specific settings
	environments {
	development {
	dataSource {
	dbCreate = "update" // one of 'create', 'create-drop','update'
	url = "jdbc:mysql://localhost/catalogoclientes"
}
}
test {
	dataSource {
	dbCreate = "update"
	url = "jdbc:mysql://localhost/catalogoclientes"
}
}
	production {
	dataSource {
	dbCreate = "update"
	url = "jdbc:mysql://localhost/catalogoclientes"
}
}
} 
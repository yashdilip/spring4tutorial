<html>
<body>
<h2>Spring 4 MVC REST Controller Example (JSON CRUD Tutorial)</h2>
</body>
<h3>The application has following endpoints</h3>
<p><code><pre>
REST Endpoint 	HTTP Method 	Description
/customers		GET 	Returns the list of customers
/customers/{id} 	GET 	Returns customer detail for given customer {id}
/customers		POST 	Creates new customer from the post data
/customers/{id} 	PUT 	Replace the details for given customer {id}
/customers/{id} 	DELETE 	Delete the customer for given customer {id}
</pre></code>
</p>
<p>
Note:
<ul>
	<li>@RestController = @Controller + @ResponseBody</li>
	<li>@ResponseEntity is meant to represent the entire HTTP response. You can control anything that goes into it: status code, headers, and body.</li>
	<li>@ResponseBody is a marker for the HTTP response body.</li>
	<li>@ResponseStatus declares the status code of the HTTP response.</li>
	<li>@ResponseStatus isn't very flexible. It marks the entire method so you have to be sure that your handler method will always behave the same way. And you still can't set the headers. You'd need the HttpServletResponse or a HttpHeaders parameter.</li>
</ul>

Basically, ResponseEntity lets you do more.
</p>

</html>

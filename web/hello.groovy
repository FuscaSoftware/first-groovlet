def method = request.method

if (!session) {
    session = request.getSession(true)
}

if (!session.counter) {
    session.counter = 1
}

println """
<html>
    <head>
        <title>Groovy Servlet</title>
    </head>
    <body>
        <p>
Hello, #1<br>
${request.remoteHost}: ${session.counter}! ${new Date()}
        </p>
        <pre>
            ${method}
            ${request.remoteHost}
            ${request.requestURI}
            ${context.version}
        </pre>
    </body>
</html>
"""
session.counter = session.counter + 1
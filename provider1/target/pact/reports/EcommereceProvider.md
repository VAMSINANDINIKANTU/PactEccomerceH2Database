# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:01:42 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> HP, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "HP",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:31:44.318+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:01:45 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5678, manufacturerName -> Apple, manufacturerAddress -> Bangalore, productsList -> List(Map(productId -> 1007, productName -> Apple Mack book Pro, productType -> Laptop, price -> 90000.0), Map(productId -> 1008, productName -> mack book Air, productType -> Laptop, price -> 75000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5678",
-            "manufacturerName": "Apple",
-            "manufacturerAddress": "Bangalore",
-            "productsList": [
-                {
-                    "productId": "1007",
-                    "productName": "Apple Mack book Pro",
-                    "productType": "Laptop",
-                    "price": 90000.0
-                },
-                {
-                    "productId": "1008",
-                    "productName": "mack book Air",
-                    "productType": "Laptop",
-                    "price": 75000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:31:45.352+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/Apple"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:03:20 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:33:21.385+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:03:22 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5678, manufacturerName -> Apple, manufacturerAddress -> Bangalore, productsList -> List(Map(productId -> 1007, productName -> Apple Mack book Pro, productType -> Laptop, price -> 90000.0), Map(productId -> 1008, productName -> mack book Air, productType -> Laptop, price -> 75000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5678",
-            "manufacturerName": "Apple",
-            "manufacturerAddress": "Bangalore",
-            "productsList": [
-                {
-                    "productId": "1007",
-                    "productName": "Apple Mack book Pro",
-                    "productType": "Laptop",
-                    "price": 90000.0
-                },
-                {
-                    "productId": "1008",
-                    "productName": "mack book Air",
-                    "productType": "Laptop",
-                    "price": 75000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:33:22.444+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/Apple"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:12:48 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;&nbsp;&nbsp;<span style='color: red'>Request Failed - Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect</span>

```
org.apache.http.conn.HttpHostConnectException: Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:156)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:374)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:393)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:186)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)
	at au.com.dius.pact.provider.ProviderClient.executeRequest(ProviderClient.kt:220)
	at au.com.dius.pact.provider.ProviderClient.makeRequest(ProviderClient.kt:216)
	at au.com.dius.pact.provider.ProviderVerifierBase.verifyResponseFromProvider(ProviderVerifier.kt:506)
	at au.com.dius.pact.provider.junit.target.HttpTarget.testInteraction(HttpTarget.kt:73)
	at au.com.dius.pact.provider.junit.InteractionRunner$interactionBlock$statement$1.evaluate(InteractionRunner.kt:205)
	at au.com.dius.pact.provider.junit.RunStateChanges.evaluate(RunStateChanges.kt:17)
	at au.com.dius.pact.provider.junit.InteractionRunner.run(InteractionRunner.kt:146)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:137)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:51)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
	at java.net.PlainSocketImpl.connect(Unknown Source)
	at java.net.SocksSocketImpl.connect(Unknown Source)
	at java.net.Socket.connect(Unknown Source)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:75)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:142)
	... 30 more

```

# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:12:53 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;&nbsp;&nbsp;<span style='color: red'>Request Failed - Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect</span>

```
org.apache.http.conn.HttpHostConnectException: Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:156)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:374)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:393)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:186)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)
	at au.com.dius.pact.provider.ProviderClient.executeRequest(ProviderClient.kt:220)
	at au.com.dius.pact.provider.ProviderClient.makeRequest(ProviderClient.kt:216)
	at au.com.dius.pact.provider.ProviderVerifierBase.verifyResponseFromProvider(ProviderVerifier.kt:506)
	at au.com.dius.pact.provider.junit.target.HttpTarget.testInteraction(HttpTarget.kt:73)
	at au.com.dius.pact.provider.junit.InteractionRunner$interactionBlock$statement$1.evaluate(InteractionRunner.kt:205)
	at au.com.dius.pact.provider.junit.InteractionRunner.run(InteractionRunner.kt:146)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:137)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:51)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
	at java.net.PlainSocketImpl.connect(Unknown Source)
	at java.net.SocksSocketImpl.connect(Unknown Source)
	at java.net.Socket.connect(Unknown Source)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:75)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:142)
	... 29 more

```

# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:16:05 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:46:06.594+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:16:07 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5678, manufacturerName -> Apple, manufacturerAddress -> Bangalore, productsList -> List(Map(productId -> 1007, productName -> Apple Mack book Pro, productType -> Laptop, price -> 90000.0), Map(productId -> 1008, productName -> mack book Air, productType -> Laptop, price -> 75000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5678",
-            "manufacturerName": "Apple",
-            "manufacturerAddress": "Bangalore",
-            "productsList": [
-                {
-                    "productId": "1007",
-                    "productName": "Apple Mack book Pro",
-                    "productType": "Laptop",
-                    "price": 90000.0
-                },
-                {
-                    "productId": "1008",
-                    "productName": "mack book Air",
-                    "productType": "Laptop",
-                    "price": 75000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:46:07.622+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/Apple"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:16:21 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:46:22.844+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:16:23 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5678, manufacturerName -> Apple, manufacturerAddress -> Bangalore, productsList -> List(Map(productId -> 1007, productName -> Apple Mack book Pro, productType -> Laptop, price -> 90000.0), Map(productId -> 1008, productName -> mack book Air, productType -> Laptop, price -> 75000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5678",
-            "manufacturerName": "Apple",
-            "manufacturerAddress": "Bangalore",
-            "productsList": [
-                {
-                    "productId": "1007",
-                    "productName": "Apple Mack book Pro",
-                    "productType": "Laptop",
-                    "price": 90000.0
-                },
-                {
-                    "productId": "1008",
-                    "productName": "mack book Air",
-                    "productType": "Laptop",
-                    "price": 75000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:46:23.978+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/Apple"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:25:57 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:55:58.954+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:25:59 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:28:55 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T06:58:56.976+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:28:58 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:30:50 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:30:53 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T07:00:53.248+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:35:29 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:35:32 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T07:05:32.087+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:40:44 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:40:47 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-07-27T07:10:47.694+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/HP"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:41:47 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:41:49 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:43:02 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:43:04 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:46:35 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Mon Jul 27 12:46:37 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Fri Aug 14 11:02:23 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;&nbsp;&nbsp;<span style='color: red'>Request Failed - Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect</span>

```
org.apache.http.conn.HttpHostConnectException: Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:156)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:374)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:393)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:186)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)
	at au.com.dius.pact.provider.ProviderClient.executeRequest(ProviderClient.kt:220)
	at au.com.dius.pact.provider.ProviderClient.makeRequest(ProviderClient.kt:216)
	at au.com.dius.pact.provider.ProviderVerifierBase.verifyResponseFromProvider(ProviderVerifier.kt:506)
	at au.com.dius.pact.provider.junit.target.HttpTarget.testInteraction(HttpTarget.kt:73)
	at au.com.dius.pact.provider.junit.InteractionRunner$interactionBlock$statement$1.evaluate(InteractionRunner.kt:205)
	at au.com.dius.pact.provider.junit.RunStateChanges.evaluate(RunStateChanges.kt:17)
	at au.com.dius.pact.provider.junit.InteractionRunner.run(InteractionRunner.kt:146)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:137)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:51)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
	at java.net.PlainSocketImpl.connect(Unknown Source)
	at java.net.SocksSocketImpl.connect(Unknown Source)
	at java.net.Socket.connect(Unknown Source)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:75)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:142)
	... 30 more

```

# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Fri Aug 14 11:02:29 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;&nbsp;&nbsp;<span style='color: red'>Request Failed - Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect</span>

```
org.apache.http.conn.HttpHostConnectException: Connect to localhost:9080 [localhost/127.0.0.1, localhost/0:0:0:0:0:0:0:1] failed: Connection refused: connect
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:156)
	at org.apache.http.impl.conn.PoolingHttpClientConnectionManager.connect(PoolingHttpClientConnectionManager.java:374)
	at org.apache.http.impl.execchain.MainClientExec.establishRoute(MainClientExec.java:393)
	at org.apache.http.impl.execchain.MainClientExec.execute(MainClientExec.java:236)
	at org.apache.http.impl.execchain.ProtocolExec.execute(ProtocolExec.java:186)
	at org.apache.http.impl.execchain.RetryExec.execute(RetryExec.java:89)
	at org.apache.http.impl.execchain.RedirectExec.execute(RedirectExec.java:110)
	at org.apache.http.impl.client.InternalHttpClient.doExecute(InternalHttpClient.java:185)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)
	at org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:108)
	at au.com.dius.pact.provider.ProviderClient.executeRequest(ProviderClient.kt:220)
	at au.com.dius.pact.provider.ProviderClient.makeRequest(ProviderClient.kt:216)
	at au.com.dius.pact.provider.ProviderVerifierBase.verifyResponseFromProvider(ProviderVerifier.kt:506)
	at au.com.dius.pact.provider.junit.target.HttpTarget.testInteraction(HttpTarget.kt:73)
	at au.com.dius.pact.provider.junit.InteractionRunner$interactionBlock$statement$1.evaluate(InteractionRunner.kt:205)
	at au.com.dius.pact.provider.junit.InteractionRunner.run(InteractionRunner.kt:146)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:137)
	at au.com.dius.pact.provider.junit.PactRunner.runChild(PactRunner.kt:51)
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363)
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)
Caused by: java.net.ConnectException: Connection refused: connect
	at java.net.DualStackPlainSocketImpl.connect0(Native Method)
	at java.net.DualStackPlainSocketImpl.socketConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.doConnect(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connectToAddress(Unknown Source)
	at java.net.AbstractPlainSocketImpl.connect(Unknown Source)
	at java.net.PlainSocketImpl.connect(Unknown Source)
	at java.net.SocksSocketImpl.connect(Unknown Source)
	at java.net.Socket.connect(Unknown Source)
	at org.apache.http.conn.socket.PlainConnectionSocketFactory.connectSocket(PlainConnectionSocketFactory.java:75)
	at org.apache.http.impl.conn.DefaultHttpClientConnectionOperator.connect(DefaultHttpClientConnectionOperator.java:142)
	... 29 more

```

# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Fri Aug 14 11:04:44 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5679, manufacturerName -> Hp, manufacturerAddress -> Mumbai, productsList -> List(Map(productId -> 1009, productName -> pro book, productType -> Laptop, price -> 83000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5679",
-            "manufacturerName": "Hp",
-            "manufacturerAddress": "Mumbai",
-            "productsList": [
-                {
-                    "productId": "1009",
-                    "productName": "pro book",
-                    "productType": "Laptop",
-                    "price": 83000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-08-14T05:34:46.374+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/Hp"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Fri Aug 14 11:04:48 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:red'>FAILED</span>)

```
expected status of 200 but was 500
```

&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:red'>FAILED</span>)  

| Path | Failure |
| ---- | ------- |
|$|Expected manufacturerVOs=List(Map(manufacturerId -> 5678, manufacturerName -> Apple, manufacturerAddress -> Bangalore, productsList -> List(Map(productId -> 1007, productName -> Apple Mack book Pro, productType -> Laptop, price -> 90000.0), Map(productId -> 1008, productName -> mack book Air, productType -> Laptop, price -> 75000.0)))) but was missing|

Diff:

```diff
{
-    "manufacturerVOs": [
-        {
-            "manufacturerId": "5678",
-            "manufacturerName": "Apple",
-            "manufacturerAddress": "Bangalore",
-            "productsList": [
-                {
-                    "productId": "1007",
-                    "productName": "Apple Mack book Pro",
-                    "productType": "Laptop",
-                    "price": 90000.0
-                },
-                {
-                    "productId": "1008",
-                    "productName": "mack book Air",
-                    "productType": "Laptop",
-                    "price": 75000.0
-                }
-            ]
-        }
-    ]
+    "timestamp": "2020-08-14T05:34:48.331+0000",
+    "status": 500,
+    "error": "Internal Server Error",
+    "message": "No value present",
+    "path": "/app/manufacturers/name/Apple"
}
```


# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Fri Aug 14 11:09:29 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

Given **HP**  
get product list by HP  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  
# EcommereceProvider

| Description    | Value |
| -------------- | ----- |
| Date Generated | Fri Aug 14 11:09:32 IST 2020 |
| Pact Version   | 3.6.14 |

## Verifying a pact between _myconsumer_ and _EcommereceProvider_

get Product list by Apple  
&nbsp;&nbsp;returns a response which  
&nbsp;&nbsp;&nbsp;&nbsp;has status code **200** (<span style='color:green'>OK</span>)  
&nbsp;&nbsp;&nbsp;&nbsp;has a matching body (<span style='color:green'>OK</span>)  

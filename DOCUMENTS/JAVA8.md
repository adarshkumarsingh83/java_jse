# JAVA 8 

---

### Programming Language 
* Lambda Expressions
* Method references provide easy-to-read lambda expressions for methods that already have a name.
* Default methods enable new functionality to be added to the interfaces of libraries and ensure binary compatibility with code written for older versions of those interfaces.
* Repeating Annotations provide the ability to apply the same annotation type more than once to the same declaration or type use.
* Type Annotations provide the ability to apply an annotation anywhere a type is used, not just on a declaration. Used with a pluggable type system, this feature enables improved type checking of your code.

### Collections
* Performance Improvement for HashMaps with Key Collisions
* Classes in the new java.util.stream package provide a Stream API to support functional-style operations on streams of elements. The Stream API is integrated into the Collections API, which enables bulk operations on collections, such as sequential or parallel map-reduce transformations.


### Security
* Client-side TLS 1.2 enabled by default
* New variant of AccessController.doPrivileged that enables code to assert a subset of its privileges, without preventing the full traversal of the stack to check for other permissions
* Stronger algorithms for password-based encryption
* SSL/TLS Server Name Indication (SNI) Extension support in JSSE Server
* Support for AEAD algorithms: The SunJCE provider is enhanced to support AES/GCM/NoPadding cipher implementation as well as GCM algorithm parameters. And the SunJSSE provider is enhanced to support AEAD mode based cipher suites. See Oracle Providers Documentation, JEP 115.
* KeyStore enhancements, including the new Domain KeyStore type java.security.DomainLoadStoreParameter, and the new command option -importpassword for the keytool utility
* SHA-224 Message Digests
* Enhanced Support for NSA Suite B Cryptography
* Better Support for High Entropy Random Number Generation
* New java.security.cert.PKIXRevocationChecker class for configuring revocation checking of X.509 certificates
* 64-bit PKCS11 for Windows
* New rcache Types in Kerberos 5 Replay Caching
* Support for Kerberos 5 Protocol Transition and Constrained Delegation
* Kerberos 5 weak encryption types disabled by default
* Unbound SASL for the GSS-API/Kerberos 5 mechanism
* SASL service for multiple host names
* JNI bridge to native JGSS on Mac OS X
* Support for stronger strength ephemeral DH keys in the SunJSSE provider
* Support for server-side cipher suites preference customization in JSSE

### Internationalization
* Unicode Enhancements, including support for Unicode 6.2.0
* Adoption of Unicode CLDR Data and the java.locale.providers System Property
* New Calendar and Locale APIs
* Ability to Install a Custom Resource Bundle as an Extension

### Concurrency
* Classes and interfaces have been added to the java.util.concurrent package.
* Methods have been added to the java.util.concurrent.ConcurrentHashMap class to support aggregate operations based on the newly added streams facility and lambda expressions.
* Classes have been added to the java.util.concurrent.atomic package to support scalable updatable variables.
* Methods have been added to the java.util.concurrent.ForkJoinPool class to support a common pool.
* The java.util.concurrent.locks.StampedLock class has been added to provide a capability-based lock with three modes for controlling read/write access.


### JDBC
* The JDBC-ODBC Bridge has been removed.
* JDBC 4.2 introduces new features.


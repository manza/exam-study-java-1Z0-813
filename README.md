# 1Z0-813 Java Certification Annotations
Exam 1Z0-813 for upgrading to Java 8 OCP certification

Official Link: https://education.oracle.com/pt_BR/upgrade-to-java-se-8-ocp/pexam_1Z0-813

Official Link Study Guide: https://docs.oracle.com/javase/tutorial/extra/certification/javase-8-upgrade.html#language6

# Exam Topics

## Language Enhancements
(done) - Develop code that uses String objects in the switch statement, binary literals, and numeric literals, including underscores in literals
(done) - Develop code that uses try-with-resources statements, including using classes that implement the AutoCloseable interface
(done) - Develop code that handles multiple Exception types in a single catch block
(done) - Use static and default methods of an interface including inheritance rules for a default method
       - Checked how to use it in Kathy Sierra also

## Localization
(done) - Describe the advantages of localizing an application and developing code that defines, reads, and sets the locale with a Locale object
(done) - Build a resource bundle for a locale and call a resource bundle from an application
(done) - Create and manage date- and time-based events by using LocalDate, LocalTime, LocalDateTime, Instant, Period, and Duration, including a combination of date and time in a single object
(done) - Format dates, numbers, and currency values for localization with the NumberFormat and DateFormat classes, including number and date format patterns
(done) - Work with dates and times across time zones and manage changes resulting from daylight savings

## Lambda
(done) - Define and write functional interfaces and describe the interfaces of the java.util.function package
(done) - Describe a lambda expression; refactor the code that uses an anonymous inner class to use a lambda expression; describe type inference and target typing
(done) - Develop code that uses the built-in interfaces included in the java.util.function package, such as Function, Consumer, Supplier, UnaryOperator, Predicate, and Optional APIs, including the primitive and binary variations of the interfaces
- Develop code that uses a method reference, including refactoring a lambda expression to a method reference

## Java Streams
- Describe the Stream interface and pipelines; create a stream by using the Arrays.stream() and  IntStream.range() methods; identify the lambda operations that are lazy
- Develop code that uses parallel streams, including decomposition operation and reduction operation in streams

## Concurrency
- Use classes from the java.util.concurrent package including CyclicBarrier and CopyOnWriteArrayList with a focus on the advantages over and differences from the traditional java.util collections
- Use Lock, ReadWriteLock, and ReentrantLock classes in the java.util.concurrent.locks and java.util.concurrent.atomic packages to support lock-free thread-safe programming on single variables
- Use Executor, ExecutorService, Executors, Callable, and Future to execute tasks using thread pools
- Use the parallel Fork/Join Framework

## Java File I/O (NIO.2)
(done) - Operate on file and directory paths by using the Paths class
(done) - Check, delete, copy, or move a file or directory by using the Files class
(done) - Recursively access a directory tree by using the DirectoryStream and FileVisitor interfaces
(done) - Find a file by using the PathMatcher interface, and use Java SE 8 I/O improvements, including Files.find(), Files.walk(), and lines() methods
(done) - Observe the changes in a directory by using the WatchService interface

## Java Collections
- Develop code that uses diamond with generic declarations
- Develop code that iterates a collection, filters a collection, and sorts a collection by using lambda expressions
- Search for data by using methods, such as findFirst(), findAny(), anyMatch(), allMatch(), and noneMatch()
- Perform calculations on Java Streams by using count, max, min, average, and sum methods and save results to a collection by using the collect method and Collector class, including the averagingDouble, groupingBy, joining, partitioningBy methods
- Develop code that uses Java SE 8 collection improvements, including the Collection.removeIf(), List.replaceAll(), Map.computeIfAbsent(), and Map.computeIfPresent() methods
- Develop  code that uses the merge(), flatMap(), and map() methods on Java Streams
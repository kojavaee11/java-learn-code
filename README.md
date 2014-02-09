# java-learn-code
===============

## java网络编程示例
* src/net/*

## java设计模式示例
* src/design/*

## Java 7 Fork/Join 框架

### 介绍
随着多核芯片逐渐成为主流，大多数软件开发人员不可避免地需要了解并行编程的知识。而同时，主流程序语言正在将越来越多的并行特性合并到标准库或者语言本身之中。我们可以看到，JDK 在这方面同样走在潮流的前方。在 JDK 标准版 5 中，由 Doug Lea 提供的并行框架成为了标准库的一部分（JSR-166）。随后，在 JDK 6 中，一些新的并行特性，例如并行 collection 框架，合并到了标准库中（JSR-166x）。直到今天，尽管 Java SE 7 还没有正式发布，一些并行相关的新特性已经出现在 JSR-166y 中：

* Fork/Join 模式；
* TransferQueue，它继承自 BlockingQueue 并能在队列满时阻塞“生产者”；
* ArrayTasks/ListTasks，用于并行执行某些数组/列表相关任务的类；
* IntTasks/LongTasks/DoubleTasks，用于并行处理数字类型数组的工具类，提供了排序、查找、求和、求最小值、求最大值等功能；

其中，对 Fork/Join 模式的支持可能是对开发并行软件来说最通用的新特性。在 JSR-166y 中，Doug Lea 实现 ArrayTasks/ListTasks/IntTasks/LongTasks/DoubleTasks 时就大量的用到了 Fork/Join 模式。读者还需要注意一点，因为 JDK 7 还没有正式发布，因此本文涉及到的功能和发布版本有可能不一样。
Fork/Join 模式有自己的适用范围。如果一个应用能被分解成多个子任务，并且组合多个子任务的结果就能够获得最终的答案，那么这个应用就适合用 Fork/Join 模式来解决。图 1 给出了一个 Fork/Join 模式的示意图，位于图上部的 Task 依赖于位于其下的 Task 的执行，只有当所有的子任务都完成之后，调用者才能获得 Task 0 的返回结果。


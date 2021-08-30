1 Around 做性能统计最好了，测试, 监听所有组件的声明周期函数的时间, 上报(稳定上报的组件)
 ProceedingJoinPoint joinPoint

2 三方lib奔溃处理, 这里还有混淆


编译插桩使用场景:

代码生成： apt 生成的代码 ，例如  Dagger, ButterKnifer

代码监控: 网络监控，耗电监控，
  性能监控(包括第三方的library库,注意是没有源码的哦)

代码修改:  修改第三方的library库的源码，注意是没有源码的哦
           监控 new Thread(),(未实践)
           权限控制
           效能：效率和性能

javac Sample.java
javap -v Sample.class 查看java字节码(有单独的常量池)

dx 将 class文件变成 dex 文件(constant pool 常量池不见了，公用的常量池)，作用就是体积减少了
dx --dex --output=Sample.dex Sample.class
反编译dex文件
dexdump -d Sample.dex

AspectJ 能力:
在方法体(包括构造方法)内部，方法被调用的地方 (包括构造方法) 的前后插入代码
execution
call:

异常处理前后 round呗， try catch

在读写变量的位置，在静态代码块内部插入自定义的代码  (未实践)

360

自定义onXXXX函数也会匹配，白名单如何实现

第7期  启动耗时测试

@Before("execution(* **(..))")
public void before(JoinPoint joinPoint) {
    Trace.beginSection(joinPoint.getSignature().toString());
}

@After("execution(* **(..))")
public void after() {
    Trace.endSection();
}

现在最重要的是切面，也就是切点规则的编写

1 application create 的时间 执行时间，测试
2 第七期的例子练习
3 即刻时间的两篇文章，练习
4 参考 360 ArgusAPM











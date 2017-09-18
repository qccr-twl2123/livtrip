### Builder模式
```
定义:
将一个“复杂对象的构建算法”与它的“部件及组装方式”分离，
使得构件算法和组装方式可以独立应对变化；复用同样的构建算法可以创建不同的表示，
不同的构建过程可以复用相同的部件组装方式。

应用场景:
链式编程
需要动态构建一个对象


```

### Builder模式几种实现方式

#### 父类实现方案
```
经典案例:StringBuilder,StringBuffer
eg:
    StringBuilder sb = new StringBuilder();
    sb.append("ab").append("cd");
代码解析:
子类:
@Override
public StringBuilder append(String str) {
    super.append(str);
    return this;
}

父类:

char[] value;
int count;

public AbstractStringBuilder append(String str) {
        if (str == null)
            return appendNull();
        int len = str.length();
        ensureCapacityInternal(count + len);
        str.getChars(0, len, value, count);
        count += len;
        return this;
}

由此可以看出子类append方法是将值赋值给父类的数组;

```




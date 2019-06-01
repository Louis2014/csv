package com.github.houbb.csv.api;

/**
 * @author binbin.hou
 * @since 1.0.0
 */
public interface IReadContext<T> {

    /**
     * 文件编码
     * @return 文件编码
     */
    String charset();

    /**
     * 排序方式
     * @return 排序方式
     */
    ISort sort();

    /**
     * 文件路径
     * @return 文件路径
     */
    String path();

    /**
     * 读取的类型
     * @param <T> 泛型
     * @return 类型
     */
    Class<T> readClass();

    /**
     * 开始的下标
     * 备注：参见 {@link java.io.RandomAccessFile} 随机读写文件
     * @return 开始的下标
     */
    int startIndex();

    /**
     * 结束的下标
     * @return 结束的下标
     */
    int endIndex();

}

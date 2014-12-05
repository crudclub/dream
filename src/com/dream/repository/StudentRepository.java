package com.dream.repository;

import org.springframework.data.repository.CrudRepository;

import com.dream.domain.Student;


/**
 * @author dsy
 *
 *　　 可以使用的仓库接口有：
　　　　Repository：是 Spring Data的一个核心接口，它不提供任何方法，开发者需要在自己定义的接口中声明需要的方法。
　　　　CrudRepository： 继承Repository，提供增删改查方法，可以直接调用。
　　　　PagingAndSortingRepository： 继承CrudRepository，具有分页查询和排序功能
　　　　JpaRepository： 继承PagingAndSortingRepository，针对JPA技术提供的接口
　　　　JpaSpecificationExecutor：可以执行原生SQL查询
 */
public interface StudentRepository extends CrudRepository<Student,Integer> {

}

package com.company.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {


    //1数组类型的属性
    private String[] course;

    //2list集合类型属性
    private List<String> list;

    //3.map集合类型
    private Map<String,String> maps;

    //4set集合类型
    private Set<String> sets;

    //学生所学多门课程
    private List<Courses> coursesList;

    public void setCoursesList(List<Courses> coursesList) {
        this.coursesList = coursesList;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void test(){
        System.out.println(Arrays.toString(course));
        System.out.println(list);
        System.out.println(maps);
        System.out.println(sets);
        System.out.println(coursesList);
    }
}

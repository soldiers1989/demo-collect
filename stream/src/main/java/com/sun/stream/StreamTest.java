package com.sun.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class StreamTest {


    public static void main(String[] args) {
        //testFilter();

        //testMap();

        testCollectors();
    }


    public static void testFilter(){

        /**
         * 测试filter： 遍历数据并检查其中的元素时使用
         * filter接收一个函数为参数，该函数用lambda表达式表示
         */

        // 获取性别为男的
        List<PersonModel> result = Data.getData()
                .stream()
                .filter(personModule -> "男".equals(personModule.getDesc()))
                .collect(toList());

        System.out.println(result);

        // 多条件判断
        List<PersonModel> result02 = Data.getData()
                .stream()
                .filter(p -> {
                    if(p.getAge() > 20 && "男".equals(p.getDesc())) return true;
                    return false;
                }).collect(toList());

        System.out.println(result02);

        //

    }

    public static void testMap(){
        /**
         * Map 测试
         * 1、map 生成的是一个一对一的映射，for的作用
         * 2、常用且简单
         */

        // 取出所有用户名字
        List<String> names = Data.getData()
                .stream()
                .map(person -> person.getName())
                .collect(toList());
        System.out.println(names);

        List<String> parllNames = Data.getData()
                .parallelStream()
                .map(person -> person.getName())
                .collect(toList());
        System.out.println(parllNames);

        // 论点：是1对1的，单个元素处理后返回
        List<PersonModel> name02 = Data.getData()
                .stream()
                .map(p -> {
                    return new PersonModel("",0,"");
                })
                .collect(toList());
        System.out.println(name02);

    }

    public static void testCollectors(){
        // toList
        List<String> collectList = Data.getData().stream()
                .map(PersonModel::getName)
                .collect(Collectors.toList());

        System.out.println("toList : " + collectList);

        // toSet
        Set<String> collectSet = Data.getData().stream()
                .map(PersonModel::getName)
                .collect(Collectors.toSet());

        System.out.println("toSet : " + collectSet);

        // toMap
        // toMap 需要定义好自行的获取结构信息
        Map<String, Integer> collect = Data.getData().stream()
                .collect(
                        Collectors.toMap(PersonModel::getName, PersonModel::getAge)
                );

        Data.getData().stream()
                .collect(Collectors.toMap(per->per.getName(), value->{
                    return value+"1";
                }));


    }

    public static void testOptional(){
//        PersonModel personModel=new PersonModel();
//
//        //对象为空则打出 -
//        Optional<Object> o = Optional.of(personModel);
//        System.out.println(o.isPresent()?o.get():"-");
//
//        //名称为空则打出 -
//        Optional<String> name = Optional.ofNullable(personModel.getName());
//        System.out.println(name.isPresent()?name.get():"-");
//
//        //如果不为空，则打出xxx
//        Optional.ofNullable("test").ifPresent(na->{
//            System.out.println(na+"ifPresent");
//        });
//
//        //如果空，则返回指定字符串
//        System.out.println(Optional.ofNullable(null).orElse("-"));
//        System.out.println(Optional.ofNullable("1").orElse("-"));
//
//        //如果空，则返回 指定方法，或者代码
//        System.out.println(Optional.ofNullable(null).orElseGet(()->{
//            return "hahah";
//        }));
//        System.out.println(Optional.ofNullable("1").orElseGet(()->{
//            return "hahah";
//        }));
//
//        //如果空，则可以抛出异常
//        System.out.println(Optional.ofNullable("1").orElseThrow(()->{
//            throw new RuntimeException("ss");
//        }));


////        Objects.requireNonNull(null,"is null");
//
//
//        //利用 Optional 进行多级判断
//        EarthModel earthModel1 = new EarthModel();
//        //old
//        if (earthModel1!=null){
//            if (earthModel1.getTea()!=null){
//                //...
//            }
//        }
//        //new
//        Optional.ofNullable(earthModel1)
//                .map(EarthModel::getTea)
//                .map(TeaModel::getType)
//                .isPresent();
//
//
//        //判断对象中的list
//        Optional.ofNullable(new EarthModel())
//                .map(EarthModel::getPersonModels)
//                .map(pers->pers
//                        .stream()
//                        .map(PersonModel::getName)
//                        .collect(toList()))
//                .ifPresent(per-> System.out.println(per));
//
//
//        List<PersonModel> models=Data.getData();
//        Optional.ofNullable(models)
//                .map(per -> per
//                        .stream()
//                        .map(PersonModel::getName)
//                        .collect(toList()))
//                .ifPresent(per-> System.out.println(per));

    }



}

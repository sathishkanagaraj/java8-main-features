package com.example.demo.behaviour_param;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by sk on 02/09/21.
 */
public class BehaviourParam {

    public List<Apple> filterApples(ApplePredicate p, List<Apple> apples) {
        return apples.stream().filter(p::apply).collect(Collectors.toList());
    }

    /**
     * The above filterApples method is flexible but verbose , lambda gives flexibility and concise.
     */

    public List<Apple> usingLambdaFilterGreenApples(List<Apple> apples){
        return filterApples((Apple a)-> "green".equals(a.getColour()), apples);
    }

    /**
     * Using Generic Predicate you can pass any object gives you more flexibility and conciseness.
     */
    public <T>List<T> genericFilterUsingLambda(GenericPredicate<T> p, List<T> t){
        return t.stream().filter(p::apply).collect(Collectors.toList());
    }

}

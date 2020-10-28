package com.rakovets.course.javabasics.practice.generics.Pair;

public final class PairUtil<K, V> {
        public Pair<V, K> swap (Pair < K, V > pair){
            return new Pair<>(pair.getValue(), pair.getKey());
        }

}

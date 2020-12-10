package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HeterogeneousTypeHolder {


        private Map<Class<?>, Object> favorites = new
                HashMap<>();

        public <T> void putFavorite(Class<T> type, T
                instance) {
            favorites.put(Objects.requireNonNull(type),
                    instance);
        }

        public <T> T getFavorite(Class<T> type) {
            return type.cast(favorites.get(type));
        }

    public static void main(String[] args) {
        HeterogeneousTypeHolder obj=new HeterogeneousTypeHolder();
        obj.putFavorite(String.class,"prakash");
        obj.putFavorite(Integer.class,28);

        System.out.println("name "+ obj.getFavorite(String.class));

    }
}

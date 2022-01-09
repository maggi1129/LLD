package com.bosscoder;

import java.util.List;
import java.util.Map;

public class SearchServiceImpl implements SearchService{
    Map<String, List<Member>> memberByNameMap;


    @Override
    public List<Member> searchByName(String name) {
        return memberByNameMap.get(name);
    }
}

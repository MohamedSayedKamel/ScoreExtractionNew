package com.alrajhi.score.ScoreExtraction.dto;

import java.util.HashMap;
import java.util.Map;

import com.experian.stratman.datasources.runtime.IData;

public class DataArea implements IData {

    public DataArea(String layoutName) {
        layoutName_ = layoutName;
        areaContents_ = new HashMap();
    }

    public String getLayout() {
        return layoutName_;
    }


    public Object getValue(String name) {
        return areaContents_.get(name);
    }

    public void setValue(String name, Object value) {
        areaContents_.put(name, value);
    }

    String layoutName_;
    Map areaContents_;

}
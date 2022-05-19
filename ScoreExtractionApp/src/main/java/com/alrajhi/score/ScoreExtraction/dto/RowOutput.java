package com.alrajhi.score.ScoreExtraction.dto;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class RowOutput {

    private List < String > outputHeaders;
    private List < String > rowData;
    private Map < String, Object > outputMap;

}
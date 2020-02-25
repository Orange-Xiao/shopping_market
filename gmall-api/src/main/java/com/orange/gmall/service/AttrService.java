package com.orange.gmall.service;


import com.orange.gmall.bean.PmsBaseAttrInfo;
import com.orange.gmall.bean.PmsBaseAttrValue;
import com.orange.gmall.bean.PmsBaseSaleAttr;

import java.util.List;


public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(String attrId);

    List<PmsBaseSaleAttr> baseSaleAttrList();
}

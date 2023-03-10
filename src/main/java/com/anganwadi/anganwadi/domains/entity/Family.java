package com.anganwadi.anganwadi.domains.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "Family")
public class Family extends BaseObject {


    private String houseNo;
    private String uniqueIdType;
    private String uniqueId;
    private String religion;
    private String familyId;
    private String centerId;
    private String memberId;
    private String category;
    private String isMinority;
    private String icdsService;
    private String totalMembers;
}


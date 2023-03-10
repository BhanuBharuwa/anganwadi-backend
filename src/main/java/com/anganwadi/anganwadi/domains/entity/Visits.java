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
@Document(collection = "Visits")
public class Visits  extends BaseObject{


    private String familyId;
    private String visitType;
    private String visitFor;
    private String visitRound;
    private String description;
    private String visitDateTime;
    private String latitude;
    private String longitude;
}

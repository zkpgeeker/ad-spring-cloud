package github.zkpgeeker.ad.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @description:
 * @author: ZKP
 * @time: 2023/1/25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AdUnitDistrictRequest {

    private List<UnitDistrict> unitDistricts;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UnitDistrict {

        private Long unitId;

        private String province;

        private String city;
    }
}

package com.odeyalo.support.clients.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserSubscriptionUpdatedDTO {
    private String userId;
    private SubscriptionPlan plan;


    public enum SubscriptionPlan {
        FREE("FREE"),
        PREMIUM("PREMIUM");

        private final String plan;

        SubscriptionPlan(String plan) {
            this.plan = plan;
        }


        public String getPlan() {
            return plan;
        }
    }
}

package com.blink;

class GetPlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }

        else if (planType.equalsIgnoreCase("InstitutionalPlan")) {
            return new InstitutionalPlan();
        }

        else if (planType.equalsIgnoreCase("CommercialPlan")) {
            return new CommercialPlan();
        }
        return null;
    }
}

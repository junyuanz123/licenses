package com.zjunyuan.licenses.controllers;

import com.zjunyuan.licenses.models.License;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="v1/organizations/{organizationId}/licenses")
public class LicenseServiceController {
    @RequestMapping(value="/{licensedId}",method = RequestMethod.GET)
    License getLicenses(@PathVariable("organizationId") String organizationId, @PathVariable("licensedId") String licensedId) {
        return new License()
                .withId(licensedId)
                .withProductName("Teleco")
                .withLicenseType("Seat")
                .withOrganizationId("TestOrg");
    }
}

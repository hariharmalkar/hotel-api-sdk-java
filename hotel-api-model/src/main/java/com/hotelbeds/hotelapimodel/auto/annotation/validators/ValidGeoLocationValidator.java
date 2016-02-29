/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.annotation.validators;

/*
 * #%L
 * HotelAPI Model
 * %%
 * Copyright (C) 2015 - 2016 HOTELBEDS TECHNOLOGY, S.L.U.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.hotelbeds.hotelapimodel.auto.model.GeoLocation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ValidGeoLocationValidator implements ConstraintValidator<ValidGeoLocation, GeoLocation> {
    @Override
    public void initialize(ValidGeoLocation constraintAnnotation) {
        // empty method
    }

    @Override
    public boolean isValid(GeoLocation geoLocation, ConstraintValidatorContext context) {
        boolean result = false;
        if (geoLocation.getRadius() != null && geoLocation.getUnit() != null && geoLocation.getSecondaryLongitude() == null
            && geoLocation.getSecondaryLatitude() == null) {
            result = true;
        } else if (geoLocation.getSecondaryLongitude() != null && geoLocation.getSecondaryLatitude() != null && geoLocation.getRadius() == null
            && geoLocation.getUnit() == null) {
            result = true;
        }
        if (!result) {
            log.info("Some required value in geolocation are empty, geolocation: {}", geoLocation);
        }
        return result;
    }
}
